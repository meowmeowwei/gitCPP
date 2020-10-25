# Lerna and MonoRepo

MonoRepo -&gt; software development strategy where code for many projects are stored in the same repository 

Issues if there's no MonoRepo

* lots of NPM linking 
* separate build plans running very slow 
* multiple review/QA processes needed
* difficult testing
* non unified approach 

MonoRepo

* easy to maintain 
* Quicker in development
* Easy Testing
* Unified process \(Qa/Build/Release\)
* Better versioning 

[https://github.com/ahmadawais/lerna-tutorial](https://github.com/ahmadawais/lerna-tutorial)

1\) init monorepo using lerna

* lerna init 

the lerna.json that keeps track of our apps and modules and a classical package.json to specify some root dependencies.

 2\) use CRA to create a init app in packages folder created by lerna 

* npx create-react-app packages/my-app





