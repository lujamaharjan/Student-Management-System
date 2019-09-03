package com.sachin.studentmanagementsystem;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Menus extends AppCompatActivity {

    private Button mAdd;
    private Button mUpdate;
    private Button mView;
    private Button mDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        mAdd = findViewById(R.id.addBtn);
        mUpdate = findViewById(R.id.updateBtn);
        mView = findViewById(R.id.viewBtn);
        mDelete = findViewById(R.id.deleteBtn);

        // add button even listner and insert data in database
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), InsertForm.class);
                startActivity(intent);
            }
        });
    }

}
