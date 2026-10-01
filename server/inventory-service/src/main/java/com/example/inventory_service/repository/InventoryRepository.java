package com.example.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory_service.model.InventoryItem;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}