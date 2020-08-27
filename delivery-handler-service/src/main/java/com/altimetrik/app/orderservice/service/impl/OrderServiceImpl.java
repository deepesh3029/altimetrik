package com.altimetrik.app.orderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.app.orderservice.model.OrderEntity;
import com.altimetrik.app.orderservice.repository.OrderRepository;
import com.altimetrik.app.orderservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderEntity createOrder(OrderEntity order) {
        order.setOrderTime(System.currentTimeMillis());
        //order.setTotalPrice(order.getItems().stream().mapToInt(e -> e.getPrice() * e.getQuantity()).sum());
        return orderRepository.save(order);
    }
}
