package me.tiantian_li.ecommerce.mapper;

import me.tiantian_li.ecommerce.dto.CommentDTO;
import me.tiantian_li.ecommerce.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mapping(target = "userId", source = "user.id")
    CommentDTO toDTO(Comment comment);  // Map Comment entity to CommentDTO

    @Mapping(target = "user.id", source = "userId")
    Comment toEntity(CommentDTO commentDTO);  // Map CommentDTO to Comment entity
}
