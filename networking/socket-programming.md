---
description: 'https://www.csd.uoc.gr/~hy556/material/tutorials/cs556-3rd-tutorial.pdf'
---

# Socket Programming

Socket - Abstraction through which application can send and receive data

![](../.gitbook/assets/image%20%28183%29.png)



Stream Sockets -&gt; Uses TCP 

Data Sockets -&gt; Uses UDP

![](../.gitbook/assets/image%20%28182%29.png)



![](../.gitbook/assets/image%20%28181%29.png)



[Good Website with Sample Code ](https://web.eecs.umich.edu/~sugih/courses/eecs489/syllabus.html)

```cpp
//Server 

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <netinet/in.h>
#include <netdb.h>
#endif

#define net_assert(err, errmsg) { if ((err)) { perror(errmsg); assert(!(err)); } }

#define PORT 4897
#define QLEN 100
#define BLEN 256

int visits;

int
main(int argc, char *argv[])
{
  struct sockaddr_in self, client;
  struct hostent *cp;
  int sd, td;
  int len;
  char buf[BLEN];


  sd = socket(PF_INET, SOCK_STREAM, IPPROTO_TCP);
  
  memset((char *) &self, 0, sizeof(struct sockaddr_in));
  self.sin_family = AF_INET;
  self.sin_addr.s_addr = INADDR_ANY;
  self.sin_port = htons((u_short) PORT);

  bind(sd, (struct sockaddr *) &self, sizeof(struct sockaddr_in));

  listen(sd, QLEN);

  while (1) {
    len = sizeof(struct sockaddr_in);
    td = accept(sd, (struct sockaddr *) &client, (socklen_t *)&len);

    cp = gethostbyaddr((char *) &client.sin_addr, sizeof(struct in_addr), AF_INET);
    printf("Connected from %s\n", 
          ((cp && cp->h_name) ? cp->h_name : inet_ntoa(client.sin_addr)));

    visits++;
    sprintf(buf, "This server has been contacted %d time(s).\n", visits);
    send(td, buf, strlen(buf), 0);

    close(td);
  }

  exit(0);
}

```







