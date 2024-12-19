package me.tiantian_li.ecommerce.dto;

import lombok.Data;
import me.tiantian_li.ecommerce.model.Order;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    private String address;
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDateTime createdAt;
    private Long userId;
    private List<OrderItemDTO> orderItems;
}
