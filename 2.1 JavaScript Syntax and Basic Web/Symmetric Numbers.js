function solve(arr) {
    let firstNum = +arr[0];
    let symetricNums = [];
    for (let i = 1; i < firstNum; i++) {
        if(isSymetric(i)){
            symetricNums.push(i);
        }
    }
    console.log(symetricNums.join(' '));
    function isSymetric(num) {
       let reversedArr = num.toString().split('').reverse();
       let reversedArrToStr = reversedArr.join('');
       return reversedArrToStr === num.toString();
    }
}
//solve(['7500']);