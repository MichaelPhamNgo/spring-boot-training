var person = {
	name: "john",
	age: 40,
	getName: function() {
		return this.name;
	},
	getAge: function() {
		return this.age;
	}
}

console.log(person.getName());
console.log(person.getAge());
