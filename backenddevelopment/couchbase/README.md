---
description: 'https://dzone.com/articles/couchbase-architecture-deep'
---

# CouchBase

NOSQL DB -&gt; can store data in semi structured data , no fixed schema, can store video file , audio binary file



\*\*\*\*[**Feature/Benefits of couchbase**](https://www.youtube.com/watch?v=pV65gLFf0tI)\*\*\*\*

1\) Memory first architecture 

document is first stored in Memory\(Ram\) -&gt; replicated async way to Discs

low latency

2\) distributed database 

![](../../.gitbook/assets/image%20%28258%29.png)

each machine in cluster is a node , data is distributed 

3\) Scalability

4\) Fault Tolerance 

you can define replication factor to see how many copies to retained in the cluster 

5\) Buckets

create each type for a bucket \(e.g. company bucket, employee bucket\)

6\) Bucket to Vbucket 

![](../../.gitbook/assets/image%20%28264%29.png)

7\) can enable compression in RAM 

in the disc is always compressed 

![](../../.gitbook/assets/image%20%28260%29.png)

8\) Expiration

can define at bucket level 



9\) Memory & Storage 

memory first architecture 

![](../../.gitbook/assets/image%20%28259%29.png)

10\) indexing

* Primary Index -&gt; key 
* Secondary Index -&gt; query based on secondary data in the document
* Composite secondary index -&gt; query based on multiple attributes 
* Array Index -&gt; fetch data from array attribute
* Full Text index 

![](../../.gitbook/assets/image%20%28265%29.png)

11\) View 

![](../../.gitbook/assets/image%20%28262%29.png)

12\) architecture on each node within cluster 

* data service -&gt; ram/disc
* index service -&gt; primary , secondary etc
* query service -&gt; N1QL 
* search service -&gt; full text index 
* analytic service -&gt; complex queries , join command etc 

![](../../.gitbook/assets/image%20%28261%29.png)

13\) Limits

* key max is 250 bytes
* value max is 20 mb limit
* number of buckets max -&gt; 10 buckets \(recommended 3 buckets in production\) 
* 


**Couchbase is the merge of two popular NOSQL technologies:**   


* Membase, which provides persistence, replication, sharding to the high performance memcached technology
* CouchDB, which pioneers the document oriented model based on JSON



Like other NOSQL technologies, both Membase and CouchDB are built from the ground up on a highly distributed architecture, with data shard across machines in a cluster. Built around the Memcached protocol, Membase provides an easy migration to existing Memcached users who want to add persistence, sharding and fault resilience on their familiar Memcached model. On the other hand, CouchDB provides first class support for storing JSON documents as well **as a simple RESTful API** to access them. Underneath, CouchDB also has a highly tuned storage engine that is optimized for both update transaction as well as query processing. Taking the best of both technologies, Membase is well-positioned in the NOSQL marketplace.



#### Programming model

Couchbase provides client libraries for different programming languages such as Java / .NET / PHP / Ruby / C / Python / Node.js  
  
For read, Couchbase provides a key-based lookup mechanism where the client is expected to provide the key, and only the server hosting the data \(with that key\) will be contacted.  
  
Couchbase also provides a query mechanism to retrieve data where the client provides a query \(for example, range based on some  secondary key\) as well as the view \(basically the index\).  The query will be broadcasted to all servers in the cluster and the result will be merged and sent back to the client.  
  
For write, Couchbase provides a key-based update mechanism where the client sends in an updated document with the key \(as doc id\).  When handling write request, the server will return to client’s write request as soon as the data is stored in RAM on the active server, which offers the lowest latency for write requests.



```text
//couchbase API

# Get a document by key

doc = get(key)

# Modify a document, notice the whole document 
#   need to be passed in

set(key, doc)

# Modify a document when no one has modified it 
#  since my last read

casVersion = doc.getCas()
cas(key, casVersion, changedDoc)

# Create a new document, with an expiration time 
#   after which the document will be deleted

addIfNotExist(key, doc, timeToLive)

# Delete a document

delete(key)

# When the value is an integer, increment the integer

increment(key)

# When the value is an integer, decrement the integer

decrement(key)

# When the value is an opaque byte array, append more 
#  data into existing value 

append(key, newData)

# Query the data 

results = query(viewName, queryParameters)
```

In Couchbase, document is the unit of manipulation. Currently Couchbase doesn't support server-side execution of custom logic. Couchbase server is basically a passive store and unlike other document oriented DB, Couchbase doesn't support field-level modification. In case of modifying documents, client need to retrieve documents by its key, do the modification locally and then send back the whole \(modified\) document back to the server. This design tradeoff network bandwidth \(since more data will be transferred across the network\) for CPU \(now CPU load shift to client\).

Couchbase currently doesn't support bulk modification based on a condition matching. Modification happens only in a per document basis. \(client will save the modified document one at a time\).



#### Transaction Model

Similar to many NOSQL databases, Couchbase’s transaction model is primitive as compared to RDBMS.  Atomicity is guaranteed at a single document and transactions that span update of multiple documents are unsupported.  To provide necessary isolation for concurrent access, Couchbase provides a CAS \(compare and swap\) mechanism which works as follows …  


* When the client retrieves a document, a **CAS ID** \(equivalent to a revision number\) is attached to it.
* While the client is manipulating the retrieved document locally, another client may modify this document.  When this happens, the CAS ID of the document at the server will be incremented.
* Now, when the original client submits its modification to the server, it can attach the original  CAS ID in its request.  The server will verify this ID with the actual ID in the server.  If they differ, the document has been updated in between and the server will not apply the update.
* The original client will re-read the document \(which now has a newer ID\) and re-submit its modification. 

Couchbase also provides a locking mechanism for clients to coordinate their access to documents.  Clients can request a LOCK on the document it intends to modify, update the documents and then releases the LOCK.  To prevent a deadlock situation, each LOCK grant has a timeout so it will automatically be released after a period of time.

![](../../.gitbook/assets/image%20%28256%29.png)

#### Virtual Buckets

The basic unit of data storage in Couchbase DB is a JSON document \(or primitive data type such as int and byte array\) which is associated with a key.  The overall key space is partitioned into 1024 logical storage unit called "virtual buckets" \(or vBucket\).  vBucket are distributed across machines within the cluster via a map that is shared among servers in the cluster as well as the client library.

High availability is achieved through data replication at the vBucket level.  Currently Couchbase supports one active vBucket zero or more standby replicas hosted in other machines.  Curremtly the standby server are idle and not serving any client request.  In future version of Couchbase, the standby replica will be able to serve read request.  
  
Load balancing in Couchbase is achieved as follows:  


* Keys are uniformly distributed based on the hash function
* When machines are added and removed in the cluster.  The administrator can request a redistribution of vBucket so that data are evenly spread across physical machines.

![](../../.gitbook/assets/image%20%28257%29.png)



#### Management Server

Management server performs the management function and co-ordinate the other nodes within the cluster.  It includes the following monitoring and administration functions  
  
**Heartbeat:** A watchdog process periodically communicates with all member nodes within the same cluster to provide Couchbase Server health updates.  
  
**Process monitor:** This subsystem monitors execution of the local data manager, restarting failed processes as required and provide status information to the heartbeat module.  
  
**Configuration manager:** Each Couchbase Server node shares a cluster-wide configuration which contains the member nodes within the cluster, a vBucket map.  The configuration manager pull this config from other member nodes at bootup time.  
  
Within a cluster, one node’s Management Server will be elected as the leader which performs the following cluster-wide management function  


* Controls the distribution of vBuckets among other nodes and initiate vBucket migration
* Orchestrates the failover and update the configuration manager of member nodes

If the leader node crashes, a new leader will be elected from surviving members in the cluster.  
  
When a machine in the cluster has crashed, the leader will detect that and notify member machines in the cluster that all vBuckets hosted in the crashed machine is dead.  After getting this signal, machines hosting the corresponding vBucket replica will set the vBucket status as “active”.  The vBucket/server map is updated and eventually propagated to the client lib.  Notice that at this moment, the replication level of the vBucket will be reduced.  Couchbase doesn’t automatically re-create new replicas which will cause data copying traffic.  Administrator can issue a command to explicitly initiate a data rebalancing.  The crashed machine, after reboot can rejoin the cluster.  At this moment, all the data it stores previously will be completely discard and the machine will be treated as a brand new empty machine.  
  
As more machines are put into the cluster \(for scaling out\), vBucket should be redistributed to achieve a load balance.  This is currently triggered by an explicit command from the administrator.  Once receive the “rebalance” command, the leader will compute the new provisional map which has the balanced distribution of vBuckets and send this provisional map to all members of the cluster.  
  
To compute the vBucket map and migration plan, the leader attempts the following objectives:  


* Evenly distribute the number of active vBuckets and replica vBuckets among member nodes.
* Place the active copy and each replicas in physically separated nodes.
* Spread the replica vBucket as wide as possible among other member nodes.
* Minimize the amount of data migration
* Orchestrate the steps of replica redistribution so no node or network will be overwhelmed by the replica migration.

Once the vBucket maps is determined, the leader will pass the redistribution map to each member in the cluster and coordinate the steps of vBucket migration.  The actual data transfer happens directly between the origination node to the destination node.  
  
Notice that since we have generally more vBuckets than machines.  The workload of migration will be evenly distributed automatically.  For example, when new machines are added into the clusters, all existing machines will migrate some portion of its vBucket to the new machines.  There is no single bottleneck in the cluster.  
  
Throughput the migration and redistribution of vBucket among servers, the life cycle of a vBucket in a server will be in one of the following states  


* “Active”:  means the server is hosting the vBucket is ready to handle both read and write request
* “Replica”: means the server is hosting the a copy of the vBucket that may be slightly out of date but can take read request that can tolerate some degree of outdate.
* “Pending”: means the server is hosting a copy that is in a critical transitional state.  The server cannot take either read or write request at this moment.
* “Dead”: means the server is no longer responsible for the vBucket and will not take either read or write request anymore.





#### Data Server

Data server implements the memcached APIs such as get, set, delete, append, prepend, etc. It contains the following key datastructure:  


* One in-memory hashtable \(key by doc id\) for the corresponding vBucket hosted.  The hashtable acts as both a metadata for all documents as well as a cache for the document content.  Maintain the entry gives a quick way to detect whether the document exists on disk.
* To support async write, there is a checkpoint linkedlist per vBucket holding the doc id of modified documents that hasn't been flushed to disk or replicated to the replica.

![](../../.gitbook/assets/image%20%28255%29.png)

To handle a "GET" request  


* Data server routes the request to the corresponding ep-engine responsible for the vBucket.
* The ep-engine will lookup the document id from the in-memory hastable.  If the document content is found in cache \(stored in the value of the hashtable\), it will be returned.  Otherwise, a background disk fetch task will be created and queued into the RO dispatcher queue.
* The RO dispatcher then reads the value from the underlying storage engine and populates the corresponding entry in the vbucket hash table.
* Finally, the notification thread notifies the disk fetch completion to the memcached pending connection, so that the memcached worker thread can revisit the engine to process a get request.

To handle a "SET" request,  a success response will be returned to the calling client once the updated document has been put into the in-memory hashtable with a write request put into the checkpoint buffer.  Later on the Flusher thread will pickup the outstanding write request from each checkpoint buffer, lookup the corresponding document content from the hashtable and write it out to the storage engine.  
  
Of course, data can be lost if the server crashes before the data has been replicated to another server and/or persisted.  If the client requires a high data availability across different crashes, it can issue a subsequent observe\(\) call which blocks on the condition  that the server persist data on disk, or the server has replicated the data to another server \(and get its ACK\).  Overall speaking, the client has various options to tradeoff data integrity with throughput.



#### CouchDB Storage Structure

Data server defines an interface where different storage structure can be plugged-in.  Currently it supports both a SQLite DB as well as CouchDB.  Here we describe the details of CouchDb, which provides a super high performance storage mechanism underneath the Couchbase technology.  
  
Under the CouchDB structure, there will be one file per vBucket.  Data are written to this file in an append-only manner, which enables Couchbase to do mostly sequential writes for update, and provide the most optimized access patterns for disk I/O.  This unique storage structure attributes to Couchbase’s fast on-disk performance for write-intensive applications.









