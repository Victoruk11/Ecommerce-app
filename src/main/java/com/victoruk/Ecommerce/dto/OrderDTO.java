package com.victoruk.Ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import com.victoruk.Ecommerce.entity.OrderStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    private Long id;
    private BigDecimal totalAmount;
    private OrderStatus orderStatus;
//    private PaymentStatus paymentStatus;

    private UserDTO user;
    private List<OrderItemDTO> orderItems = new ArrayList<>();
    private AddressDTO address;
    private PaymentDTO payment;
}
