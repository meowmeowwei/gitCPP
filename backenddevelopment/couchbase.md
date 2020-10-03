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

