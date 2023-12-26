package com.altp.orderservice.api.controller;

import com.altp.orderservice.api.common.Payment;
import com.altp.orderservice.api.common.TransactionRequest;
import com.altp.orderservice.api.common.TransactionResponse;
import com.altp.orderservice.api.entity.Order;
import com.altp.orderservice.api.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.support.TransactionalRepositoryFactoryBeanSupport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService service;
   @PostMapping("/bookOrder")
   public TransactionResponse bookOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {

       return service.saveOrder(request);
    }
}
