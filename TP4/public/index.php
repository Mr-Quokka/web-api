<?php
    use Psr\Http\Message\ResponseInterface as Response;
    use Psr\Http\Message\ServerRequestInterface as Request;
    use Slim\Factory\AppFactory;
    require 'Employe.php';

    $loader = require __DIR__ . '/../vendor/autoload.php';
    //for namespace BL PSR4 here namespace ; dir
    $loader->addPsr4('BL\\', __DIR__);
    $app = AppFactory::create();

    $app->get('/', function (Request $request, Response $response, $args) {
        $response->getBody()->write("Hello world!");
        return $response;
    });

    $app->get('/employes', function (Request $request, Response $response, $args) {
        $jsonFile = file_get_contents('Employes.json');

        $employes = json_decode($jsonFile,true);


        foreach ($employes as $val){
            $employe = new Employe($val['id'], $val['name']);

            $response->getBody()->write(" ID de l'employe : " . $employe->getId() . " Nom de l'employe : " . $employe->getName());
        }
        return $response;
    });

    $app->get('/employes/{id}', function (Request $request, Response $response, $args) {
        $jsonFile = file_get_contents('Employes.json');

        $employes = json_decode($jsonFile,true);


        foreach ($employes as $val){
            if($val['id'] === $args['id']){
                $employe = new Employe($val['id'], $val['name']);
                $response->getBody()->write(" ID de l'employe : " . $employe->getId() . " Nom de l'employe : " . $employe->getName());
            }
        }
        return $response;
    });

    $app->post('/employes', function (Request $request, Response $response, $args) {
        $jsonFile = file_get_contents('Employes.json');

        $employes = json_decode($jsonFile,true);

        array_push($employes,new Employe($args['id'],$args['name']));

        return $response;
    });

    $app->run();

?>