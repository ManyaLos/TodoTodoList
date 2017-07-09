package com.los.manya.todotodolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DeletedTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleted_task);

        setTitle(R.string.deleted_task);

        ListView deleted_task_list = (ListView) findViewById(R.id.deleted_task_list);

        final String[] deleted_task = new String[] {"Задача1", "Задача2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, deleted_task);

        deleted_task_list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.deleted_task_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.select_task:


                return true;
            case R.id.delete_select_task:

                return true;
            case R.id.delete_all_task:

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
