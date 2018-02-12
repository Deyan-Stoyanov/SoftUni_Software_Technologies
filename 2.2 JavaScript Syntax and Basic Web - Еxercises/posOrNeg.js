function positiveOrNegative(arr) {
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1]);
    let num3 = Number(arr[2]);
    let counter = 0;
    for (let i = 0; i < arr.length; i++) {
        if(Number(arr[i]) < 0){
            counter++;
        }
        if(Number(arr[i]) === 0){
            return 'Positive';
        }
    }
    if(counter === 1 || counter === 3){
        return 'Negative';
    }else{
        return 'Positive';
    }
}