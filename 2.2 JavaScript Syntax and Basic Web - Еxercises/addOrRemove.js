function setValues(myArr) {
    let arr = [];
    for (let i = 0; i < myArr.length; i++) {
        let commands = myArr[i].split(' ');
        switch(commands[0]){
            case 'add':
                arr.push(Number(commands[1]));
                break;
            case 'remove':
                if(Number(commands[1]) >= 0 && Number(commands[1]) < arr.length) {
                    arr.splice(Number(commands[1]), 1);
                    break;
                }
        }
    }
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}
