/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.serv;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lovalade
 */
@RestController
public class ApprovalController {
        
        private final ApprovalRepository repository;
        
        public ApprovalController(ApprovalRepository repository) {
            this.repository = repository;
            repository.save(new Approval());
            repository.save(new Approval("pending"));
            repository.save(new Approval("accepted"));
            repository.save(new Approval("rejected"));

        }
        
        @RequestMapping("/")
        public String index() {
            
            return "Approval Manager !";
        }
        
        @RequestMapping(value = "/approvals", method = RequestMethod.GET, produces = "application/json")
        public @ResponseBody List<Approval> getallaccounts(){
            List<Approval> accounts = new ArrayList<Approval>();
            
            for(Approval a: repository.findAll()){
                accounts.add(a);
            }
            return accounts;
        }
        
        @RequestMapping(value = "/approvals/approval/{id}", method = RequestMethod.GET, produces = "application/json")
        public @ResponseBody List<Approval> getallaccountbyid(){
            List<Approval> accounts = new ArrayList<Approval>();
            
            for(Approval a: repository.findAll()){
                accounts.add(a);
            }
            return accounts;
        }
}
