<?php
function celsToFahr(float $cels): float {
    return $cels * 1.8 + 32;
}
function fahrToCels(float $fahr): float {
    return ($fahr - 32) / 1.8;
}
$msgAfterCels = "";
if (isset($_GET['cels'])){
    $cels = floatval($_GET['cels']);
    $fahr = celsToFahr($cels);
    $msgAfterCels = "$cels &deg;C = $fahr &deg;F";
    echo $msgAfterFahr;
}
$msgAfterFahr = "";
if (isset($_GET['fahr'])){
    $fahr = floatval($_GET['fahr']);
    $cels = fahrToCels($fahr);
    $msgAfterCels = "$fahr &deg;F = $cels &deg;C";
    echo $msgAfterCels;
}
?>

<form>
    Celsius: <input type="text" name="cels" />
    <input type="submit" value="Convert">
    <?= $msgAfterCels ?>
</form>

<form>
    Fahrenheit: <input type="text" name="fahr"/>
    <input type="submit" value="Convert">
    <?= $msgAfterFahr ?>
</form>


