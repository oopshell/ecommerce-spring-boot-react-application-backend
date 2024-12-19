package me.tiantian_li.ecommerce.dto;

import lombok.Data;

@Data
public class CartItemDTO {
    private Long id;
    private Integer quantity;
    private Long cartId;
    private Long productId;
}
