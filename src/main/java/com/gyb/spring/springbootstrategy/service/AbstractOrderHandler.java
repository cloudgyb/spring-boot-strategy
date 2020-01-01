package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;

public abstract class AbstractOrderHandler implements IOrderHandler {
    @Override
    public abstract String handle(OrderDTO orderDTO);
}
