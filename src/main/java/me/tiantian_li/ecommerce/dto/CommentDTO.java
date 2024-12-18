package me.tiantian_li.ecommerce.dto;

import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private String content;
    private Integer rating;
    private Long userId;
}
