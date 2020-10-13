---
description: >-
  https://www.c-sharpcorner.com/article/learn-angular-8-step-by-step-in-10-days-day-1/
---

# Day 1- Basics

1\) ng new AngularDemo



  
The created project contains the following folders –

1. e2e - This folder is for an end to end testing purposes. It contains the configuration files related to performing the unit test of the projects. 
2. node\_modules - This folder contains the downloaded packages as per the configuration. 
3. src - This folder contains the actual source code. It contains 3 subfolders as – 

* * app - App folder contains the Angular project-related files like components, HTML files, etc. 
  * assets - Assets folder contains any static files like images, stylesheets, custom javascript library files \(if any required\), etc. 
  * environments - Environments folder contains the environment-related files which are required during deployment or build of the projects.



**tsconfig.json** – If tsconfig.json files exist within the project root folder, that means that the project is a basically TypeScript project. The tsconfig.json file specifies the root files and the compiler options required to compile the project. Sample of tsconfig.json as below – 

**package.json** – package.json is basically a JSON file that contains all information related to the required packages for the project. Also, with the help of this configuration files, we can maintain the Project Name and its related version by using the “name” and “version” property. Also, we can provide the build definition of the project using this file.

**angular.json** – angular.json file is an Angular Application Environment based JSON file which contains all the information related to the project build and deployment. It tells the system which files need to change when we use ng build or ng serve command. 



**main.ts** - The main.ts file acts as the main entry point of our Angular application. This file is responsible for the bootstrapper operation of our Angular modules. It contains some important statements related to the modules and some initial setup configurations like 

* **enableProdMode** – This option is used to disable Angular’s development mode and enable Productions mode. Disabling Development mode turns off assertions and other model-related checks within the framework. 
* **platformBrowserDynamic** – This option is required to bootstrap the Angular app n the browser. 
* **AppModule** – This option indicates which module acts as a root module in the applications. 
* **environment** – This option stores the values of the different environment constants. 

