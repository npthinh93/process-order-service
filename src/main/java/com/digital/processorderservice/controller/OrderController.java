package com.digital.processorderservice.controller;

import com.digital.processorderservice.constant.ResourcePath;
import com.digital.processorderservice.model.OrderDTO;
import com.digital.processorderservice.model.ShopDTO;
import com.digital.processorderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = ResourcePath.API_ENDPOINT + ResourcePath.API_VERSION_V1 + ResourcePath.ORDER_URI)
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping(ResourcePath.GET_ORDER_HISTORY)
    public ResponseEntity<List<OrderDTO>> getOrderHistory(@RequestParam("customerId") Long customerId) {
        return ResponseEntity.ok(orderService.getOrderHistory(customerId));
    }
}
