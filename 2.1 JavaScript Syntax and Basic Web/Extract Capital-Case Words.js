function findWords(arr) {
    let arrAsStr = arr.join(',');
    let words = arrAsStr.split(/\W+/);
    words = words.filter(w => w.length > 0);
    words = words.filter((w) => {
        return w === w.toUpperCase()
    });
    console.log(words.join(', '));
}

findWords(['We start by HTML, CSS, JavaScript, JSON and REST.'],
    ['Later we touch some PHP, MySQL and SQL.'],
    ['Later we play with C#, EF, SQL Server and ASP.NET MVC.'],
    ['Finally, we touch some Java, Hibernate and Spring.MVC.']
);