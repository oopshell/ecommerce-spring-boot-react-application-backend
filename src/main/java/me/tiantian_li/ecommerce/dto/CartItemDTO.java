package me.tiantian_li.ecommerce.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    @Positive(message = "Quantity must be positive")
    private Integer quantity;
    private Long cartId;
    private Long productId;
}
