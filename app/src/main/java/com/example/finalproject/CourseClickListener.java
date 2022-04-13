package com.example.finalproject;
import com.example.finalproject.modles.Course;

public interface CourseClickListener {
    public void onClick(int id);

    public void onUpdate(int id);

    public void onDelete(Course course);
}
