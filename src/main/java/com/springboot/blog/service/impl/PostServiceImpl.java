package com.springboot.blog.service.impl;

import com.springboot.blog.domain.Post;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.repository.PostRepository;
import com.springboot.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;

    @Override
    public PostDto createPost(PostDto postDto) {

        //convert dto to entity
        Post post = Post.builder()
                .title(postDto.getTitle())
                .description(postDto.getDescription())
                .content(postDto.getContent())
                .build();

        Post newPost = postRepository.save(post);

        //convert entity to dto
        PostDto postResponse = PostDto.builder()
                .id(newPost.getId())
                .title(newPost.getTitle())
                .description(newPost.getDescription())
                .content(newPost.getContent())
                .build();

        return postResponse;
    }
}
