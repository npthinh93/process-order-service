package com.digital.processorderservice.service.impl;

import com.digital.processorderservice.model.OrderDTO;
import com.digital.processorderservice.model.OrderItemReq;
import com.digital.processorderservice.model.OrderItemRes;
import com.digital.processorderservice.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderItemRes order(OrderItemReq orderItemReq) {
        return null;
    }

    @Override
    public List<OrderDTO> getOrderHistory(Long customerId) {
        return null;
    }
}
