package com.example.santoshkonkanachi.myapplication.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Personaldetails extends AppCompatActivity {

        TextView firstname;
        TextView lastname;
        TextView personaldetails;
        TextView home;
        TextView addess;
        TextView cityname;
        TextView pincode;
        TextView province;
        EditText first;
        EditText last;
        EditText add;
        EditText city;
        Spinner spinner;
        ArrayAdapter adapter;

//        TextView textPerAmount;
//        TextView textAmount1;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_personaldetails);
    firstname= findViewById(R.id.firstname);
    lastname= findViewById(R.id.lastname);
    personaldetails= findViewById(R.id.personaldetails);
    home= findViewById(R.id.home);
    addess= findViewById(R.id.address);
    pincode= findViewById(R.id.pincode);
    province = findViewById(R.id.province);
    cityname = findViewById(R.id.cityname);
    first= findViewById(R.id.first);
    last= findViewById(R.id.last);
    add= findViewById(R.id.add);
    city= findViewById(R.id.city);
    add= findViewById(R.id.add);
    spinner= findViewById(R.id.spinner);


    adapter = ArrayAdapter.createFromResource(this, R.array.list, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
        {

            Toast.makeText(Personaldetails.this, parent.getItemAtPosition(position) + " Personal details saved ", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {


            Toast.makeText(Personaldetails.this,  " Please select your provience ", Toast.LENGTH_SHORT).show();

        }


        });
    }
}
