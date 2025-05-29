package oop.mind2.t2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<LearningCourse> learningCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.learningCourses = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LearningCourse> getLearningCourses() {
        return learningCourses;
    }

    public void addLearningCourse(LearningCourse course) {
        this.learningCourses.add(course);
    }
}