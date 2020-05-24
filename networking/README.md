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

3\) [OSI - Model](https://en.wikipedia.org/wiki/OSI_model)

Physical Layer -&gt; move information between two systems via a physical link

Data Link Layer -&gt; framing and send data frames between peers attached to same physical media

Network Layer -&gt; packet segmentation and reassemble \(packet scheduling and buffer management\)

Transport Layer -&gt; error free and flow control for end to end connection \(TCP/UDP\)

Session Layer -&gt; Session management and synchronisation 

Presentation Layer -&gt; Data format conversion 

Application Layer -&gt; \(e.g. SSH, HTTP\)

4\) Standard packet header 

![](../.gitbook/assets/image%20%28179%29.png)

**lecture 3 Signalling and clock recovery** 

1\) analog vs digital 

analog can be converted to digital for storage and then back to analog 

take bits \(digital data\) &gt; modulate to send data \(analog\) -&gt; demodulate to retrieve data \(digital again\) 



**lecture 4, Framing and Error Detection** 

1\) data Link layer will Frame \(break stream of bits up into discrete chunks\) and do error handling \(detect or correct errors in received frames\) , Multiplexing \(determine appropriate destination for a given frame\) 

2\) frame means wraps payload with some additional information such as header and trailer 

3\) types of frames \(fixed-length frames, length-based frames \(has length fields\), sentinel-based framing \(with marker front and back\)\)

 4\) [Error handling ](https://www.geeksforgeeks.org/error-detection-in-computer-networks/)

checksum, adding extra bit to frame \(parity bits makes total number of 1s even\), hamming distance , two dimensional parity



