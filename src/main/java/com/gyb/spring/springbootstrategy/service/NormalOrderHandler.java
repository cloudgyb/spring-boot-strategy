package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;
import com.gyb.spring.springbootstrategy.service.annotation.HandlerType;
import org.springframework.stereotype.Component;

@HandlerType("1")
@Component
public class NormalOrderHandler extends AbstractOrderHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理普通订单："+orderDTO;
    }
}
