<?php
echo"123";
$count = 50;
echo $count;
//$count = "pesho";   --->>> No
//print $count;
var_dump($count);
//$arr = array();
$arr = [1, 2, 3];
$size = count($arr);
foreach ($arr as $i){
    echo ($i);
}
$arr = [1]; // as array
$arr[4] = 1; // as a list
$arr["name"] = "pesho";  // as a dictionary

$dict = [
    "name" => "pesho",
    "age" => "20",
    "last name" => "232323"
    ];
foreach ($dict as $key => $value){
    echo $key . "----" . $value . "<br>";
}

