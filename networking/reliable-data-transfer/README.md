---
description: >-
  https://www.geeksforgeeks.org/difference-between-stop-and-wait-gobackn-and-selective-repeat/
---

# Reliable Data Transfer

[1\) Stop and Wait](https://www.geeksforgeeks.org/stop-and-wait-arq/)

The sender sends the packet and waits for the ACK \(acknowledgement\) of the packet. Once the ACK reaches the sender, it transmits the next packet in row. If the ACK is not received, it re-transmits the previous packet again.

[2\) Go Back N](https://app.gitbook.com/@sun-wei-9/s/workspace/networking/reliable-data-transfer/go-back-n)

The sender sends N packets which is equal to the window size. Once the entire window is sent, the sender then waits for a cumulative ACK to send more packets. On the receiver end, it receives only in-order packets and discards out-of-order packets. As in case of packet loss, the entire window would be re-transmitted.

3\) Selective Repeat

The sender sends packet of window size N and the receiver acknowledges all packet whether they were received in order or not. In this case, the receiver maintains a buffer to contain out-of-order packets and sorts them.The sender selectively re-transmits the lost packet and moves the window forward.

