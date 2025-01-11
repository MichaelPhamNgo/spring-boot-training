function Person(username, password) {
	this.username = username;
	this.password = password;
}

var jack = new Person("Jack", "jack");

console.log(Person.prototype === undefined);
console.log(jack.prototype === undefined);
console.log(Object.getPrototypeOf(jack) === undefined);