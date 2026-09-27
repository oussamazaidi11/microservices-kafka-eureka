package com.example.order_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name = "app_orders")

public class Order{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private Long userId;
    private String productName;
    private int quantity;


    public Order(){

    }
    public Order(Long userId, String productName, int quantity) {
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
    }
    
   
    
    
}
