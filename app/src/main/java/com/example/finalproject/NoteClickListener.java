package com.example.finalproject;


import com.example.finalproject.modles.Note;

public interface NoteClickListener {
    public void onUpdate(int Id);

    public void onDelete(Note note);
}
