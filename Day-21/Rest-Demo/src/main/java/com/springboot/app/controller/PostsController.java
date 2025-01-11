package com.springboot.app.controller;


import com.springboot.app.domain.post.Post;
import com.springboot.app.domain.post.PostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
// = @ResponseBody+@Controller
public class PostsController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("posts/user/{userId}")
    public PostResponse getPosts(@PathVariable Integer userId){
        ResponseEntity<Post[]> response = restTemplate
                .exchange("https://jsonplaceholder.typicode.com/posts",
                        HttpMethod.GET,null,Post[].class);
        List<Post> post = Arrays.asList(response.getBody())
                .stream()
                .filter(item-> item.getUserId().equals(userId))
                .collect(Collectors.toList());

        PostResponse postResponse = new PostResponse();
        postResponse.setPosts(post);
        postResponse.setStatusCode(200);
        return postResponse;
    }

    @GetMapping("posts/{postId}")
    public PostResponse getPost(@PathVariable Integer postId){
        ResponseEntity<Post> response = restTemplate
                .exchange("https://jsonplaceholder.typicode.com/posts/{postId}",
                        HttpMethod.GET,null,Post.class,postId);
        Post post = response.getBody();

        PostResponse postResponse = new PostResponse();
        postResponse.setPost(post);
        postResponse.setStatusCode(200);
        return postResponse;
    }
}
