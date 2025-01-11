class Animal {
	constructor(species) {
		this.species = species;
	}
	
	getSpecies() {
		return this.species;
	}
}

class Bird extends Animal {
	constructor(species, wingspan) {
		super(species);
		this.wingspan = wingspan;
	}
}

var a1 = new Animal("wolf");
var a2 = new Bird("chicken", 60);
console.log(a1.getSpecies());
console.log(a2.getSpecies());