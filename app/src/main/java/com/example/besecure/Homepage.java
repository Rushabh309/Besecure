package com.example.besecure;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_homepage);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        else
        if (id == R.id.gps) {

            Intent intent = new Intent(Homepage.this,gps.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.logout) {

            Intent intent = new Intent(Homepage.this,logout.class);
            startActivity(intent);
            return true;
        }
        else
        if (id == R.id.about_us) {
            Intent intent = new Intent(Homepage.this,about_us.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}



