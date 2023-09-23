package com.example.assignment3.Course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findTop3ByOrderByDateCreatedDesc();

    List<Course> findAllByOrderByDateCreatedDesc();
}