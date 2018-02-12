// function callback() {
//     let print = function (x) {
//         console.log(x);
//     };
//     [10, 20, 30].forEach((x) => {
//         console.log(x)
//     });
// }
// callback();

function solve() {
    let obj = {name: 'Pesho', age: 19};
    let objAsStr = JSON.stringify(obj);
    obj = JSON.parse(objAsStr);
}