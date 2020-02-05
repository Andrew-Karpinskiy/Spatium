package com.unity3d.player;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startUnity();
        exit();
        openInfo();
    }

    private void  startUnity() {
        Button startAR;
        startAR = findViewById(R.id.startAR);
        View.OnClickListener listener = v -> {
            Intent unityIntent = new Intent( MainActivity.this, ArStarterActivity.class);
            MainActivity.this.startActivity(unityIntent);
        };
        startAR.setOnClickListener(listener);
    }

    private void  exit() {
        Button exit;
        exit = findViewById(R.id.exit);
        View.OnClickListener listener = v -> onDestroy();
        exit.setOnClickListener(listener);
    }

    private void  openInfo() {
        Button info;
        info = findViewById(R.id.info);
        View.OnClickListener listener = v -> {
            Intent unityIntent = new Intent( MainActivity.this, InfoActivity.class);
            MainActivity.this.startActivity(unityIntent);
            onDestroy();
        };
        info.setOnClickListener(listener);
    }
}
