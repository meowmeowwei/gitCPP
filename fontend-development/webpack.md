---
description: >-
  https://medium.com/the-node-js-collection/modern-javascript-explained-for-dinosaurs-f695e9747b70
---

# webpack

 JavaScript module bundler is a tool that gets around the problem with a build step \(which has access to the file system\) to create a final output that is browser compatible \(which doesn’t need access to the file system\). In this case, we need a module bundler to find all `require` statements \(which is invalid browser JavaScript syntax\) and replace them with the actual contents of each required file. The final result is a single bundled JavaScript file \(with no require statements\)!



Around 2015, [webpack](https://webpack.github.io/) eventually became the more widely used module bundler \(fueled by the popularity of the [React](https://reactjs.org/) frontend framework, which took full advantage of webpack’s various features\).

