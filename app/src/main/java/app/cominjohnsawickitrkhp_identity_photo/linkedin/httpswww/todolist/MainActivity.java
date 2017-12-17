package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.todolist;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Task> taskName = new ArrayList<Task>();
        taskName.add(new Task("Dec. 25th", "Shopping", "buy gifts", Color.GREEN));
        TaskAdapter adapter = new TaskAdapter(this, taskName);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
