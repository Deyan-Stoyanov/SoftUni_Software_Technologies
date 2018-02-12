function storeObjects(arr) {
    let obj = {};
    for (let i = 0; i < arr.length; i++) {
        let line = arr[i].split(' -> ');
        let key = line[0];
        let value = line[1];
        if(value == Number(value)){
            value=Math.round(parseInt(value));
        }
        obj[key] = value;
    }
    let str = JSON.stringify(obj);
    console.log(str);
}