<?php

$tab1 = ['Joe', 'Jack', 'Léa', 'Zoé', 'Néo'];
$tab2 = [];
$tab3 = ['1', '2', '3', '4'];

function firstItem(array $table):?string
{
    if (empty($table)) 
    {
        return null;
    } 
    else 
    {
        return $table[0];
    }
}

function lastItem(array $table):?string
{
    if (empty($table)) 
    {
        return null;
    } 
    else 
    {
        return end($table);
    }
}

function sortItem(array $table):?array
{
    if (empty($table)) 
    {
        return [];
    } 
    else 
    {
        arsort($table);
        return ($table);
    }
}

function stringItems(array $table):string
{
    if (empty($table)) 
    {
        return 'Nothing to display';
    } 
    else 
    {
        asort($table);
        return implode(", ",$table);
    }
}

echo firstItem($tab1); //echo est plus destiné à un affichage alors que var_dump est plus utile en debuguage
echo PHP_EOL;
var_dump(firstItem($tab1));
echo PHP_EOL;
var_dump(firstItem($tab2));
echo PHP_EOL;
var_dump(firstItem($tab3));
echo PHP_EOL;
var_dump(lastItem($tab1));
echo PHP_EOL;
var_dump(lastItem($tab2));
echo PHP_EOL;
var_dump(sortItem($tab1));
echo PHP_EOL;
var_dump(sortItem($tab2));
echo PHP_EOL;
echo stringItems($tab2);
echo PHP_EOL;
var_dump(stringItems($tab1));