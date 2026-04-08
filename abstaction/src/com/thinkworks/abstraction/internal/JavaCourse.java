package com.thinkworks.abstraction.internal;

import com.thinkworks.abstraction.external.Course;

public class JavaCourse extends Course {

    @Override
    public void enroll() {
        System.out.println("Student enrolls in Java course.");
    }

    @Override
    public void teach() {
        System.out.println("Teaching Java concepts.");
    }

    @Override
    public void grade() {
        System.out.println("Grading Java assignments.");
    }

}
