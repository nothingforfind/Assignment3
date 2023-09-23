package com.example.assignment3.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getThreeLatestPosts() {
        return postRepository.findTop3ByOrderByDateCreatedDesc();
    }

    public List<Post> getAllPosts() {
        return postRepository.findAllByOrderByDateCreatedDesc();
    }
}