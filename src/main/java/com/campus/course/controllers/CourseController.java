package com.campus.course.controllers;

import com.campus.course.models.Course;
import com.campus.course.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses/")
public class CourseController {

    @Autowired
    private ICourseRepository courseRepository;

    @GetMapping(value="single/{id}", produces = "application/json")
    public Course getSingleCourse(@PathVariable(name = "id", required = true) String id) {
        Course course = courseRepository.getCourseById(id);

        return course;
    }

    @GetMapping("all")
    public List<Course> getAllCourses() {
        return this.courseRepository.getCourses();
    }

    @PostMapping("new")
    public void createCourse(@RequestBody Course newCourse) {
        this.courseRepository.saveCourse(newCourse);
    }
}