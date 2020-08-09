# c++ Memory Mapped IO

### Introduction

Interprocess communication is an important missing part in the C++ standard library. This paper proposes some classes to fill two basic areas in interprocess communications: memory mapped files and shared memory.

Standard file mapping and shared memory utilities can offer a wide range of possibilities for many applications, to achieve data persistence, data cache and complex data serialization between processes.

### Memory Mapped Files

File mapping is the association of a file's contents with a portion of the address space of a process. The system creates a **file mapping** to associate the file and the address space of the process. A **mapped region** is the portion of address space that the process uses to access the file's contents. A single file mapping can have several mapped regions, and the user can associate parts of the file with the address space of the process without mapping the entire file in the address space. Processes read from and write to the file using pointers, just like with dynamic memory. File mapping has the following advantages:

* Uniform resource use. Files and memory can be treated using the same functions.
* Automatic file data synchronization and cache from the OS.
* Reuse of C++ memory utilities \(STL containers, algorithms\) in files.
* Shared memory between two or more applications.
* Allows efficient work with a large files, without loading the whole file into memory

If several processes use the same file mapping to create mapped regions of a file, each process' views contain identical copies of the file on disk. POSIX and Windows mapped file management is very similar, and highly portable.



```cpp
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <iostream>

#define FILEPATH "mmapped.txt"
#define NUM_OF_ITEMS_IN_FILE  (1000)
#define FILESIZE (NUM_OF_ITEMS_IN_FILE * sizeof(int))

int main(int argc, char *argv[])
{
    int fd = open(FILEPATH, O_RDWR | O_CREAT | O_TRUNC, (mode_t)0600);
    if (fd == -1)
    {
        std::cout << "Error opening file " << FILEPATH << std::endl;
        return 1;
    }

    int result = lseek(fd, FILESIZE-1, SEEK_SET);
    if (result == -1)
    {
        close(fd);
        std::cout << "Error calling lseek " << std::endl;
        return 2;
    }

    result = write(fd, "", 1);
    if (result != 1)
    {
        close(fd);
        std::cout << "Error writing into the file  " << std::endl;
        return 3;
    }

    int* map = (int*) mmap(0, FILESIZE, PROT_READ | PROT_WRITE, MAP_SHARED, fd, 0);
    if (map == MAP_FAILED)
    {
        close(fd);
        std::cout << "Error mapping the file " << std::endl;
        return 4;
    }

    for (int i = 1; i <=NUM_OF_ITEMS_IN_FILE; ++i)
        map[i] = 2 * i;

    if (munmap(map, FILESIZE) == -1)
        std::cout << "Error un-mapping" << std::endl;

    close(fd);
    return 0;
```

reader

```cpp
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <iostream>

#define FILEPATH "mmapped.txt"
#define NUM_OF_ITEMS_IN_FILE  (1000)
#define FILESIZE (NUM_OF_ITEMS_IN_FILE * sizeof(int))

int main(int argc, char *argv[])
{
    int fd = open(FILEPATH, O_RDONLY);
    if (fd == -1)
    {
        std::cout << "Error opening file " << FILEPATH << std::endl;
        return 1;
    }

    int* map = (int*) mmap(0, FILESIZE, PROT_READ, MAP_SHARED, fd, 0);
    if (map == MAP_FAILED)
    {
        close(fd);
        std::cout << "Error mapping the file " << std::endl;
        return 4;
    }

    for (int i = 1; i <= NUM_OF_ITEMS_IN_FILE; ++i)
        std::cout << "i = " << map[i] << std::endl;

    if (munmap(map, FILESIZE) == -1) {
        std::cout << "Error un-mapping" << std::endl;
    }

    close(fd);
    return 0;
}
```

![](../.gitbook/assets/image%20%28203%29.png)

