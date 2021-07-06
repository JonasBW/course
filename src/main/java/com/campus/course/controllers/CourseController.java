package com.campus.course.controllers;

import com.campus.course.models.Course;
import com.campus.course.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses/")
public class CourseController {

    @Autowired
    private ICourseRepository courseRepository;

    @GetMapping("single")
    public Course getSingleCourse() {
        Course course = new Course("201","Java Advanced", "Niveau 200", "Bas de Hoop");
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