function addTwo(num: number) : number {
    return num + 2;
}

function getUpper(val: string) {
    return val.toUpperCase();
}

function signUpUser(name: string, email: string, isPaid: boolean) {

}

let loginUser = (name:string,email:string,isPaid:boolean = false) => {
    email
}

addTwo(5);
getUpper("hitesh");

signUpUser("Pradeep", "Pradeep@gmail.com", false);
loginUser("p", "p@gmail.com");

// function getValue(myVal: number): boolean {
//     if(myVal > 5) {
//         return true;
//     }
//     return "200 OK";
// }

// getValue(5);

const getHello = (s:string):string => {
    return "";
}

const heros = ["thor","spiderman","ironman"];
// const heros = [1,2,3];

heros.map((hero): string => {
    return `hero is ${hero}`;
    // return 1;
})

function consoleError(errmsg: string): void {
    console.log(errmsg);
}

function handleError(errmsg: string): never {
    throw new Error(errmsg);
}


export { }