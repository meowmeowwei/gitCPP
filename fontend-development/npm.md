---
description: 'https://www.w3schools.com/whatis/whatis_npm.asp'
---

# NPM

### The World's Largest Software Registry \(Library\)

**npm** is the world's largest **Software Registry**.

The registry contains over 800,000 **code packages**.

**Open-source** developers use **npm** to **share** software.

Many organizations also use npm to manage private development.



### Installing npm

**npm** is installed with **Node.js**

This means that you have to install Node.js to get npm installed on your computer.

Download Node.js from the official Node.js web site: [https://nodejs.org](https://nodejs.org/)

### Software Package Manager

The name **npm** \(Node Package Manager\) stems from when npm first was created as a package manager for Node.js.

All **npm** packages are defined in files called **package.json**.

The content of package.json must be written in **JSON**.

At least two fields must be present in the definition file: **name** and **version**.

[https://medium.com/the-node-js-collection/modern-javascript-explained-for-dinosaurs-f695e9747b70](https://medium.com/the-node-js-collection/modern-javascript-explained-for-dinosaurs-f695e9747b70)



To install the moment.js JavaScript package, we can now follow the npm instructions from their home page by entering the following command in the command line:

```text
$ npm install moment --save
```

This command does two things — first, it downloads all the code from the [moment.js package](https://unpkg.com/moment/) into a folder called **`node_modules`**. Second, it automatically modifies the **`package.json`** file to keep track of moment.js as a project dependency.

```text
{
  "name": "modern-javascript-example",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "author": "",
  "license": "ISC",
  "dependencies": {
    "moment": "^2.22.2"
  }
}
```

