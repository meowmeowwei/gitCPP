---
description: 'https://www.javatpoint.com/angular-7-features'
---

# Angular - JavaPoint

used in Facebook

Angular installation -&gt; [https://www.javatpoint.com/angular-7-installation](https://www.javatpoint.com/angular-7-installation)

Hello World Project Setup -&gt; [https://www.javatpoint.com/angular-7-first-app](https://www.javatpoint.com/angular-7-first-app)



### Files used in Angular 7 App folder

Angular 7 App files which are mainly used in your project are given below:

* **src folder:** This is the folder which contains the main code files related to your angular application.
* **app folder:** The app folder contains the files, you have created for app components.
* **app.component.css:** This file contains the cascading style sheets code for your app component.
* **app.component.html:** This file contains the html file related to app component. This is the template file which is used by angular to do the data binding.
* **app.component.spec.ts:** This file is a unit testing file related to app component. This file is used along with other unit tests. It is run from Angular CLI by the command ng test.
* **app.component.ts:** This is the most important typescript file which includes the view logic behind the component.
* **app.module.ts:** This is also a typescript file which includes all the dependencies for the website. This file is used to define the needed modules to be imported, the components to be declared and the main component to be bootstrapped.



### Other Important files

* **package.json:** This is npm configuration file. It includes details about your website's package dependencies along with details about your own website being a package itself.
* **package-lock.json :** This is an auto-generated and modified file that gets updated whenever npm does an operation related to node\_modules or package.json
* **angular.json:** It is very important configuration file related to your angular application. **It defines the structure of your app and includes any settings associated with your application.** Here, you can specify environments on this file \(development, production\). This is the file where we add Bootstrap file to work with Angular 7.
* **.gitignore:** This file is related to the source control git.
* **.editorconfig:** This is a simple file which is used to maintain consistency in code editors to organize some basics such as indentation and whitespaces.
* **assets folder:** This folder is a placeholder for resource files which are used in the application such as images, locales, translations etc.
* **environments folder:** The environments folder is used to hold the environment configuration constants that help when building the angular application. The constants are defined in 2 separate .ts files \(environment.ts and environment.prod.ts\), where these constants are used within the angular.json file by the Angular CLI. For example, if you run the ng build command, it will build the application using the development environment settings, whereas the command ng build ?prod will build the project using the production environment settings.
* **browserlist:** This file is used by autoprefixer that adjusts the CSS to support a list of defined browsers.
* **favicon.ico:** This file specifies a small icon that appears next to the browser tab of a website.
* **index.html:** This is the entry file which holds the high level container for the angular application.
* **karma.config.js:** This file specifies the config file for the Karma Test Runner, Karma has been developed by the AngularJS team which can run tests for both AngularJS and Angular 2+
* **main.ts:** As defined in angular.json file, this is the main ts file that will first run. This file bootstraps \(starts\) the AppModule from app.module.ts , and it can be used to define global configurations.
* **polyfills.ts:** This file is a set of code that can be used to provide compatibility support for older browsers. Angular 7 code is written mainly in ES6+ language specifications which is getting more adopted in front-end development, so since not all browsers support the full ES6+ specifications, pollyfills can be used to cover whatever feature missing from a given browser.
* **styles.css:/** This is a global css file which is used by the angular application.
* **tests.ts:** This is the main test file that the Angular CLI command ng test will use to traverse all the unit tests within the application and run them.
* **tsconfig.json:** This is a typescript compiler configuration file.
* **tsconfig.app.json:** This is used to override the tsconfig.json file with app specific configurations.
* **tsconfig.spec.json:** This overrides the tsconfig.json file with app specific unit test configurations.

