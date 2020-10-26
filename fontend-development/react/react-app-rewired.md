---
description: >-
  https://medium.com/capriza-engineering/sharing-source-code-and-libraries-in-react-bd30926df312
---

# React App Rewired

allowing project to import uncompiled codes in the build ...



## Consuming uncompiled code <a id="3dff"></a>

In order to consume uncompiled code from an external library we have to tweak and adjust the webpack configuration of the project. But before I show you how, some background is necessary.

Changing the webpack configuration of a react project is not trivial, and many developers would prefer to avoid it as much as possible. That is exactly why the [create-react-app](https://facebook.github.io/create-react-app/) \(CRA\) project is so popular — all the webpack configuration of the JSX compilation, babel transpilation and more is pre-configured for you in the ‘react-scripts’ package dependency. CRA also gives you the option to configure everything yourself using ‘_npm eject_’, which copies the webpack configuration files to your root folder where you can edit it manually. Just remember that once ejected, you are on your own; you cannot undo the ejection.

A popular solution for [configuring webpack without ejecting](https://daveceddia.com/customize-create-react-app-webpack-without-ejecting/) is through the use of [react-app-rewired](https://github.com/timarney/react-app-rewired) that replaces the ‘_npm start_’ and ‘_npm build_’ scripts with its own scripts. Note that react-app-rewired actually calls the original ‘react-scripts’, but then lets you override the outputted configuration. Version 2.0 of CRA caused parts of ‘react-app-rewired’ to break, so another package was created to bridge the gap — [customize-cra](https://github.com/arackaf/customize-cra).

