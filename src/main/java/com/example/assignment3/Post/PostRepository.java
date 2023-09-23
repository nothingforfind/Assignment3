package com.example.assignment3.Post;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findTop3ByOrderByDateCreatedDesc();

    List<Post> findAllByOrderByDateCreatedDesc();
}