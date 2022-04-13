package com.example.finalproject.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.finalproject.modles.Course;
import com.example.finalproject.databinding.CoursesListItemBinding;
import com.example.finalproject.CourseClickListener;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder> {
    private List<Course> courses;
    private CourseClickListener listener;
    @NonNull
    @Override
    public CoursesViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CoursesListItemBinding binding = CoursesListItemBinding.inflate(inflater, parent, false);
        return new CoursesViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesAdapter.CoursesViewHolder holder, int position) {
        Course course = courses.get(position);
        holder.bind(course);

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public void setDataSource(List<Course> courses) {
        this.courses = courses;
    }

    public void setListener(CourseClickListener listener) {
        this.listener = listener;
    }

    public class CoursesViewHolder extends RecyclerView.ViewHolder {
        private  CoursesListItemBinding binding;
        public CoursesViewHolder(@NonNull CoursesListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(Course course) {
            binding.nameTextView.setText(course.getName());
            binding.descriptionTextView.setText(course.getDescription());
            binding.getRoot().setOnClickListener(v -> listener.onClick(course.getId()));
            binding.updateButton.setOnClickListener(v -> listener.onUpdate(course.getId()));
            binding.deleteButton.setOnClickListener(v -> listener.onDelete(course));
        }
    }
}
