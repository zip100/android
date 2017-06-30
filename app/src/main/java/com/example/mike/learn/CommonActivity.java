package com.example.mike.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CommonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(this.getClass().toString(), "onCreate: ", null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(this.getClass().toString(), "onDestroy: ", null);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(this.getClass().toString(), "onStart: ", null);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(this.getClass().toString(), "onStop: ", null);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(this.getClass().toString(), "onPause: ", null);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(this.getClass().toString(), "onResume: ", null);
    }
}
