package me.tiantian_li.ecommerce.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDTO {
    private Long id;
    @Positive(message = "Quantity must be positive")
    private Integer quantity;
    @Positive(message = "Price must be positive")
    private BigDecimal price;
    private Long orderId;
    private Long productId;
}
