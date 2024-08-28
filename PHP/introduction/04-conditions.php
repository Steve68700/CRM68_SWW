<?php

function isMajor(int $age):bool
{
    if($age >= 18)
    {
        return true;
    }
    else
    {
        return false;
    }
}

function getRetired(int $age):string
{
    if($age <= 0) // La condition (<= 0) doit être en premier sinon il ne retourne pas la bonne phrase  
    {
        return "Vous n'êtes pas encore né";
    }
    if($age < 60)
    {
        $resultat = 60 - $age;
        return "Il vous reste ".$resultat. " ans avant la retraite.";
    }
    if($age == 60)
    {
        return "Vous êtes à la retraite cette année.";
    }
    if($age > 60)
    {
        $resultat = $age - 60;
        return "Vous êtes à la retraite depuis ".$resultat. " ans.";
    }
}

function getMax(float $number1, float $number2, float $number3):float //Il existe une function Max pour aller plus vite, la fonction trie les nombres automatiquement
{
    if($number1 > $number2 & $number1 > $number3)
    {
        return round($number1, 3);
    }
    if($number2 > $number1 & $number2 > $number3)
    {
        return round($number2, 3);
    }
    if($number3 > $number1 & $number3 > $number2)
    {
        return round($number3, 3);
    }
    if($number1 == $number2 || $number1 == $number3 || $number2 == $number1 || $number2 == $number3 || $number3 == $number1 || $number3== $number2)
    {
        return 0;
    }    
}

function capitalCity(string $country):string
{
    switch($country)
    {
        case "France":
            return "Paris";
            break;
        case "Allemagne":
            return "Berlin";
            break;
        case "Italie":
            return "Rome";
            break;
        case "Maroc":
            return "Rabat";
            break;
        case "Espagne":
            return "Madrid";
            break;
        case "Portugal":
            return "Lisbonne";
            break;
        case "Angleterre":
            return "Londres";
            break;
            default:
            return "Capitale inconnue";
    }
}

var_dump(isMajor(12));
echo PHP_EOL;
var_dump(isMajor(18));
echo PHP_EOL;
var_dump(isMajor(42));
echo PHP_EOL;
echo getRetired(12);
echo PHP_EOL;
echo getRetired(60);
echo PHP_EOL;
echo getRetired(72);
echo PHP_EOL;
echo getRetired(-2);
echo PHP_EOL;
echo getMax(3.1, 2.5, 3.1);
echo PHP_EOL;
echo getMax(9, 10.5, 15.256842698);
echo PHP_EOL;
echo getMax(3.1234, 3.2345, 3.3456);
echo PHP_EOL;
echo capitalCity("France");
echo PHP_EOL;
echo capitalCity("Grèce");
echo PHP_EOL;
echo capitalCity("Italie");
echo PHP_EOL;