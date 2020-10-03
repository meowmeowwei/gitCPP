---
description: 'https://dzone.com/articles/couchbase-architecture-deep'
---

# CouchBase



Couchbase is the merge of two popular NOSQL technologies:   


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

