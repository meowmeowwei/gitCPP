---
description: 'https://www.geeksforgeeks.org/sliding-window-protocol-set-3-selective-repeat/'
---

# Selective Repeat

**Why Selective Repeat Protocol?**  
The go-back-n protocol works well if errors are less, but if the line is poor it wastes a lot of bandwidth on retransmitted frames. An alternative strategy, the selective repeat protocol, is to allow the receiver to accept and buffer the frames following a damaged or lost one.

Selective Repeat attempts to retransmit only those packets that are actually lost \(due to errors\) :



* Receiver must be able to accept packets out of order.
* Since receiver must release packets to higher layer in order, the receiver must be able to buffer some packets.





**Retransmission requests :**

* **Implicit –** The receiver acknowledges every good packet, packets that are not ACKed before a time-out are assumed lost or in error.Notice that this approach must be used to be sure that every packet is eventually received.
* **Explicit –** An explicit NAK \(selective reject\) can request retransmission of just one packet. This approach can expedite the retransmission but is not strictly needed.
* One or both approaches are used in practice.



* Sender’s Windows \( Ws\) = Receiver’s Windows \( Wr\).
* Window size should be less than or equal to half the sequence number in SR protocol. This is to avoid packets being recognized incorrectly. If the windows size is greater than half the sequence number space, then if an ACK is lost, the sender may send new packets that the receiver believes are retransmissions.
* Sender can transmit new packets as long as their number is with W of all unACKed packets.
* Sender retransmit un-ACKed packets after a timeout – Or upon a NAK if NAK is employed.
* Receiver ACKs all correct packets.
* Receiver stores correct packets until they can be delivered in order to the higher layer.
* In Selective Repeat ARQ, the size of the sender and receiver window must be at most one-half of 2^m.



e.g. window size is 2

![](../../.gitbook/assets/image%20%2830%29.png)

