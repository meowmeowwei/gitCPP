---
description: 'https://www.w3schools.com/css/css_border.asp'
---

# CSS Borders

1\) border style

```markup

<!DOCTYPE html>
<html>
<head>
<style>
p.dotted {border-style: dotted;}
p.dashed {border-style: dashed;}
p.solid {border-style: solid;}
p.double {border-style: double;}
p.groove {border-style: groove;}
p.ridge {border-style: ridge;}
p.inset {border-style: inset;}
p.outset {border-style: outset;}
p.none {border-style: none;}
p.hidden {border-style: hidden;}
p.mix {border-style: dotted dashed solid double;}
</style>
</head>
<body>

<h2>The border-style Property</h2>
<p>This property specifies what kind of border to display:</p>

<p class="dotted">A dotted border.</p>
<p class="dashed">A dashed border.</p>
<p class="solid">A solid border.</p>
<p class="double">A double border.</p>
<p class="groove">A groove border.</p>
<p class="ridge">A ridge border.</p>
<p class="inset">An inset border.</p>
<p class="outset">An outset border.</p>
<p class="none">No border.</p>
<p class="hidden">A hidden border.</p>
<p class="mix">A mixed border.</p>

</body>
</html>

```

2\) border-width

p.three { border-style: solid; border-width: 25px 10px 4px 35px; / _25px top, 10px right, 4px bottom and 35px left_ / }

3\) border-color

4\) Border Sides

p { border-top-style: dotted; border-right-style: solid; border-bottom-style: dotted; border-left-style: solid; }

5\) Border shortHand



### CSS Border - Shorthand Property

Like you saw in the previous page, there are many properties to consider when dealing with borders.

To shorten the code, it is also possible to specify all the individual border properties in one property.

The `border` property is a shorthand property for the following individual border properties:

* `border-width`
* `border-style` \(required\)
* `border-color`

6\) CSS rounded borders

```markup

p {
  border: 2px solid red;
  border-radius: 5px;
}
```



### All CSS Border Properties

| Property | Description |
| :--- | :--- |
| [border](https://www.w3schools.com/cssref/pr_border.asp) | Sets all the border properties in one declaration |
| [border-bottom](https://www.w3schools.com/cssref/pr_border-bottom.asp) | Sets all the bottom border properties in one declaration |
| [border-bottom-color](https://www.w3schools.com/cssref/pr_border-bottom_color.asp) | Sets the color of the bottom border |
| [border-bottom-style](https://www.w3schools.com/cssref/pr_border-bottom_style.asp) | Sets the style of the bottom border |
| [border-bottom-width](https://www.w3schools.com/cssref/pr_border-bottom_width.asp) | Sets the width of the bottom border |
| [border-color](https://www.w3schools.com/cssref/pr_border-color.asp) | Sets the color of the four borders |
| [border-left](https://www.w3schools.com/cssref/pr_border-left.asp) | Sets all the left border properties in one declaration |
| [border-left-color](https://www.w3schools.com/cssref/pr_border-left_color.asp) | Sets the color of the left border |
| [border-left-style](https://www.w3schools.com/cssref/pr_border-left_style.asp) | Sets the style of the left border |
| [border-left-width](https://www.w3schools.com/cssref/pr_border-left_width.asp) | Sets the width of the left border |
| [border-radius](https://www.w3schools.com/cssref/css3_pr_border-radius.asp) | Sets all the four border-\*-radius properties for rounded corners |
| [border-right](https://www.w3schools.com/cssref/pr_border-right.asp) | Sets all the right border properties in one declaration |
| [border-right-color](https://www.w3schools.com/cssref/pr_border-right_color.asp) | Sets the color of the right border |
| [border-right-style](https://www.w3schools.com/cssref/pr_border-right_style.asp) | Sets the style of the right border |
| [border-right-width](https://www.w3schools.com/cssref/pr_border-right_width.asp) | Sets the width of the right border |
| [border-style](https://www.w3schools.com/cssref/pr_border-style.asp) | Sets the style of the four borders |
| [border-top](https://www.w3schools.com/cssref/pr_border-top.asp) | Sets all the top border properties in one declaration |
| [border-top-color](https://www.w3schools.com/cssref/pr_border-top_color.asp) | Sets the color of the top border |
| [border-top-style](https://www.w3schools.com/cssref/pr_border-top_style.asp) | Sets the style of the top border |
| [border-top-width](https://www.w3schools.com/cssref/pr_border-top_width.asp) | Sets the width of the top border |
| [border-width](https://www.w3schools.com/cssref/pr_border-width.asp) | Sets the width of the four borders |

