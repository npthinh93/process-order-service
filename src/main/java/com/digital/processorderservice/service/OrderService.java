package com.digital.processorderservice.service;

import com.digital.processorderservice.model.OrderDTO;
import com.digital.processorderservice.model.OrderItemReq;
import com.digital.processorderservice.model.OrderItemRes;
import com.digital.processorderservice.model.ShopDTO;

import java.util.List;

public interface OrderService {
    OrderItemRes order(OrderItemReq orderItemReq);

    List<OrderDTO> getOrderHistory(Long customerId);
}
