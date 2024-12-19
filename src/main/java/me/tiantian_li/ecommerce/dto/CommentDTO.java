package me.tiantian_li.ecommerce.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    @NotBlank(message = "Content is required")
    private String content;
    @Min(value = 1, message = "Rating must be greater than 0")
    @Max(value = 5, message = "Max rating is 5")
    private Integer rating;
    private Long userId;
}
