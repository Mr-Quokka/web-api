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
class Loan {
    private int $account_id;
    private int $approval_id;
    private int $somme;

    function __construct(int $account_id, int $approval_id, int $somme){
        $this->account_id = $account_id;
        $this->approval_id = $approval_id;
        $this->somme = $somme;
    }
}
