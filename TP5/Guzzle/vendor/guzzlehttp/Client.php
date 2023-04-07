<?php

require '../autoload.php';

use GuzzleHttp\Client;

$client = new Client();

$response = $client->request('GET', 'http://localhost:8080/accounts');

echo $response->getBody();


?>