function add() {
    var counter = 0;
    function plus() {
        counter += 1;
    }
    plus();
    return counter;
}

console.log(add());
console.log(add());
console.log(add());


var add2 = (function() {
    var counter = 0;
    return function() {
        counter += 1;
        return counter;
    }
})();

console.log(add2);
console.log(add2());
console.log(add2());