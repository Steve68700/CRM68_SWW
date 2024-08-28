<?php

function getSum(int $number1, int $number2):int
{
 return $number1 + $number2;
}

function getSub(int $number1, int $number2):int
{
    return $number1 - $number2;
}

function getMulti(float $number1, float $number2):float
{
    return round($number1 * $number2, 2);
}

function getDiv(int $number1, int $number2):float
{
    if($number2 == 0 || $number1 == 0)
    {
        return 0;
    }
    else
    {
        return round($number1 / $number2, 2);
    }
}

echo getSum(5, 3);
echo PHP_EOL;
echo getSub(5, 3);
echo PHP_EOL;
echo getSub(3, 5);
echo PHP_EOL;
echo getMulti(5.6, 3);
echo PHP_EOL;
echo getMulti(5.6, 3.7);
echo PHP_EOL;
echo getDiv(20, 3);
echo PHP_EOL;
echo getDiv(20, 0);