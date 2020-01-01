package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;

public interface IOrderService {
    /**
     * 处理订单
     * @param dto 订单dto
     * @return 为了简单，返回字符串
     */
    String handle(OrderDTO dto);
}
