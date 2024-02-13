package com.springboot.blog.payload;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class CommentDto {
    private long id;
    private String name;
    private String email;
    private String body;
}
