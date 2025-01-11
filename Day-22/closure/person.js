var age;
var person = (function() {
    var age = 25;
    return {
        age: 100,
        name: "Jack",

        getAge: function() {
            return this.age;
        },

        getOlder: function() {
            age++;
        },

        setAge: function(a) {
            age = a;
        }
    }
}());

console.log(person.name);
console.log(person.getAge());

person.age = 100;
console.log(person.getAge());

person.getOlder();
console.log(person.getAge());
console.log(person);

person.setAge(200);
console.log(person.getAge());