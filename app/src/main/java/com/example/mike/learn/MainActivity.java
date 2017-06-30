package com.example.mike.learn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "is  a tet", Toast.LENGTH_SHORT).show();


        this.setContentView(R.layout.main);
    }
}
