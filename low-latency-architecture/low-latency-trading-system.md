# Low Latency Trading System

{% embed url="https://blog.quantinsti.com/automated-trading-system/" %}

1\) Kernel Bypass to avoid interrupts 

Interrupt latency in an automated trading system signifies a latency introduced by interrupts while receiving the packets on a server.

Interrupt latency is defined as the time elapsed between when an interrupt is generated to when the source of the interrupt is serviced. When is an interrupt generated? Interrupts are signals to the processor emitted by hardware or software indicating that an event needs immediate attention. The processor, in turn, responds by suspending its current activity, saving its state and handling the interrupt. Whenever a packet is received on the NIC, an interrupt is sent to handle the bits that have been loaded into the receive buffer of the NIC. The time taken to respond to this interrupt not only affects the processing of the newly arriving payload, but also the latency of the existing processes on the processor.

Solarflare introduced “OpenOnload” in 2011, which implements a technique known as kernel bypass, where the processing of the packet is not left to the operating system kernel but to the userspace itself. The entire packet is directly mapped into the userspace by the NIC and is processed there. As a result, interrupts are completely avoided.

![](../.gitbook/assets/image%20%2848%29.png)

