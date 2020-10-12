---
description: 'https://www.w3schools.com/html/html_links.asp'
---

# HTML Links



### HTML Links - The target Attribute

By default, the linked page will be displayed in the current browser window. To change this, you must specify another target for the link.

The `target` attribute specifies where to open the linked document.

The `target` attribute can have one of the following values:

* `_self` - Default. Opens the document in the same window/tab as it was clicked
* `_blank` - Opens the document in a new window or tab
* `_parent` - Opens the document in the parent frame
* `_top` - Opens the document in the full body of the window

```text

<a href="https://www.w3schools.com/" target="_blank">Visit W3Schools!</a>
```



Use Image as Link 

```markup

<!DOCTYPE html>
<html>
<body>

<h2>Image as a Link</h2>

<p>The image below is a link. Try to click on it.</p>

<a href="default.asp"><img src="smiley.gif" alt="HTML tutorial" style="width:42px;height:42px;"></a>

</body>
</html>

```



Link to EMAIL

```markup
<a href="mailto:someone@example.com">Send email</a>
```



### Chapter Summary

* Use the `<a>` element to define a link
* Use the `href` attribute to define the link address
* Use the `target` attribute to define where to open the linked document
* Use the `<img>` element \(inside `<a>`\) to use an image as a link
* Use the `mailto:` scheme inside the `href` attribute to create a link that opens the user's email program



Creating bookmark with ID

![](../../.gitbook/assets/image%20%28309%29.png)





