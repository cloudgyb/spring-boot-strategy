package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;
import com.gyb.spring.springbootstrategy.service.annotation.HandlerType;
import org.springframework.stereotype.Component;

@Component
@HandlerType("3")
public class PromotionOrderHandler extends AbstractOrderHandler {
    @Override
    public String handle(OrderDTO orderDTO) {
        return "处理促销订单："+orderDTO;
    }
}
