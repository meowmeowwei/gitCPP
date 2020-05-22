# Network Common Terms

[website reference ](https://en.wikipedia.org/wiki/Network_topology)

#### Network interfaces

[![A network interface circuit with port for ATM](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/ForeRunnerLE_25_ATM_Network_Interface_%281%29.jpg/220px-ForeRunnerLE_25_ATM_Network_Interface_%281%29.jpg)](https://en.wikipedia.org/wiki/File:ForeRunnerLE_25_ATM_Network_Interface_%281%29.jpg)An [ATM](https://en.wikipedia.org/wiki/Asynchronous_Transfer_Mode) network interface in the form of an accessory card. A lot of network interfaces are built-in.

A [network interface controller](https://en.wikipedia.org/wiki/Network_interface_controller) \(NIC\) is [computer hardware](https://en.wikipedia.org/wiki/Computer_hardware) that provides a computer with the ability to access the transmission media, and has the ability to process low-level network information. For example, the NIC may have a connector for accepting a cable, or an aerial for wireless transmission and reception, and the associated circuitry.

The NIC responds to traffic addressed to a [network address](https://en.wikipedia.org/wiki/Network_address) for either the NIC or the computer as a whole.

In [Ethernet](https://en.wikipedia.org/wiki/Ethernet) networks, each network interface controller has a unique [Media Access Control](https://en.wikipedia.org/wiki/MAC_address) \(MAC\) address—usually stored in the controller's permanent memory. To avoid address conflicts between network devices, the [Institute of Electrical and Electronics Engineers](https://en.wikipedia.org/wiki/Institute_of_Electrical_and_Electronics_Engineers) \(IEEE\) maintains and administers MAC address uniqueness. The size of an Ethernet MAC address is six [octets](https://en.wikipedia.org/wiki/Octet_%28computing%29). The three most significant octets are reserved to identify NIC manufacturers. These manufacturers, using only their assigned prefixes, uniquely assign the three least-significant octets of every Ethernet interface they produce.

#### Switches\[[edit](https://en.wikipedia.org/w/index.php?title=Network_topology&action=edit&section=10)\]

A [network switch](https://en.wikipedia.org/wiki/Network_switch) is a device that forwards and filters [OSI layer 2](https://en.wikipedia.org/wiki/OSI_layer_2) [datagrams](https://en.wikipedia.org/wiki/Datagram) \([frames](https://en.wikipedia.org/wiki/Frame_%28networking%29)\) between [ports](https://en.wikipedia.org/wiki/Computer_port_%28hardware%29) based on the destination MAC address in each frame.[\[15\]](https://en.wikipedia.org/wiki/Network_topology#cite_note-15) A switch is distinct from a hub in that it only forwards the frames to the physical ports involved in the communication rather than all ports connected. It can be thought of as a multi-port bridge.[\[16\]](https://en.wikipedia.org/wiki/Network_topology#cite_note-16) It learns to associate physical ports to MAC addresses by examining the source addresses of received frames. If an unknown destination is targeted, the switch broadcasts to all ports but the source. Switches normally have numerous ports, facilitating a star topology for devices, and cascading additional switches.

[Multi-layer switches](https://en.wikipedia.org/wiki/Network_switch#Layer-specific_functionality) are capable of routing based on layer 3 addressing or additional logical levels. The term switch is often used loosely to include devices such as routers and bridges, as well as devices that may distribute traffic based on load or based on application content \(e.g., a Web [URL](https://en.wikipedia.org/wiki/Uniform_Resource_Locator) identifier\).



#### Routers\[[edit](https://en.wikipedia.org/w/index.php?title=Network_topology&action=edit&section=11)\]

[![](https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Adsl_connections.jpg/220px-Adsl_connections.jpg)](https://en.wikipedia.org/wiki/File:Adsl_connections.jpg)A typical home or small office router showing the [ADSL](https://en.wikipedia.org/wiki/ADSL) telephone line and [Ethernet](https://en.wikipedia.org/wiki/Ethernet) network cable connections

A [router](https://en.wikipedia.org/wiki/Router_%28computing%29) is an [internetworking](https://en.wikipedia.org/wiki/Internetworking) device that forwards [packets](https://en.wikipedia.org/wiki/Packet_%28information_technology%29) between networks by processing the routing information included in the packet or datagram \(Internet protocol information from layer 3\). The routing information is often processed in conjunction with the routing table \(or forwarding table\). A router uses its routing table to determine where to forward packets. A destination in a routing table can include a "null" interface, also known as the "black hole" interface because data can go into it, however, no further processing is done for said data, i.e. the packets are dropped.



**Network Topologies** 

Point-to-point, Daisy chain, Bus, Linear Bus, Star, Ring 



