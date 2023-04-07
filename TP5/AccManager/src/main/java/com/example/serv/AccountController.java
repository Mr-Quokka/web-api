/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.serv;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lovalade
 */
@RestController
public class AccountController {
        
        private final AccountRepository repository;
        
        public AccountController(AccountRepository repository) {
            this.repository = repository;
            repository.save(new Account(10000,"high"));
        }
        
        @RequestMapping("/")
        public String index() {
            
            return "Account Manager !";
        }
        
        @RequestMapping(value = "/accounts", method = RequestMethod.GET, produces = "application/json")
        public @ResponseBody List<Account> getallaccounts(){
            List<Account> accounts = new ArrayList<Account>();
            
            for(Account a: repository.findAll()){
                accounts.add(a);
            }
            return accounts;
        }
        
        @RequestMapping(value = "/accounts/account/{id}", method = RequestMethod.GET, produces = "application/json")
        public @ResponseBody Account getallaccountbyid(@PathVariable Long id) throws Exception{
            
            return repository.findById(id).orElseThrow(()-> new Exception("error get id :"+id));
            
        }
        
        @PostMapping(value= "/addaccount", consumes = "application/json")
        public void addaccount(@RequestBody Account a){
            repository.save(a);
        }
}
