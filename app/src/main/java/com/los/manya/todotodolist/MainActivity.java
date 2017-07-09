package com.los.manya.todotodolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("folder name");

        ListView list_todo = (ListView) findViewById(R.id.list_todo);

        ArrayList<HashMap<String, String>> myList = new  ArrayList<HashMap<String, String>>();
        HashMap<String, String> tmp = new HashMap<String, String>();

        tmp.put("task", "Task1");
        tmp.put("status", "Status1");
        myList.add(tmp);
        tmp = new HashMap<String, String>();
        tmp.put("task", "Task2");
        tmp.put("status", "Status2");
        myList.add(tmp);

        SimpleAdapter adapter = new SimpleAdapter(this, myList, R.layout.my_list_item, new String[] {"task", "status"}, new int[] {R.id.task, R.id.task_status });

        list_todo.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ListView choiceList = (ListView)findViewById(R.id.list_todo);
        int id = item.getItemId();

        switch(id){
            case R.id.add_task :
                Intent intent = new Intent(MainActivity.this, NewTaskActivity.class);
                startActivity(intent);
                return true;
            case R.id.select_task:
                choiceList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
                return true;
            case R.id.delete_select_task:

                return true;
            case R.id.deleted:
                Intent intent2 = new Intent(MainActivity.this, DeletedTaskActivity.class);
                startActivity(intent2);
                return true;
            case R.id.delete_all_done_task:

                return true;
            case R.id.go_to_folder:
                Intent intent4 = new Intent(MainActivity.this, FoldersActivity.class);
                startActivity(intent4);
                return true;
            case R.id.settings:
                Intent intent5 = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent5);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
