# JavaScript Custom Objects

```javascript
let car ={
	make:'jeep',
	model: 'Wrangle',
	accelerate:function(){
		return this.model + ' drive away'
	},
	break:function(){
		return this.make + ' pull up'
	}

}

console.log(car.break());
```

