package me.tiantian_li.ecommerce.mapper;

import me.tiantian_li.ecommerce.dto.OrderDTO;
import me.tiantian_li.ecommerce.dto.OrderItemDTO;
import me.tiantian_li.ecommerce.model.Order;
import me.tiantian_li.ecommerce.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "orderItems", source = "orderItems")
    OrderDTO toDTO(Order order);  // Convert Order entity to OrderDTO

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "orderItems", source = "orderItems")
    Order toEntity(OrderDTO orderDTO);  // Convert OrderDTO to Order entity

    List<OrderDTO> toDTOs(List<Order> orders);  // Convert a list of Order entities to a list of OrderDTOs

    List<Order> toEntities(List<OrderDTO> orderDTOs);  // Convert a list of OrderDTOs to a list of Order entities

    @Mapping(target = "orderId", source = "order.id")
    @Mapping(target = "productId", source = "product.id")
    OrderItemDTO toOrderItemDTO(OrderItem orderItem);  // Convert OrderItem entity to OrderItemDTO

    @Mapping(target = "order.id", source = "orderId")
    @Mapping(target = "product.id", source = "productId")
    OrderItem toOrderItemEntity(OrderItemDTO orderItemDTO);  // Convert OrderItemDTO to OrderItem entity

    List<OrderItemDTO> toOrderItemDTOs(List<OrderItem> orderItems);  // Convert a list of OrderItem entities to a list of OrderItemDTOs

    List<OrderItem> toOrderItemEntities(List<OrderItemDTO> orderItemDTOs);  // Convert a list of OrderItemDTOs to a list of OrderItem entities
}
