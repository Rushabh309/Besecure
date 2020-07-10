package com.example.besecure;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;

public class gps extends FragmentActivity implements GoogleMap.OnMapLoadedCallback {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_gps);

    }

    @Override
    public void onMapLoaded() {

    }
}

