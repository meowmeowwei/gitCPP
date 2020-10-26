---
description: 'https://www.electronjs.org/'
---

# Electron

Electron is a framework for creating native applications with web technologies like JavaScript, HTML, and CSS. It takes care of the hard parts so you can focus on the core of your application.

[https://www.tutorialspoint.com/electron/how\_electron\_works.htm](https://www.tutorialspoint.com/electron/how_electron_works.htm)

Electron takes a main file defined in your package.json file and executes it. This main file creates application windows which contain rendered web pages and interaction with the native GUI \(graphical user interface\) of your Operating System.

As you start an application using Electron, a **main process** is created. This main process is responsible for interacting with the native GUI of the Operating System. It creates the GUI of your application.

Just starting the main process does not give the users of your application any application window. These are created by the main process in the main file by using the BrowserWindow module. Each browser window then runs its own **renderer process**. The renderer process takes an HTML file which references the usual CSS files, JavaScript files, images, etc. and renders it in the window.

The main process can access the native GUI through modules available directly in Electron. The desktop application can access all Node modules like the file system module for handling files, request to make HTTP calls, etc.

### Difference between Main and Renderer processes

The main process creates web pages by creating the BrowserWindow instances. Each BrowserWindow instance runs the web page in its own renderer process. When a BrowserWindow instance is destroyed, the corresponding renderer process is also terminated.

The main process manages all web pages and their corresponding renderer processes. Each renderer process is isolated and only cares about the web page running in it.



