let score: number | string | boolean = 33


score = 44

score = "55"

type User = {
    name: string;
    id: number
}
type Admin = {
    username: string;
    id: number
}

// let user: User = {
//     name: "Pradeep",
//     id: 21
// }

// console.log(user.name);

function getDbId(id: number | string) {
    // if (typeof id === "string"){
    //     id.toLowerCase();
    // }
    // id.toLowerCase();
}

// array

const data: number[] = [1,2,3]
const data2: string[] = ["1","2","4"]
// const data3: (string | number)[] = ["1","2","4",3]
const data3: any[] = ["1","2","4",3]

// let pi:3.14 = 3.14
// pi = 3.14

let seatAllotment : "aisle" | "middle" | "window"

seatAllotment = "aisle"

// seatAllotment = "crew"

export {}