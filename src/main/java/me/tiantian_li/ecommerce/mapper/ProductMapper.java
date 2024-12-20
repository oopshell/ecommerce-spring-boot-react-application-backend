package me.tiantian_li.ecommerce.mapper;

import me.tiantian_li.ecommerce.dto.CommentDTO;
import me.tiantian_li.ecommerce.dto.ProductDTO;
import me.tiantian_li.ecommerce.model.Comment;
import me.tiantian_li.ecommerce.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "imageUrl", source = "imageUrl")
    ProductDTO toDTO(Product product);  // Mapping from Product entity to ProductDTO

    @Mapping(target = "imageUrl", source = "imageUrl")
    Product toEntity(ProductDTO productDTO);  // Mapping from ProductDTO to Product entity
}
