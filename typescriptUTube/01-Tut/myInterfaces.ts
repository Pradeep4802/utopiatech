interface User {
    readonly dbId: number
    email: string,
    userId: number,
    googleId?: string
    startTrail: () => string
    // startTrail(): string
    getCoupon(couponname: string, off: number): number
}

const hitesh: User = { dbId: 22, email: "p@p.com", userId: 2211,
startTrail: () => {
    return 10
},
getCoupon: (name: "pradeep10",off: 10) => {
    return 10
}
}

hitesh.email = "h@h.com";

console.log(hitesh);

export { }