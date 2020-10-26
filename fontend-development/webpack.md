---
description: >-
  https://medium.com/the-node-js-collection/modern-javascript-explained-for-dinosaurs-f695e9747b70
---

# webpack

 JavaScript module bundler is a tool that gets around the problem with a build step \(which has access to the file system\) to create a final output that is browser compatible \(which doesn’t need access to the file system\). In this case, we need a **module bundler to find all `require` statements \(which is invalid browser JavaScript syntax\) and replace them with the actual contents of each required file.** The final result is a single bundled JavaScript file \(with no require statements\)!



Around 2015, [webpack](https://webpack.github.io/) eventually became the more widely used module bundler \(fueled by the popularity of the [React](https://reactjs.org/) frontend framework, which took full advantage of webpack’s various features\).





```text
$ npm install webpack webpack-cli --save-dev
```

Note that we’re installing two packages — webpack and webpack-cli \(which enables you to use webpack from the command line\). Also note the `--save-dev` argument — this saves it as a development dependency, which means it’s a package that you need in your development environment but not on your production server. You can see this reflected in the **`package.json`** file, which was automatically updated:





Note that we’ll need to run the webpack command each time we change **`index.js`**. This is tedious, and will get even more tedious as we use webpack’s more advanced features \(like [generating source maps](https://webpack.js.org/guides/development/#using-source-maps) to help debug the original code from the transpiled code\). Webpack can read options from a config file in the root directory of the project named **`webpack.config.js`**, which in our case would look like:

```text
// webpack.config.js
module.exports = {
  mode: 'development',
  entry: './index.js',
  output: {
    filename: 'main.js',
    publicPath: 'dist'
  }
};
```

Now each time we change **`index.js`**, we can run webpack with the command:

```text
$ ./node_modules/.bin/webpack
```

