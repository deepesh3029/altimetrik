package com.altimetrik.app.orderservice.service;


import com.altimetrik.app.orderservice.model.OrderEntity;

public interface OrderService {
    OrderEntity createOrder(OrderEntity order);
}
