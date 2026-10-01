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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
        }
    public void setUserId(Long userId) {
        this.userId = userId;
        }
    public String getProductName() {
        return productName;
        }
    public void setProductName(String productName) {
        this.productName = productName;
        }
    public int getQuantity() {
        return quantity;
        }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        }
        
   
    
    
}
