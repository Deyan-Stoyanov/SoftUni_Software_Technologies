function addKeys(arr) {
    let numbers = [];
    let endKey = arr[arr.length - 1];
    for (let i = 0; i < arr.length - 1; i++) {
        let pair = arr[i].split(' ');
        let command = pair[0];
        numbers[command] = pair[1];
        if(endKey==command){
            console.log(numbers[command]);
        }
    }
    if(!endKey in numbers){
        console.log("None")
    }
}