package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import lombok.RequiredArgsConstructor;


public interface PostService {
    PostDto createPost(PostDto postDto);
}
