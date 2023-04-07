<?php

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/PHPClass.php to edit this template
 */

/**
 * Description of Employe
 *
 * @author lovalade
 */
class Employe {
    private int $id;
    private string $name;

    function __construct(int $id, string $name){
        $this->id = $id;
        $this->name = $name;
    }

    public function getName(): string {
        return $this->name;
    }

    public function getId(): int {
        return $this->id;
    }
}
