package com.example.ElectivCourses.model.dto;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class CourseDTO {
    private Long id;

    private String courseName;

    private int maxStudents;

    private int studyYear;

    private String category;

    private DayOfWeek dayOfWeek;

    private LocalTime time;

    private Long teacher_id;

    public CourseDTO(Long id, String courseName, int maxStudents, int studyYear, String category, DayOfWeek dayOfWeek, LocalTime time, Long teacher_id) {
        this.id = id;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.studyYear = studyYear;
        this.category = category;
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        this.teacher_id = teacher_id;

    }

    public CourseDTO() {
    }
    public CourseDTO(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Long getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Long teacher_id) {
        this.teacher_id = teacher_id;
    }
}
