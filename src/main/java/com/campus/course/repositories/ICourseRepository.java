package com.campus.course.repositories;

import com.campus.course.models.Course;

import java.util.List;

public interface ICourseRepository {

    List<Course> getCourses();
    Course saveCourse(Course course);
    Course getCourseById(String id);
}
