package com.springboot.app.domain.post;

import lombok.Getter;
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
