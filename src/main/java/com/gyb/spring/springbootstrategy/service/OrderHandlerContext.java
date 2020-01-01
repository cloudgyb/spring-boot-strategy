package com.gyb.spring.springbootstrategy.service;

import com.gyb.spring.springbootstrategy.service.annotation.HandlerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class OrderHandlerContext {
    private Map<String,IOrderHandler> orderHandlerMap;
    private ApplicationContext applicationContext;

    @Autowired
    public OrderHandlerContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        init();
    }

    private void init(){
        Map<String, Object> beans = this.applicationContext.getBeansWithAnnotation(HandlerType.class);
        Collection<Object> values = beans.values();
        this.orderHandlerMap = new HashMap<>(values.size());
        for (Object value : values) {
            HandlerType annotation = value.getClass().getAnnotation(HandlerType.class);
            String orderType = annotation.value();
            orderHandlerMap.put(orderType,(IOrderHandler) value);
        }
    }

    public IOrderHandler getOrderHandler(String type){
        IOrderHandler orderHandler = orderHandlerMap.get(type);
        if(orderHandler == null)
            throw new IllegalArgumentException("不支持的订单类型！");
        return orderHandler;
    }
}
