#!/bin/bash
mkdir -p logs

echo "Stopping Kafka..."
docker compose down 

echo "Stopping discovery-server..."
(cd discovery-server && pkill -f spring-boot:run > ../logs/discovery-server.log 2>&1) &
sleep 15  

echo "Stopping user-service..."
(cd user-service && pkill -f spring-boot:run > ../logs/user-service.log 2>&1) &

echo "Stopping order-service..."
(cd order-service && pkill -f spring-boot:run > ../logs/order-service.log 2>&1) &

echo "Stopping inventory-service..."
(cd inventory-service && pkill -f spring-boot:run > ../logs/inventory-service.log 2>&1) &

sleep 10
echo "Stopping api-gateway..."
(cd api-gateway && pkill -f spring-boot:run > ../logs/api-gateway.log 2>&1) &

echo "All services stopped. Check http://localhost:8761 in ~30s."