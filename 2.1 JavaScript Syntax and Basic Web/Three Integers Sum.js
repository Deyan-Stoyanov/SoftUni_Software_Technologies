function solve(arr) {
    let [firstNum, secondNum, thirdNum] = arr[0].split(' ').map(Number);
    if(firstNum + secondNum === thirdNum){
        if(firstNum > secondNum){
            [firstNum, secondNum] = [secondNum, firstNum];
        }
        console.log(`${firstNum} + ${secondNum} = ${thirdNum}`);
    }else if(firstNum + thirdNum === secondNum){
        if(firstNum > thirdNum){
            [firstNum, thirdNum] = [thirdNum, firstNum];
        }
        console.log(`${firstNum} + ${thirdNum} = ${secondNum}`);
    }else if(secondNum + thirdNum === firstNum){
        if(secondNum > thirdNum){
            [secondNum, thirdNum] = [thirdNum, secondNum];
        }
        console.log(`${secondNum} + ${thirdNum} = ${firstNum}`);
    }
}
//solve(['8 15 7'])