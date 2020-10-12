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

![](../../.gitbook/assets/image%20%28311%29.png)

