---
description: 'https://www.geeksforgeeks.org/stop-and-wait-arq/'
---

# Stop and Wait

The sender sends the packet and waits for the ACK \(acknowledgement\) of the packet. Once the ACK reaches the sender, it transmits the next packet in row. If the ACK is not received, it re-transmits the previous packet again.



**1\) Naive Way \(Send and receive with Ack\)**

**Sender:**

Rule 1\) Send one data packet at a time.  
Rule 2\) Send next packet only after receiving acknowledgement for previous.

**Receiver:**

Rule 1\) Send acknowledgement after receiving and consuming of data packet.  
Rule 2\) After consuming packet acknowledgement need to be sent \(Flow Control\)



issue -&gt; packet drop, delay ack which may be confusing

**2\) Stop and Wait ARQ \(Automatic Repeat Request\)**

a\) Time Out

![](../../.gitbook/assets/image%20%28151%29.png)

b\) Sequence number \(Data\)

![](../../.gitbook/assets/image%20%28138%29.png)

c\) Delay Acknowledgement 

This is resolved by introducing sequence number for acknowledgement also.



![](../../.gitbook/assets/image%20%2845%29.png)

**Characteristics of Stop and Wait ARQ:**

* It uses link between sender and receiver as half duplex link
* Throughput = 1 Data packet/frame per  RTT
* If Bandwidth\*Delay product is very high, then stop and wait protocol is not so useful. The sender has to keep waiting for acknowledgements before sending the processed next packet.
* It is an example for “**Closed Loop OR connection oriented** “ protocols
* It is an special category of SWP where its window size is 1
* Irrespective of number of packets sender is having stop and wait protocol  requires only  2 sequence numbers 0 and 1



