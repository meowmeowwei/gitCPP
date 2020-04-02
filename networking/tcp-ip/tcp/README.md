# TCP

Uses fix connection for communication between applications

need to do 3 way handshake to establish connection 

1\) connection oriented and full duplex \(both parties can send messages to each other at the same time\)

2\) Reliable data transfer \(ensures all packets are sent and no drop \) using sequence numbers, acks and timers.

3\) congestion control mechanism , throttles a sending process when network is congested between sender and receiver.

4\) adopts a hybrid of GoBackN and SelectiveRepeat

Header contains 32 bits in 5 rows

* Src port
* Dst port
* checksum
* sequence number
* acknowledge number 



