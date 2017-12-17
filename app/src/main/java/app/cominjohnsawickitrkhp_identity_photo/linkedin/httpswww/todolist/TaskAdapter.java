package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.todolist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.test.suitebuilder.TestMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter<Task> {
    public TaskAdapter(Activity context, ArrayList<Task> tasks){
        super(context,0, tasks);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View taskItemView = convertView;
        if(taskItemView == null){
            taskItemView = LayoutInflater.from(getContext()).inflate(R.layout.task_layout, parent,false);
            //taskItemView = LayoutInflater.from(getContext()).inflate(R.layout.task_text_only, parent,false);
        }
        Task taskList = getItem(position);

        EditText timeEditText = (EditText)taskItemView.findViewById(R.id.edit_due_date);
        timeEditText.setText(taskList.getDate());
        EditText categoryEditText = (EditText)taskItemView.findViewById(R.id.edit_category);
        categoryEditText.setText(taskList.getCategory());
        EditText taskEditText = (EditText)taskItemView.findViewById(R.id.edit_task_description);
        taskEditText.setText(taskList.getDescription());
        /*
        TextView timeEditText = (TextView)taskItemView.findViewById(R.id.edit_due_date);
        timeEditText.setText(taskList.getDate());
        TextView categoryEditText = (TextView)taskItemView.findViewById(R.id.edit_category);
        categoryEditText.setText(taskList.getCategory());
        TextView taskEditText = (TextView)taskItemView.findViewById(R.id.edit_task_description);
        taskEditText.setText(taskList.getDescription());
        */
        return taskItemView;
    }
}
