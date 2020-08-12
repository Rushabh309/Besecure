package com.example.besecure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class logout extends AppCompatActivity {

    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        logout = findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent broadcastIntent = new Intent();
                broadcastIntent.setAction("com.package.ACTION_LOGOUT");
                sendBroadcast(broadcastIntent);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.package.ACTION_LOGOUT");
                registerReceiver(new BroadcastReceiver() {

                    @Override
                    public void onReceive(Context context, Intent intent) {
                        Log.d("onReceive","Logout in progress");
                        //At this point you should start the login activity and finish this one
                        finish();
                    }
                }, intentFilter);
            }
        });
}
}
