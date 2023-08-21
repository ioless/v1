<?php

echo "enter number:";
$number = readline();

echo "enter function (* or +):";
$f = readline();

if (!in_array($f, ["+", "*"])) {
    echo "not EXISTS!";
    die;
}


if ($f == "+") {
    $sum = 0;
}
if ($f == "*") {
    $sum = 1;
}

for ($i = 1; $i <= $number; $i++) {

    if ($f == "*") {
        $sum = $sum * $i;
    }

    if ($f == "+") {
        $sum = $sum + $i;
    }
}
echo $sum;
