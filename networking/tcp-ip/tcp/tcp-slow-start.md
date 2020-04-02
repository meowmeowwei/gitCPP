---
description: 'https://blog.stackpath.com/tcp-slow-start/'
---

# TCP Slow Start

algorithm that balances the speed of network connection. Gradually increases the amount of data transmitted until it finds the network's maximum carrying capacity.



**Step-by-step, here’s how slow start works:**

1. A sender attempts to communicate to a receiver. The sender’s initial packet contains a small congestion window, which is determined based on the sender’s maximum window.
2. The receiver acknowledges the packet and responds with its own window size. If the receiver fails to respond, the sender knows not to continue sending data.
3. After receiving the acknowledgement, the sender increases the next packet’s window size. The window size gradually increases until the receiver can no longer acknowledge each packet, or until either the sender or the receiver’s window limit is reached.

   Once a limit has been determined, slow start’s job is done. Other congestion control algorithms take over to maintain the speed of the connection.

