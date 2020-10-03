---
description: 'https://www.w3schools.com/react/react_es6.asp'
---

# let vs Var vs Const

```javascript


function test(){
	return "sunwei";
}

{
  test = val =>  "Hello " + val ;  //or you can put a let here to let it have block scope


}

console.log(test("sunwei"));
```

#### var

```text
var x = 5.6;
```

If you use `var` outside of a function, it belongs to the global scope.

If you use `var` inside of a function, it belongs to that function.

If you use `var` inside of a block, i.e. a for loop, the variable is still available outside of that block.

`var` has a _function_ scope, not a _block_ scope.

#### let

```text
let x = 5.6;
```

`let` has a _block_ scope.

`let` is the block scoped version of `var`, and is limited to the block \(or expression\) where it is defined.

If you use `let` inside of a block, i.e. a for loop, the variable is only available inside of that loop.

#### const

```text
const x = 5.6;
```

`const` is a variable that once it has been created, its value can never change.

`const` has a _block_ scope.

