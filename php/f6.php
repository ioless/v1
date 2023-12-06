<?php

class QuadraticEquation
{
    public $a;

    private $b;

    private $c;

    public function __construct($a, $b, $c)
    {
        $this->a = $a;
        $this->b = $b;
        $this->c = $c;
    }

    public function getResults()
    {
        $d = $this->b * $this->b - 4 * $this->a * $this->c;
        if ($d < 0) {
            return false;
        }
        $x1 = (-1 * $this->b + sqrt($d)) / (2 * $this->a);
        $x2 = (-1 * $this->b - sqrt($d)) / (2 * $this->a);

        return [
            $x1, $x2
        ];
    }
}

$first = new QuadraticEquation(10, 20, -30);
$firstA = new QuadraticEquation(10, 20, -30);
$r = $first->getResults();

print_r($r);
