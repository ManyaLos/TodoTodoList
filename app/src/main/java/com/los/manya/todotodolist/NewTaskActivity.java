package com.los.manya.todotodolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class NewTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);

        setTitle(R.string.new_task);

        final Spinner priority_spinner = (Spinner) findViewById(R.id.priority_spinner);

        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.priority, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        priority_spinner.setAdapter(adapter);

        final Spinner folder_spinner = (Spinner) findViewById(R.id.folder_spinner);

        ArrayAdapter<?> folder_adapter = ArrayAdapter.createFromResource(this, R.array.folder, android.R.layout.simple_spinner_item);
        folder_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        folder_spinner.setAdapter(folder_adapter);
    }

    public void onClick(View view){
        Intent intent = new Intent(NewTaskActivity.this, DateActivity.class);
        startActivity(intent);
    }

    public void TimeonClick(View view){
        Intent intent = new Intent(NewTaskActivity.this, TimeActivity.class);
        startActivity(intent);
    }
}
