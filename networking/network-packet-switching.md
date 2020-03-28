# network packet switching

router/link layer switch performs store and forward mechanism... wait until the full packet is received then it starts sending the packet out.

**when will packet loss happen ?**

each packet switch has multiple links attached to it... for each attached link, the packet switch has an output buffer \(also called output queue\), which stores packet that router is about to send. if the arriving packet needs to be send but link is busy, it will be put inside the buffer , which is the **queuing delay**. if the buffer is already full, the **packet may be lost** since it can not be added on the buffer. 

