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
public class Approval {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long approvalId;
    @Column(name = "status")
    private String status;
    
    Approval(){
        this.status = "pending";
    }
    
    public Approval(String status){
        this.status = status;
    }
    
    
    public Long getApprovalId() {
        return approvalId;
    }

}
