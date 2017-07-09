package com.los.manya.todotodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setTitle(R.string.settings);

        final Spinner font_size_spinner = (Spinner) findViewById(R.id.font_size_spinner);

        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.font_size, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        font_size_spinner.setAdapter(adapter);

        final Spinner sort_spinner = (Spinner) findViewById(R.id.sort_spinner);

        ArrayAdapter<?> folder_adapter = ArrayAdapter.createFromResource(this, R.array.sort, android.R.layout.simple_spinner_item);
        folder_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sort_spinner.setAdapter(folder_adapter);
    }
}
