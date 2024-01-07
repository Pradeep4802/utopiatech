let obj1 = new Object({
    name: "Pradeep",
    age: 21,
    college: 'MCC',
    cust: () => {
        console.log("Hello world");
    },
    verified: false,
});

function family(father, mother, sister) {
    this.father = father;
    this.mother = mother;
    this.sister = sister;
}

let myFam = new family('Jilajeet', 'Santra devi', 'Bandhana');
// console.log(typeof myFam);
// console.log(obj1.name);

// console.log(obj1.cust());

const obj2 = Object.create(obj1);
const obj3 = obj1;
// obj2.cust();
// console.log(obj2.name);
// console.log(obj3.name);
obj3.name = 'Manish';
// console.log(obj3['name']);
// console.log(obj2.age);
obj2.age = 29;
// console.log(obj2.age);

// console.log(typeof "Hey");
// console.log(typeof [1,2,3]);
// console.log(typeof obj1.cust());

for (let i in obj1) {

    if (Object.hasOwnProperty(obj1, i)) {
        result += `${objName}.${i} = ${obj1[i]}\n`;
    }

    // console.log(obj1[i]);
}

let arr1 = Object.keys(obj1);

// console.log("Name: ",Object.getOwnPropertyNames(obj1));

Object.keys(obj1).forEach((i)=>{
    // console.log(`${i} = ${obj1[i]}`);
})

var a = {};
Object.defineProperties(a, {
    one: {enumerable: true, value: 1},
    two: {enumerable: false, value: 2},
});

// console.log(Object.keys(a)); // ["one"]
// console.log(Object.getOwnPropertyNames(a)); // ["one", "two"]

// console.log(Object.getPrototypeOf(obj1));

// console.log(obj1.name);
delete obj1.name;
// console.log(obj1.name);
// console.log('name' in obj1);

function Person(first, last, age, eyecolor) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eyecolor;
  }
  
  const myFather = new Person("John", "Doe", 50, "blue");
  const myMother = new Person("Sally", "Rally", 48, "green");

//   console.log(myFather.firstName);

  Person.nationality = "Indian"

//   console.log(Person.nationality);

const Manager = {
    name: "Karina",
    age: 27,
    job: "Software Engineer",
  };
  const Intern = {
    name: "Tyrone",
    age: 21,
    job: "Software Engineer Intern",
  };
  
  function sayHi() {
    console.log(`Hello, my name is ${this.name}`);
  }
  
  // add sayHi function to both objects
  Manager.sayHi = sayHi;
  Intern.sayHi = sayHi;
  
  console.log(Manager.sayHi()); // Hello, my name is Karina
  console.log(Intern.sayHi()); // Hello, my name is Tyrone

