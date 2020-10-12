---
description: 'https://www.w3schools.com/css/css_padding.asp'
---

# CSS Padding

### CSS Padding

The CSS `padding` properties are used to generate space around an element's content, inside of any defined borders.

With CSS, you have full control over the padding. There are properties for setting the padding for each side of an element \(top, right, bottom, and left\).

### Padding - Individual Sides

CSS has properties for specifying the padding for each side of an element:

* `padding-top`
* `padding-right`
* `padding-bottom`
* `padding-left`

All the padding properties can have the following values:

* _length_ - specifies a padding in px, pt, cm, etc.
* _%_ - specifies a padding in % of the width of the containing element
* inherit - specifies that the padding should be inherited from the parent element

**Note:** Negative values are not allowed.

1\) add box-sizing to ensure padding values are sticked with div's width

```markup

<!DOCTYPE html>
<html>
<head>
<style>
div.ex1 {
  width: 300px;
  background-color: yellow;
}

div.ex2 {
  width: 300px;
  padding: 25px;
  box-sizing: border-box;
  background-color: lightblue;
}
</style>
</head>
<body>

<h2>Padding and element width - with box-sizing</h2>

<div class="ex1">This div is 300px wide.</div>
<br>

<div class="ex2">The width of this div remains at 300px, in spite of the 50px of total left and right padding, because of the box-sizing: border-box property.
</div>

</body>
</html>


```



| Property | Description |
| :--- | :--- |
| [padding](https://www.w3schools.com/cssref/pr_padding.asp) | A shorthand property for setting all the padding properties in one declaration |
| [padding-bottom](https://www.w3schools.com/cssref/pr_padding-bottom.asp) | Sets the bottom padding of an element |
| [padding-left](https://www.w3schools.com/cssref/pr_padding-left.asp) | Sets the left padding of an element |
| [padding-right](https://www.w3schools.com/cssref/pr_padding-right.asp) | Sets the right padding of an element |
| [padding-top](https://www.w3schools.com/cssref/pr_padding-top.asp) | Sets the top padding of an element |

