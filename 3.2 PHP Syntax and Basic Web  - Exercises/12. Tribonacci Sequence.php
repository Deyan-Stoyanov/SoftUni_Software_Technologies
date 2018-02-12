<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        N: <input type="text" name="num" />
        <input type="submit" />
    </form>
    <?php
    if(isset($_GET['num'])){
        $num = intval($_GET['num']);
        $first = 1;
        $second = 1;
        $third = 2;
        echo $first;
        echo "\n";
        echo $second;
        echo "\n";
        echo $third;
        echo "\n";
        $temp1 = $first;
        $temp2 = $second;
        $temp3 = $third;
        for ($i = 3; $i < $num; $i++) {
            $first = $temp1 + $temp2 + $temp3;
            echo $first;
            echo "\n";
            $temp1 = $temp2;
            $temp2 = $temp3;
            $temp3 = $first;
        }
    }
    ?>
</body>
</html>