package com.bfs.restdemo.domain.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Post implements Serializable {
    private Integer userId;
    private Integer id;
    private String title;
    private String body;
}
