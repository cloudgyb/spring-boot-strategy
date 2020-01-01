package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    private OrderHandlerContext orderHandlerContext;

    @Autowired
    public OrderService(OrderHandlerContext orderHandlerContext) {
        this.orderHandlerContext = orderHandlerContext;
    }

    @Override
    public String handle(OrderDTO dto) {
        IOrderHandler orderHandler = orderHandlerContext.getOrderHandler(dto.getType());
        return orderHandler.handle(dto);
    }
}
