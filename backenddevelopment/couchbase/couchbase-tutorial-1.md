# CouchBase Tutorial

**1\) load json file into couch base** 

suns-iMac:CB110-Data sunwei$ cbimport json -c couchbase://127.0.0.1 -u sunwei -p steven -b couchmusic2 -f lines -d file://couchmusic2-countries.json -t 2 -g %type%::%countryCode% 



JSON `file://couchmusic2-countries.json` imported to `http://127.0.0.1:8091` successfully Documents imported: 258 Documents failed: 0



**2\) Create primary index using global indexing service \(GSI\)**

![](../../.gitbook/assets/image%20%28268%29.png)

**CREATE PRIMARY INDEX ON \`couchmusic2\` USING GSI;**

[purpose of primary index ](https://blog.couchbase.com/primary-uses-for-couchbase-primary-index/)

![](../../.gitbook/assets/image%20%28266%29.png)

**3\) can run in command line also** 

![](../../.gitbook/assets/image%20%28270%29.png)

**4\) search using keys will be very fast \(document id\)**

![](../../.gitbook/assets/image%20%28269%29.png)

**5\) use aliases, concatenate values \(AS, \|\|\) and access document metadata**

![](../../.gitbook/assets/image%20%28267%29.png)

