package com.gyb.spring.springbootstrategy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String code;
    private BigDecimal price;
    /**
     * 订单类型
     * 1:普通订单
     * 2：团购订单
     * 3：促销订单
     */
    private String type;
}
