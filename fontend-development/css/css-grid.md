# CSS Grid

Flex box is one dimensions

CSS Grids is two dimensions 



1\) form the items in a div with class name of your choice e.g. "container"

```text

<body>
  <div class="conainer">
    <div class="zone green">🦊</div>
    <div class="zone red">🐰</div>
    <div class="zone blue">🐸</div>
    <div class="zone yellow">🦁</div>
    <div class="zone purple">🐯</div>
    <div class="zone brown">🐭</div>
    <div class="zone green">🦄</div>
    <div class="zone red">🐲</div>
    <div class="zone blue">🐷</div>
    <div class="zone yellow">🐺</div>
    <div class="zone purple">🐼</div>
    <div class="zone brown">🐻</div>
  </div>
</body>

```

2\) in style.css, call display:grid

```css

.container{
    display:grid;
    grid-template-columns: 300px 300px;   // will auto assume 2 columns 
    
    //alternatively can use fr (fraction )
    
    grid-template-columns: 1fr 1fr; // it's better and more responsive 
    
    // alternatively
    grid-template-columns: repeat(2, 1fr);
    
    // alternatively    
    grid-template-columns: auto 1fr 1fr; 
            
    grid-gap: 20px;  // gap between the boxes 
    
    justify-items: end; //front
    
    grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
}

```

![](../../.gitbook/assets/image%20%28323%29.png)



