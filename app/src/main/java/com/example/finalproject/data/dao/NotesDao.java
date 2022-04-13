package com.example.finalproject.data.dao;


import com.example.finalproject.modles.Note;
import java.util.List;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface NotesDao {
    @Insert
    public void insert(Note note);

    @Update
    public void update(Note note);

    @Delete
    public void delete(Note note);

    @Query("SELECT * FROM notes WHERE id = :id")
    public Note findById(int id);

    @Query("SELECT * FROM notes WHERE 1")
    public List<Note> getAllNotes();

    @Query("SELECT * FROM notes WHERE courseId = :courseId")
    public List<Note> getCourseNotes(int courseId);
}
