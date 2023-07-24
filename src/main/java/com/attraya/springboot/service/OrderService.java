package com.attraya.springboot.service;

import com.attraya.springboot.dto.OrderRequest;
import com.attraya.springboot.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
