<?php

$date = date_create("Y-m-d");

function getToday():string
{
    return date("d/m/Y");
}

function getTimeLeft(string $date):string
{
    if($date < date('Y-m-d'))
    {
        return 'Évènement passé';
    }
    if($date === date('Y-m-d'))
    {
        return "Aujourd'hui";
    }
}

echo getToday();
echo PHP_EOL;
//echo getTimeLeft("2022/04/22");
echo PHP_EOL;
echo getTimeLeft("2022-04-22");
echo PHP_EOL;
echo getTimeLeft("2024-08-28");
