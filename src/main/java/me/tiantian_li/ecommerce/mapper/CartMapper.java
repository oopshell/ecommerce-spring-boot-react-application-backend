package me.tiantian_li.ecommerce.mapper;

import me.tiantian_li.ecommerce.dto.CartDTO;
import me.tiantian_li.ecommerce.dto.CartItemDTO;
import me.tiantian_li.ecommerce.model.Cart;
import me.tiantian_li.ecommerce.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "userId", source = "user.id")
    CartDTO toDTO(Cart cart);  // Convert Cart entity to CartDTO

    @Mapping(target = "user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);  // Convert CartDTO to Cart entity

    @Mapping(target = "productId", source = "product.id")
    CartItemDTO toDTO(CartItem cartItem);  // Convert CartItem entity to CartItemDTO

    @Mapping(target = "product.id", source = "productId")
    CartItem toEntity(CartItemDTO cartItemDTO);  // Convert CartItemDTO to CartItem entity
}
