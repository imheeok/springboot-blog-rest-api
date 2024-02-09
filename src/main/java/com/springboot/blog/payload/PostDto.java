package com.springboot.blog.payload;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
}
