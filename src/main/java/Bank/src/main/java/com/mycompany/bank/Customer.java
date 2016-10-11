/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

/**
 *
 * @author lenovo
 */
public class Customer {
    
    private String name;
    private String surName;
    private String dateOfBirth;
    private String creditNum;
    
    

    public Customer(String name, String surName, String dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCreditNum() {
        return creditNum;
    }
    
    
    
}
