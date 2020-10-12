---
description: 'https://documentation.finsemble.com/tutorial-architecturalOverview.html'
---

# Finsemble Architecture

In simple terms, Finsemble is set of web assets: HTML, JavaScript, CSS, and JSON files \(i.e., Finsemble assets\). Finsemble does not interact directly with the user's desktop except in ways that you specify.

A basic analogy is that Finsemble is a "site." However, Finsemble is not a single page app; it’s a collection of smaller web pages and native apps from multiple sources, knit together by a framework of supporting services. By connecting and coordinating with **Finsemble desktop services**, the windows form a Finsemble application. Each web page represents a component or service: chart component, toolbar, desktop service, config files, Finsemble API \(_FSBL.js_\), etc. These are all served from an HTTP server—just like a website.

### The Finsemble Library and desktop services <a id="the-finsemble-library-and-desktop-services"></a>

A desktop service in Finsemble is an independently-threaded JavaScript module providing functionality throughout a Finsemble SmartDesktop. Desktop services provide capabilities to Finsemble windows. Similar to cloud microservices, these desktop services don't have a UI. A desktop service can be interacted with using a corresponding client API.

Each window launched by Finsemble is a Chromium window whose JavaScript accesses the underlying Finsemble Library. The **Finsemble Library** \(_FSBL.js_\) is a set of client APIs connecting to the desktop services. The `FSBL` object is available to components on the global namespace, providing access to Finsemble's features.

Finsemble Workspaces ships with a set of desktop services that manage core features such as workspaces, storage, or docking. Firms licensing any of the advanced modules \(Flow, Connect, or Native\) can also add their own desktop services to encapsulate their own business logic.  


