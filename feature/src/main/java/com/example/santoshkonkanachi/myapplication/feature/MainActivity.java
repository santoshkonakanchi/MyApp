package com.example.santoshkonkanachi.myapplication.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView username;
    //Button button;
    Button button;
    TextView password;
   // TextView email;
   // TextView password;
    EditText pass;
    EditText user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        user= findViewById(R.id.user);
        pass= findViewById(R.id.pass);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Personaldetails.class));


            }
        });
    }
}