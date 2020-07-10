package com.example.besecure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class RegistrationForm extends AppCompatActivity {

    TextView tvUserInformation;
    EditText etName, etAddress, etContact1, etContact2, etContact3;
    Button btnSubmit;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    private static final String KEY_etName="etName_key";
    private static final String KEY_etAddress="etAddress_key";
    private static final String KEY_etContact1="etContact1_key";
    private static final String KEY_etContact2="etContact2_key";
    private static final String KEY_etContact3="etContact3_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        tvUserInformation = findViewById(R.id.tvUserInformation);
        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAddress);
        etContact1 = findViewById(R.id.etContact1);
        etContact2 = findViewById(R.id.etContact2);
        etContact3 = findViewById(R.id.etContact3);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                //Get all the Values
                String KEY_etName = etName.getText().toString();
                String KEY_etAddress = etAddress.getText().toString();
                String KEY_etContact1 = etContact1.getText().toString();
                String KEY_etContact2 = etContact2.getText().toString();
                String KEY_etContact3 = etContact3.getText().toString();

                String currentuser = FirebaseAuth.getInstance().getCurrentUser().getUid();

                userHelper userhelper = new userHelper(KEY_etName, KEY_etAddress , KEY_etContact1, KEY_etContact2, KEY_etContact3);

                reference.child(currentuser).setValue(userhelper);
                openHome();
            }

        });
    }

    public void openHome() {

        Intent intent = new Intent(this,Homepage.class);
        startActivity(intent);
    }

}

