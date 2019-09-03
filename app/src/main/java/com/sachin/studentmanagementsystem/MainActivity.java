package com.sachin.studentmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText mUser, mPass;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUser = (EditText) findViewById(R.id.usrEditText);
        mPass = (EditText) findViewById(R.id.passEditText);
        mButton = (Button) findViewById(R.id.login);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUser.getText().toString().trim();
                String password = mPass.getText().toString().trim();
                if(Objects.equals(username,"sachin") && Objects.equals(password,"pass")){
                    Intent intent = new Intent(getApplicationContext(), Menus.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Login successful!",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Username Password doesnot match!",Toast.LENGTH_SHORT).show();
                    Log.d("login",username);
                    Log.d("login",password);
                }
            }
        });
    }
}
