<?php

$a = 20;

function square_formula($a = 0, $b = 0, $c = 0)
{
    $d = $b * $b - 4 * $a * $c;
    if ($d < 0) {
        return false;
    }
    $x1 = (-1 * $b + sqrt($d)) / (2 * $a);
    $x2 = (-1 * $b - sqrt($d)) / (2 * $a);

    return [
        $x1, $x2
    ];
}


$r = square_formula(10, 20, -30);

print_r($r);

// echo square_formula(1, 1);

// echo square_formula(1, 1, -4);

// echo $a;
