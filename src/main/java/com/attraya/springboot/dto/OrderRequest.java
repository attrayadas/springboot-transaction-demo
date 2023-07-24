package com.attraya.springboot.dto;

import com.attraya.springboot.entity.Order;
import com.attraya.springboot.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
