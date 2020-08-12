package com.example.besecure;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Homepage extends AppCompatActivity {

    Button btnhelp;
    EditText etContact2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btnhelp = findViewById(R.id.btnhelp);
        etContact2 = findViewById(R.id.etContact2);
        btnhelp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Homepage.this,activity_collpage.class);
                startActivity(intent);
            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.help) {

            Intent intent = new Intent(Homepage.this,Help.class);
            startActivity(intent);
            return true;
        }

        else if (id == R.id.gps) {

            Intent intent = new Intent(Homepage.this,Location.class);
            startActivity(intent);
            return true;
        }

        else if (id == R.id.logout) {
            Intent intent = new Intent(Homepage.this,logout.class);
            startActivity(intent);
            return true;
        }

        else if (id == R.id.aboutus) {
            Intent intent = new Intent(Homepage.this,about_us.class);
            startActivity(intent);
            return true;
        }

        else if (id == R.id.privacypolicy) {
            Intent intent = new Intent(Homepage.this,Privacy_Policy.class);
            startActivity(intent);
            return true;
        }
        return false;
    }
}
