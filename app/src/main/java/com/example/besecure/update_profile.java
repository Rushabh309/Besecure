package com.example.besecure;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class update_profile extends AppCompatActivity {

    EditText Name, Address,Contact1,Contact2,Contact3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_update_profile);

        Name = findViewById(R.id.Name);
        Address = findViewById(R.id.Address);
        Contact1 = findViewById(R.id.Contact1);
        Contact2 = findViewById(R.id.Contact2);
        Contact3 = findViewById(R.id.Contact3);
    }



    }
