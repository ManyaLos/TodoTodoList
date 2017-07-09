package com.los.manya.todotodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        setTitle(R.string.date);

        DatePicker datePicker = (DatePicker)findViewById(R.id.datePicker);

    }
}
