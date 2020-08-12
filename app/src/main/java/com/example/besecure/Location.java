package com.example.besecure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.GoogleMap;

public class Location extends AppCompatActivity implements GoogleMap.OnMapLoadedCallback {

    Button buttonMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        buttonMap = findViewById(R.id.buttonMap);
       /**
        *buttonMap.setOnClickListener(new View.OnClickListener() {
         *   @Override
          *  public void onClick(View view) {
           *     Intent intent = new Intent(Location.this,MapsActivity.class);
           * }
       * });
       */
    }

    public void btnCurrentLocation(View view){
        Intent intent = new Intent(Location.this,MapsActivity.class);
        startActivity(intent);

    }

    @Override
    public void onMapLoaded() {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}