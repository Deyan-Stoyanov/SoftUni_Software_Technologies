function storeObjects(arr) {
        let line = arr.map(JSON.parse);
    for (let i = 0; i < line.length; i++) {
        let obj = {name: line[i].name, age: Number(line[i].age), date: line[i].date};
        console.log(`Name: ${obj.name}`);
        console.log(`Age: ${obj.age}`);
        console.log(`Date: ${obj.date}`);
    }
}