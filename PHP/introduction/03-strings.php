<?php

function getMC2():string
{
    return "Albert Einstein";
}

function getUserName(string $firstName, string $lastName):string
{
    return $firstName.$lastName;
}

function getFullName(string $lastName, string $firstName):string
{
    return $firstName." ".mb_convert_case($lastName, MB_CASE_UPPER);
}

function askUser()
{
    return "Bonjour " .getfullName('devoldère', 'mickaël'). " connaissez-vous " .getMC2()." ?";
}


echo getMC2();
echo PHP_EOL;
echo getUserName('mickaël', 'devoldère');
echo PHP_EOL;
echo getFullName('devoldère', 'mickaël');
echo PHP_EOL;
echo askUser();