package com.los.manya.todotodolist;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import static com.los.manya.todotodolist.R.layout.item_todo;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = (TextView) findViewById(R.id.header);
        switch(id){
            case R.id.add_task :
                Intent intent = new Intent(MainActivity.this, NewTaskActivity.class);
                startActivity(intent);
                return true;
            case R.id.select_task:
                headerView.setText("Выбрать задачи");

                return true;
            case R.id.delete_select_task:

                return true;
            case R.id.deleted:

                return true;
            case R.id.delete_all_done_task:
                headerView.setText("Удалить все выполненные задачи");
                return true;
            case R.id.go_to_folder:
                headerView.setText("К папкам");
                return true;
            case R.id.settings:
                headerView.setText("Настройки");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
