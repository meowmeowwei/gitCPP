---
description: 'https://www.geeksforgeeks.org/tcp-3-way-handshake-process/'
---

# TCP 3 way handshake

![](../../../.gitbook/assets/image%20%2866%29.png)

![](../../../.gitbook/assets/image%20%2822%29.png)



* **Step 1 \(SYN\) :** In the first step, client wants to establish a connection with server, so it sends a segment with SYN\(Synchronize Sequence Number\) which informs server that client is likely to start communication and with what sequence number it starts segments with
* **Step 2 \(SYN + ACK\):** Server responds to the client request with SYN-ACK signal bits set. Acknowledgement\(ACK\) signifies the response of segment it received and SYN signifies with what sequence number it is likely to start the segments with
* **Step 3 \(ACK\) :** In the final part client acknowledges the response of server and they both establish a reliable connection with which they will start the actual data transfer

  The steps 1, 2 establish the connection parameter \(sequence number\) for one direction and it is acknowledged. The steps 2, 3 establish the connection parameter \(sequence number\) for the other direction and it is acknowledged. With these, a full-duplex communication is established.

  **Note –** Initial sequence numbers are randomly selected while establishing connections between client and server.



\*\*\*\*[**why must it be 3 way handshakes why not 2 way handshakes ?**](https://networkengineering.stackexchange.com/questions/24068/why-do-we-need-a-3-way-handshake-why-not-just-2-way)\*\*\*\*

**t**he short answer is because a two way handshake would only allow one party to establish an ISN, and the other party to acknowledge it. Which means only one party can send data.But TCP is a bi-directional communication protocol, which means either end ought to be able to send data reliably. Both parties need to establish an ISN, and both parties need to acknowledge the other's ISN

