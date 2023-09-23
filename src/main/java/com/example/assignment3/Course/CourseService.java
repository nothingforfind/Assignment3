package com.example.assignment3.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    /* Lấy danh sách 3 course gần nhất*/
    public List<Course> getThreeLatestCourses() {
        return courseRepository.findTop3ByOrderByDateCreatedDesc();
    }

    /* Lấy danh sách tất cả course theo thứ tự*/
    public List<Course> getAllCourses() {
        return courseRepository.findAllByOrderByDateCreatedDesc();
    }
}