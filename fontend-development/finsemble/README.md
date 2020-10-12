---
description: 'https://documentation.finsemble.com/tutorial-gettingStarted.html'
---

# Finsemble

### Install 📡 <a id="install-&#x1F4E1;"></a>

Grab it from Github and install with [Yarn](https://yarnpkg.com/) \(the npm CLI works too\).

```text
git clone https://github.com/chartiq/finsemble-seed
cd finsemble-seed
yarn install
yarn start
```

You've now warped in a new SmartDesktop, complete advanced window management, inter-app communications, and a toolbar from which to orchestrate it all. Go ahead and take it for a spin!

For this tutorial, we're going to use [Npx](https://www.npmjs.com/package/npx) to help us with our CLI commands. Npx "...executes a command either from a local `node_modules/.bin`, or from a central cache, installing any packages needed...". If you haven't already, install Npx globally. It'll make things run a lot smoother.

`npm install -g npx`

### Add Some Apps 📦 <a id="add-some-apps-&#x1F4E6;"></a>

Adding apps to your SmartDesktop is easy with the Finsemble CLI. Just point the CLI at a URL or local executable to automatically integrate it, or have the CLI scaffold a new web app for you for local development \(React and Angular are supported out-of-the-box!\).

Now let's add some demo apps to play with:

```text
npx finsemble-cli add component "Account Detail" url https://documentation.finsemble.com/components/accountDetail/accountDetail.html
npx finsemble-cli add component "Account Statement" url https://documentation.finsemble.com/components/accountStatement/accountStatement.html
```

Now restart the SmartDesktop \(just between us devs, there's a hidden keyboard shortcut to do so: CTRL+ALT+SHIFT+R\). Our new apps are now available in the App



**Youtube Tutorial** 

[https://blog.scottlogic.com/2020/08/12/building-desktop-applications-with-finsemble.html](https://blog.scottlogic.com/2020/08/12/building-desktop-applications-with-finsemble.html)

