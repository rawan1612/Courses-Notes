package com.example.finalproject.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.finalproject.modles.Note;
import com.example.finalproject.databinding.NotesListItemBinding;
import com.example.finalproject.NoteClickListener;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    private List<Note> notes;
    private NoteClickListener listener;
    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        NotesListItemBinding binding = NotesListItemBinding.inflate(inflater, parent, false);
        return new NotesViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.bind(note);

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public void setDataSource(List<Note> notes) {
        this.notes = notes;
        notifyDataSetChanged();
    }

    public void setListener(NoteClickListener listener) {
        this.listener = listener;
    }

    public class NotesViewHolder extends RecyclerView.ViewHolder {
        private NotesListItemBinding binding;
        public NotesViewHolder(@NonNull  NotesListItemBinding binding) {
            super(binding.getRoot());
            this.binding=binding;


        }
        public void bind(Note note) {
            binding.titleTextView.setText(note.getTitle());
            binding.contentTextView.setText(note.getContent());

            binding.updateButton.setOnClickListener(v -> listener.onUpdate(note.getId()));
            binding.deleteButton.setOnClickListener(v -> listener.onDelete(note));
        }

    }
}
