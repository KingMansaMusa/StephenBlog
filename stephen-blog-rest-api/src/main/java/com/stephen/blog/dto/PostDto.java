package com.stephen.blog.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
public class PostDto {

    private UUID id;
    private String title;
    private String description;
    private String content;

}
