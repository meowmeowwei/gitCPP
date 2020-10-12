---
description: 'https://www.w3schools.com/css/css_selectors.asp'
---

# CSS Selectors

1\) CSS element selector 

```markup
<!DOCTYPE html>
<html>
<head>
<style>
p {
  text-align: center;
  color: red;
} 
</style>
</head>
<body>

<p>Every paragraph will be affected by the style.</p>
<p id="para1">Me too!</p>
<p>And me!</p>

</body>
</html>

```

2\) CSS ID selector 

```markup

<!DOCTYPE html>
<html>
<head>
<style>
#para1 {
  text-align: center;
  color: red;
}
</style>
</head>
<body>

<p id="para1">Hello World!</p>
<p>This paragraph is not affected by the style.</p>

</body>
</html>

```

3\) CSS Class Selector 

```markup
<!DOCTYPE html>
<html>
<head>
<style>
.center {
  text-align: center;
  color: red;
}
</style>
</head>
<body>

<h1 class="center">Red and center-aligned heading</h1>
<p class="center">Red and center-aligned paragraph.</p> 

</body>
</html>


```

4\) Specify only specific HTML elements should be affected by a class

```markup

<!DOCTYPE html>
<html>
<head>
<style>
p.center {
  text-align: center;
  color: red;
}
</style>
</head>
<body>

<h1 class="center">This heading will not be affected</h1>
<p class="center">This paragraph will be red and center-aligned.</p> 

</body>
</html>

```

5\) CSS Universal Selector 

```markup
<!DOCTYPE html>
<html>
<head>
<style>
* {
  text-align: center;
  color: blue;
}
</style>
</head>
<body>

<h1>Hello world!</h1>

<p>Every element on the page will be affected by the style.</p>
<p id="para1">Me too!</p>
<p>And me!</p>

</body>
</html>


```

6\) CSS Grouping Selector 

```markup
<!DOCTYPE html>
<html>
<head>
<style>
h1, h2, p {
  text-align: center;
  color: red;
}
</style>
</head>
<body>

<h1>Hello World!</h1>
<h2>Smaller heading!</h2>
<p>This is a paragraph.</p>

</body>
</html>


```



| Selector | Example | Example description |
| :--- | :--- | :--- |
| [.class](https://www.w3schools.com/cssref/sel_class.asp) | .intro | Selects all elements with class="intro" |
| [\#id](https://www.w3schools.com/cssref/sel_id.asp) | \#firstname | Selects the element with id="firstname" |
| [\*](https://www.w3schools.com/cssref/sel_all.asp) | \* | Selects all elements |
| [element](https://www.w3schools.com/cssref/sel_element.asp) | p | Selects all &lt;p&gt; elements |
| [element,element,..](https://www.w3schools.com/cssref/sel_element_comma.asp) | div, p | Selects all &lt;div&gt; elements and all &lt;p&gt; elements |

