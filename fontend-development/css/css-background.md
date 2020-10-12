---
description: 'https://www.w3schools.com/css/css_background.asp'
---

# CSS Background

1\) background-color

2\) opacity

3\) background-image 

```markup

<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("paper.gif");
}
</style>
</head>
<body>

<h1>Hello World!</h1>

<p>This page has an image as the background!</p>

</body>
</html>

```

background position

```markup

<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
  background-position: right top;
  margin-right: 200px;
}
</style>
</head>
<body>
```

The `background-attachment` property specifies whether the background image should scroll or be fixed \(will not scroll with the rest of the page\):

```markup


<!DOCTYPE html>
<html>
<head>
<style>
body {
  background-image: url("img_tree.png");
  background-repeat: no-repeat;
  background-position: right top;
  margin-right: 200px;
  background-attachment: fixed;
}
</style>
</head>
<body>

```

background shorthands 



When using the shorthand property the order of the property values is:

* `background-color`
* `background-image`
* `background-repeat`
* `background-attachment`
* `background-position`

It does not matter if one of the property values is missing, as long as the other ones are in this order. Note that we do not use the background-attachment property in the examples above, as it does not have a value.

![](../../.gitbook/assets/image%20%28312%29.png)



### All CSS Background Properties

| Property | Description |
| :--- | :--- |
| [background](https://www.w3schools.com/cssref/css3_pr_background.asp) | Sets all the background properties in one declaration |
| [background-attachment](https://www.w3schools.com/cssref/pr_background-attachment.asp) | Sets whether a background image is fixed or scrolls with the rest of the page |
| [background-clip](https://www.w3schools.com/cssref/css3_pr_background-clip.asp) | Specifies the painting area of the background |
| [background-color](https://www.w3schools.com/cssref/pr_background-color.asp) | Sets the background color of an element |
| [background-image](https://www.w3schools.com/cssref/pr_background-image.asp) | Sets the background image for an element |
| [background-origin](https://www.w3schools.com/cssref/css3_pr_background-origin.asp) | Specifies where the background image\(s\) is/are positioned |
| [background-position](https://www.w3schools.com/cssref/pr_background-position.asp) | Sets the starting position of a background image |
| [background-repeat](https://www.w3schools.com/cssref/pr_background-repeat.asp) | Sets how a background image will be repeated |
| [background-size](https://www.w3schools.com/cssref/css3_pr_background-size.asp) | Specifies the size of the background image\(s\) |

