package com.example.finalproject.data.dao;



import com.example.finalproject.modles.Course;
import java.util.List;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface CoursesDao {
    @Insert
    public void insert(Course course);

    @Update
    public void update(Course course);

    @Delete
    public void delete(Course course);

    @Query("SELECT * FROM courses WHERE id = :id")
    public Course findById(int id);

    @Query("SELECT * FROM COURSES WHERE 1")
    public List<Course> getAllCourses();
}
