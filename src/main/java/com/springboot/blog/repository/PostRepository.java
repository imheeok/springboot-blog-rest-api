package com.springboot.blog.repository;

import com.springboot.blog.domain.Post;
import com.springboot.blog.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
}
