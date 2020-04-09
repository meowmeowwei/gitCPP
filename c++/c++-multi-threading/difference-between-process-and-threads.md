---
description: 'https://www.geeksforgeeks.org/difference-between-process-and-thread/'
---

# Difference between Process and Threads

![](../../.gitbook/assets/image%20%28143%29.png)

Process 

a program in execution. Process Control Block contains Process Priority, CPU, register. process take more time to terminate.

Thread

thread is segment of process . they are contained in a process.

each thread has its own \(PCB for registers, stack, PC\).





**Difference between Process and Thread:**

| S.NO | PROCESS | THREAD |
| :--- | :--- | :--- |
| 1. | Process means any program is in execution. | Thread means segment of a process. |
| 2. | Process takes more time to terminate. | Thread takes less time to terminate. |
| 3. | It takes more time for creation. | It takes less time for creation. |
| 4. | It also takes more time for context switching. | It takes less time for context switching. |
| 5. | Process is less efficient in term of communication. | Thread is more efficient in term of communication. |
| 6. | Process consume more resources. | Thread consume less resources. |
| 7. | Process is isolated. | Threads share memory. |
| 8. | Process is called heavy weight process. | Thread is called light weight process. |
| 9. | Process switching uses interface in operating system. | Thread switching does not require to call a operating system and cause an interrupt to the kernel. |
| 10. | If one server process is blocked no other server process can execute until the first process unblocked. | Second thread in the same task could run, while one server thread is blocked. |

