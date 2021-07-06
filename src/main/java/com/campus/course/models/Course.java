package com.campus.course.models;

public class Course {
    String courseId;
    String courseTitle;
    String courseLevel;
    String courseTeacher;

    public Course(String courseId, String courseTitle, String courseLevel, String courseTeacher) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseLevel = courseLevel;
        this.courseTeacher = courseTeacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
}
