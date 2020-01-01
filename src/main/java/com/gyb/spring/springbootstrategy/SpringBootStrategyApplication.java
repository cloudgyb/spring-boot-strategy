package com.gyb.spring.springbootstrategy;

import com.gyb.spring.springbootstrategy.dto.OrderDTO;
import com.gyb.spring.springbootstrategy.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootStrategyApplication {

    private IOrderService orderService;

    @Autowired
    public SpringBootStrategyApplication(IOrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStrategyApplication.class, args);
    }


    @RequestMapping("/")
    public String index(@RequestBody OrderDTO orderDTO) {
        return orderService.handle(orderDTO);
    }


}
