package com.campus.course.repositories;

import com.campus.course.models.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepository implements ICourseRepository{

    private List<Course> courses;

    public CourseRepository() {
        this.courses = new ArrayList<>();
        this.courses.add(new Course("101","Java Basics", "Niveau 100", "Jan de Vries"));
        this.courses.add(new Course("201","Java Advanced", "Niveau 200", "Bas de Hoop"));
    }

    @Override
    public List<Course> getCourses() {
        return this.courses;
    }

    @Override
    public Course saveCourse(Course course) {
        this.courses.add(course);
        return course;
    }
}
