---
description: 'https://www.bogotobogo.com/cplusplus/sockets_server_client.php'
---

# Socket Programming

![](../.gitbook/assets/image%20%2895%29.png)



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

3\)**int listen\(int fd, int backlog\_queue\_size\)**

Once a server has been bound to an address, the server can then call **listen\(\)** on the socket.  
The parameters to this call are the socket \(fd\) and the maximum number of queued connections requests up to **backlog\_queue\_size**.  
Returns 0 on success and -1 on error.

The `listen()` function basically [sets a flag in the internal socket structure marking the socket](https://stackoverflow.com/questions/34073871/socket-programming-whats-the-difference-between-listen-and-accept) as a passive listening socket, one that you can call `accept` on. It opens the bound port so the socket can then start receiving connections from clients.

**4\) int accept\(int fd, struct sockaddr \*remote\_host, socklen\_t addr\_length\)**

Accepts an incoming connection on a bound socket. The address information from the remote host is written into the **remote\_host** structure and the actual size of the address structure is written into **\*addr\_length**.  
In other words, this **accept\(\)** function will write the connecting client's address info into the address structure.  
Then, returns a new socket file descriptor for the accepted connection.  
So, the original socket file descriptor can continue to be used for accepting new connections while the new socket file descriptor is used for communicating with the connected client.  
This function returns a new socket file descriptor to identify the connected socket or -1 on error.

Here is the description from the man page:  
"It extracts the first connection request on the queue of pending connections for the listening socket, **sockfd**, creates a new connected socket, and returns a new file descriptor referring to that socket. The newly created socket is not in the listening state. The original socket sockfd is unaffected by this call".

**5\) int connect\(int fd, struct sockaddr \*remote\_host, socklen\_t addr\_length\)**

Connects a socket \(described by file descriptor **fd**\) to a remote host.  
Returns 0 on success and -1 on error.

This is a blocking call. That's because when we issue a call to connect\(\), our program doesn't regain control until either the connection is made, or an error occurs. For example, let's say that we're writing a web browser. We try to connect to a web server, but the server isn't responding. So, we now want the connect\(\) API to stop trying to connect by clicking a stop button. But that can't be done. It waits for a return which could be 0 on success or -1 on error.

**6\) int send\(int fd, void \*buffer, size\_t n, int flags\)**

Sends n bytes from **\*buffer** to **socket fd**.  
Returns the number of bytes sent or -1 on error.

**7\) int receive\(int fd, void \*buffer, size\_t n, int flags\)**

Receives n bytes from **socket fd** into **\*buffer**.  
Returns the number of bytes received or -1 on error.

This is another blocking call. In other words, when we call **recv\(\)** to read from a stream, control isn't returned to our program until at least one byte of data is read from the remote site. This process of waiting for data to appear is referred to as **blocking**. The same is true for the write\(\) and the connect\(\) APIs, etc. When we run those blocking APIs, the connection "blocks" until the operation is complete.

