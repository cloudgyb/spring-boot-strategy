package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;
import com.gyb.spring.springbootstrategy.service.annotation.HandlerType;
import org.springframework.stereotype.Component;

@HandlerType("2")
@Component
public class GroupOrderHandler extends AbstractOrderHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理团购订单："+orderDTO;
    }
}
