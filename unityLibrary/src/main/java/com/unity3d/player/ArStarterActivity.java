package com.unity3d.player;

import android.content.Intent;
import android.os.Bundle;


public class ArStarterActivity extends  UnityPlayerActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starter);
        openArActivity();
    }

    private void openArActivity() {
        Intent unityIntent = new Intent( ArStarterActivity.this, UnityPlayerActivity.class);
        ArStarterActivity.this.startActivity(unityIntent);
    }
}
