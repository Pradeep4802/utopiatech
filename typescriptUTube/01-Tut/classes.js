class myFr {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    getName = (name) => {
        console.log(this.name = name);
    }
    getAge = (age) => {
        console.log(age);
    }
}

class newFr extends myFr {
    constructor(name, age, loc) {
        super(name, age)
        this.name = name;
    }
    move = () => console.log(`I'm moving at the speed of ${this.speed}!`)
}

const stud1 = new myFr("Pradeep", 21);
const newfr = new newFr("Manish", 22, "Airoli");
// console.log(stud1.getName("Manish"));
console.log(newfr.getAge(65));
console.log(newfr.move());