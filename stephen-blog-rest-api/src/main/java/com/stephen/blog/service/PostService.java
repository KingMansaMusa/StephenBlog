package com.stephen.blog.service;

import com.stephen.blog.dto.PostDto;

import java.util.List;
import java.util.UUID;

public interface PostService {

    PostDto createPost(PostDto  postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(UUID id);

    PostDto updatePost(PostDto postDto, UUID id);

}
