package com.los.manya.todotodolist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class FoldersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folders);

        setTitle(R.string.folders);

        ListView list_folders = (ListView)findViewById(R.id.list_folders);

        final String[] folders_list = new String[] {"Папка1", "Папка2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.my_folders_list_item, R.id.folder_name_list, folders_list);

        list_folders.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.folders_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.add_folder :
                final EditText taskEditText = new EditText(this);
                AlertDialog dialog = new AlertDialog.Builder(this)
                        .setTitle(R.string.new_folder)
                        .setView(taskEditText)
                        .setPositiveButton(R.string.folder_add, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton(R.string.folder_cancel, null)
                        .create();
                dialog.show();

                return true;
            case R.id.select_folders:


                return true;
            case R.id.delete_select_folders:

                return true;
            case R.id.delete_all_empty_folders:

                return true;
            case R.id.settings:
                Intent intent = new Intent(FoldersActivity.this, SettingsActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
