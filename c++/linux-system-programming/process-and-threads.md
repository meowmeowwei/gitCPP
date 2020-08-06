# Process and Threads

Why a process should be used instead of a thread is an important aspect to consider. The answer depends, but in general, the following aspects should be considered: A thread runs in the same memory space of the process that launched it. This aspect has both pros and cons. The main implication is that if a thread crashes, the whole application crashes. Communication between threads is much faster than interprocess communications. A process can be spawned with lower privileges \(through setrlimit\) to limit the resources available to untrusted code. A program designed in processes is more segregated than one designed in threads

