---
description: 'https://www.computerhope.com/jargon/f/file-descriptor.htm'
---

# File Descriptor

A **file descriptor** is a number that uniquely identifies an open [file](https://www.computerhope.com/jargon/f/file.htm) in a computer's [operating system](https://www.computerhope.com/os.htm). It describes a data resource, and how that resource may be accessed.

When a program asks to open a file — or another data resource, like a [network socket](https://www.computerhope.com/jargon/n/network-socket.htm) — the [kernel](https://www.computerhope.com/jargon/k/kernel.htm):

1. Grants access.
2. Creates an entry in the global file table.
3. Provides the software with the location of that entry.

The descriptor is identified by a unique non-negative [integer](https://www.computerhope.com/jargon/i/integer.htm), such as 0, 12, or 567. At least one file descriptor exists for every open file on the system.

File descriptors were first used in [Unix](https://www.computerhope.com/jargon/u/unix.htm), and are used by modern operating systems including [Linux](https://www.computerhope.com/jargon/l/linux.htm), [macOS](https://www.computerhope.com/jargon/m/macosx.htm), and [BSD](https://www.computerhope.com/jargon/b/bsd.htm). In [Microsoft Windows](https://www.computerhope.com/jargon/w/windows.htm), file descriptors are known as [file handles](https://www.computerhope.com/jargon/f/filehand.htm).

