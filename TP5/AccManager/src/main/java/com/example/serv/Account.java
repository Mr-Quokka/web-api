/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.serv;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name = "somme")
    private float somme;
    @Column(name = "risk")
    private String risk;
    
    Account(){
        this.somme = 0;
        this.risk = "high";
    }
    
    public Account(float somme, String risk) {
        this.risk = risk;
        this.somme = somme;
    }
    
    public Long getAccountId() {
        return id;
    }
    
    public String getRisk(){
        return risk;
    }
    
    public float getSomme(){
        return somme;
    }

}
