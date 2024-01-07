// const User = {
//     name: "Pradeep",
//     email: "pradeep@gmail.com",
//     isActive: true
// }

// function createUser({ name: string, isPaid: boolean }){}

// createUser({ name: "Pradeep", isPaid: false, email: "h@h.com" });

// let newUser = {name: "Pradeep", isPaid: false, email: "h@h@gmail.com"};

// createUser(newUser);


// function createCourse(): { name: string, price: number } {
//     return { name: "reactjs", price: 399 }
// }

// type User = {
//     name: string;
//     email: string;
//     isActive: boolean;
// }

// type MyString = string;

// function createUser(user: User): User {
//     return {name: "",email: "",isActive: true};
// }

// createUser({name: "",email: "",isActive: true})

type User = {
    readonly _id: string
    name : string
    email : string
    isActive : boolean
    // creditcardDetails?: number
}

type cardNumber = {
    cardnumber:string
}

type cardDate = {
    cardDate: string
}

type cardDetails = cardNumber & cardDate & {
    cvv: number
}

let myUser: User = {
    _id: "1234",
    name: "h",
    email: "h@h.com",
    isActive: false
}

myUser.email = "h@gmail.com"
// myUser._id = "3445"





export { }