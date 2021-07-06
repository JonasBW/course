package com.campus.course.controllers;

import com.campus.course.models.Course;
import com.campus.course.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class CourseController {

    @Autowired
    private ICourseRepository courseRepository;

    @GetMapping(value="course/{id}", produces = "application/json")
    public Course getSingleCourse(@PathVariable(name = "id", required = true) String id) {
        Course course = courseRepository.getCourseById(id);

        return course;
    }

    @GetMapping("courses/all")
    public List<Course> getAllCourses() {
        return this.courseRepository.getCourses();
    }

    @PutMapping(value = "/course/add", produces = "application/json")
    public Course createCourse(@RequestBody Course course) {
        return this.courseRepository.createCourse(course);
    }

    @DeleteMapping(value = "/course/delete/{id}", produces = "application/json", consumes = "application/json")
    public Course removeCourse(@PathVariable(name = "id", required = true) String id) {
        Course course = courseRepository.removeCourse(courseRepository.getCourseById(id));
        return course;
    }
}