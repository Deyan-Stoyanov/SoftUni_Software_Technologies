function setValues(myArr) {
    let arr =[];
    let num = myArr[0];
    for (let i = 0; i < num; i++) {
        arr.push(0);
    }
    for (let i = 1; i < myArr.length; i++) {
        let a = myArr[i].split(' - ');
        if(a[0] >= 0 && a[0] <arr.length){
            arr[a[0]] = a[1];
        }
    }
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i]);
    }
}
