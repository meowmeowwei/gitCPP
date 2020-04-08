---
description: 'https://www.geeksforgeeks.org/tcp-connection-termination/'
---

# TCP 4 way goodbye termination

![](../../../.gitbook/assets/image%20%28151%29.png)



1. **Step 1 \(FIN From Client\) –** Suppose that the client application decides it wants to close the connection. \(Note that the server could also choose to close the connection\). This causes the client send a TCP segment with the **FIN** bit set to **1** to server and to enter the **FIN\_WAIT\_1** state. While in the **FIN\_WAIT\_1** state, the client waits for a TCP segment from the server with an acknowledgment \(ACK\).
2. **Step 2 \(ACK From Server\) –** When Server received FIN bit segment from Sender \(Client\), Server Immediately send acknowledgement \(ACK\) segment to the Sender \(Client\).
3. **Step 3 \(Client waiting\) –** While in the **FIN\_WAIT\_1** state, the client waits for a TCP segment from the server with an acknowledgment. When it receives this segment, the client enters the **FIN\_WAIT\_2** state. While in the **FIN\_WAIT\_2** state, the client waits for another segment from the server with the FIN bit set to 1.
4. **Step 4 \(FIN from Server\) –** Server sends FIN bit segment to the Sender\(Client\) after some time when Server send the ACK segment \(because of some closing process in the Server\).
5. **Step 5 \(ACK from Client\) –** When Client receive FIN bit segment from the Server, the client acknowledges the server’s segment and enters the **TIME\_WAIT** state. The **TIME\_WAIT** state lets the client resend the final acknowledgment in case the **ACK** is lost.The time spent by client in the **TIME\_WAIT** state is depend on their implementation, but their typical values are 30 seconds, 1 minute, and 2 minutes. After the wait, the connection formally closes and all resources on the client side \(including port numbers and buffer data\) are released.



[why do we need Time\_Wait ?](http://www.serverframework.com/asynchronousevents/2011/01/time-wait-and-its-design-implications-for-protocols-and-scalable-servers.html)

to distinguish connection between old and new segment

