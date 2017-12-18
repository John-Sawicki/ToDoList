package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.todolist;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Task> taskName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taskName = new ArrayList<Task>();
        taskName.add(new Task("Dec. 25th", "Shopping", "buy gifts", Color.GREEN));
        TaskAdapter adapter = new TaskAdapter(this, taskName);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taskName.add(new Task(" ", " ", " ", Color.GREEN));
            }
        });
    }
}
