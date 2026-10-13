package com.example.order_service.dto;

public class userDto {
     private Long id;
    private String name;
    private String email;
    
    void setId(Long id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }
    String getEmail() {
        return email;
    }
    Long getId() {
        return id;
    }
    void setEmail(String email) {
        this.email = email;
    }
    String getName() {
        return name;
    }
    userDto() {
        this.id = id;
        this.name = name;
        this.email = email;
        
    }
}
