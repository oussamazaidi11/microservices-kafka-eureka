#!/bin/bash
# start-all.sh

echo "Starting Kafka..."
docker compose up -d

echo "Starting discovery-server..."
cd discovery-server && mvn spring-boot:run > ../logs/discovery-server.log 2>&1 &
cd ..
sleep 15  Eureka time to actually be ready before others register

echo "Starting user-service..."
cd user-service && mvn spring-boot:run > ../logs/user-service.log 2>&1 &
cd ..

echo "Starting order-service..."
cd order-service && mvn spring-boot:run > ../logs/order-service.log 2>&1 &
cd ..

echo "Starting inventory-service..."
cd inventory-service && mvn spring-boot:run > ../logs/inventory-service.log 2>&1 &
cd ..

sleep 10
echo "Starting api-gateway..."
cd api-gateway && mvn spring-boot:run > ../logs/api-gateway.log 2>&1 &
cd ..

echo "All services launching. Check http://localhost:8761 in ~30s."