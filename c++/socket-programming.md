---
description: 'https://www.bogotobogo.com/cplusplus/sockets_server_client.php'
---

# Socket Programming

![](../.gitbook/assets/image%20%2891%29.png)



![](../.gitbook/assets/image%20%283%29.png)

**Socket Functions**

sockets in C/C++ behaves like files because they use file descriptors to identify themselves.

functions defined in /usr/include/sys/sockets.h



**1\) int socket\(int domain, int type, int protocol\)**

Used to create a new socket, returns a file descriptor for the socket or -1 on error.  
It takes three parameters:  


1. domain: the protocol family of socket being requested
2. type: the type of socket within that family
3. and the protocol.

  
The parameters allow us to say what kind of socket we want \(IPv4/IPv6, stream/datagram\(TCP/UDP\)\).  


1. The protocol family should be **AF\_INET** or **AF\_INET6**
2. and the protocol type for these two families is either **SOCK\_STREAM** for TCP/IP or **SOCK\_DGRAM** for UDP/IP.
3. The protocol should usually be set to zero to indicate that the default protocol should be used.

```cpp

 // Creating socket file descriptor 
    if ((server_fd = socket(AF_INET, SOCK_STREAM, 0)) == 0) 
    { 
        perror("socket failed"); 
        exit(EXIT_FAILURE); 
    } 
```

2\) **int bind\(int fd, struct sockaddr \*local\_addr, socklen\_t addr\_length\)**

Once we have a socket, we might have to associate that socket with a port on our local machine.  
The port number is used by the kernel to match an incoming packet to a certain process's socket descriptor.  
A server will call **bind\(\)** with the address of the local host and the port on which it will listen for connections.  
It takes file descriptor \(previously established socket\), a pointer to \(the address of\) a structure containing the details of the address to bind to, the value **INADDR\_ANY** is typically used for this, and the length of the address structure.  
The particular structure that needs to be used will depend on the protocol, which is why it is passed by the pointer.  
So, this **bind\(\)** call will bind the socket to the current IP address on port, portno  
Returns 0 on success and -1 on error.

