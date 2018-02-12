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
        for($i = $num; $i > 0; $i--){
            $isPrime = false;
            for ($j = 2; $j < $i; $j++) {
                if($i % $j == 0){
                    $isPrime = false;
                    break;
                }else{
                    $isPrime = true;
                }
            }
            if($isPrime == true){
                echo $i;
                echo " ";
            }
        }
        echo 2;
    }
    ?>
</body>
</html>