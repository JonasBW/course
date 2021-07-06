package com.campus.course.repositories;

import com.campus.course.models.Course;

import java.util.List;

public interface ICourseRepository {

    List<Course> getCourses();
    Course getCourseById(String id);
    Course removeCourse(Course courseById);
    Course createCourse(Course course);
}
