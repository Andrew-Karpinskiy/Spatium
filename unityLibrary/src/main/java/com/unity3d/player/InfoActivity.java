package com.unity3d.player;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        openMain();

    }

    private void  openMain() {
        Button main;
        main = findViewById(R.id.backToMain);
        View.OnClickListener listener = v -> {
            Intent unityIntent = new Intent( InfoActivity.this, MainActivity.class);
            InfoActivity.this.startActivity(unityIntent);
            onDestroy();
        };
        main.setOnClickListener(listener);
    }
}
