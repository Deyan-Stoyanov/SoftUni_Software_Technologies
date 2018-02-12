function storeObjects(arr) {
    for (let i = 0; i < arr.length; i++) {
        let line = arr[i].split(' -> ');
        let obj = {name: line[0], age: Number(line[1]), grade: line[2]};
        console.log(`Name: ${obj.name}`);
        console.log(`Age: ${obj.age}`);
        console.log(`Grade: ${obj.grade}`);
    }
}