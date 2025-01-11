function Person(name) {
    this.name = name;
    this.sayName = function() {
        console.log(this.name);
    }
}

var person1 = new Person("Jack");
var person2 = new Person;
var person3 = Person("Kyle");

console.log(person1.name);
person1.sayName();

console.log(person2 instanceof Person);
console.log(person2.name);
person2.sayName();

console.log(person3 instanceof Person);