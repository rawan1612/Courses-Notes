package com.example.finalproject.data;

import android.app.Application;

import com.example.finalproject.data.dao.CoursesDao;
import com.example.finalproject.data.dao.NotesDao;
import com.example.finalproject.modles.Course;
import com.example.finalproject.modles.Note;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Course.class, Note.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public abstract CoursesDao coursesDao();

    public abstract NotesDao notesDao();

    public static AppDatabase getInstance(Application application) {
        if (instance == null) {
            instance = Room.databaseBuilder(application.getApplicationContext(),
                    AppDatabase.class,
                    "database.db")
                    .build();
        }
        return instance;
    }
}
