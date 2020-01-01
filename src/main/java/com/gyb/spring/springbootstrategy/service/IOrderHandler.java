package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;

public interface IOrderHandler {
    String handle(OrderDTO orderDTO);
}
