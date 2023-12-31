// function asyncFunc() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("data1");
//             resolve("success")
//         }, 4000);
//     });
// }
// function asyncFunc2() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("data2");
//             resolve("success")
//         }, 4000);
//     });
// }

// Promise chaining
// console.log("Fetching data1.....");
// asyncFunc().then((res) => {
//     console.log("Fetching data2.....");
//     asyncFunc2().then((res) => { });
// });
// let p2 = asyncFunc2();
// p1.then((res)=>{
//     console.log(res);
// })



function getData(dataId) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("data", dataId);
            resolve("success");
        }, 2000);
    });
}

// Async-await
(async function () {
    console.log("getting data 1");
    await getData(1);
    console.log("getting data 2");
    await getData(2);
    console.log("getting data 3");
    await getData(3);
    console.log("getting data 4");
    await getData(4);
})();


// Promise Chaining
// console.log("getting data1 ...."); 
// getData(1).then((res) => {
//     console.log("getting data2 ....");
//     return getData(2)
// }).then((res) => {
//     console.log("getting data3 ....");
//     return getData(3);
// }).then((res) => {
//     console.log(res);
// })

// Callback Hell
// getData(1, ()=> {
//     console.log("getting data2 ....");
//     getData(2,()=>{
//         console.log("getting data3 ...");
//         getData(3,()=>{
//             console.log("getting data4 ....");
//             getData(4);
//         })
//     })
// })

// async function hello() {
//     console.log("Hello");
// }

// function api() {
//     return new Promise((resole,reject) => {
//         setTimeout(() => {
//             console.log("weather data");
//             resole(200);
//         }, 2000);
//     });
// }

// async function getWeatherData() {
//     await api(); // 1st
//     await api(); // 2nd
// }