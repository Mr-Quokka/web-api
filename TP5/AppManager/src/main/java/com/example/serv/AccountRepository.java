/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.serv;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author lovalade
 */
interface ApprovalRepository extends CrudRepository<Approval, Long> {
    Approval findById(long id);
}
