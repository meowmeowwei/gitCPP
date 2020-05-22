---
description: 'http://cseweb.ucsd.edu/classes/fa11/cse123-a/syllabus.html'
---

# Computer Networking

\*\*\*\*[**CS123**](http://cseweb.ucsd.edu/classes/fa11/cse123-a/syllabus.html)\*\*\*\*

**introduction** 

1\) 1MB = 1000000 bytes, 1 KB = 1000 bytes

2\) layering -&gt; Application layer, Transport Layer, network Layer, link Layer , Physical Layer

    linkLayer = break larger network messages into individual frames

**lecture 2 \(Layering and switching\)**

1\) Circuit switching, 

session reserved dedicated bandwidth in series of switches between sender and caller

before sending, must reserve capacity of session 

2\) Packet Switching 

No session up , breaks data into packet and send immediately

each switch must know how to forward along any packet

uses queues to buffer bursts

if link is full \(queue the packet\), if queue is full \(drop the packet\) 

internet is using packet switching 

3\) OSI - Model

Physical Layer -&gt; move information between two systems via a physical link

Data Link Layer -&gt; framing and send data frames between peers attached to same physical media

Network Layer -&gt; packet segmentation and reassemble \(packet scheduling and buffer management\)

Transport Layer -&gt; error free and flow control for end to end connection \(TCP/UDP\)

Session Layer -&gt; Session management and synchronisation 

Presentation Layer -&gt; Data format conversion 

Application Layer -&gt; \(e.g. SSH, HTTP\)  




