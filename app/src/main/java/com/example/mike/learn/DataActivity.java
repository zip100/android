package com.example.mike.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DataActivity extends CommonActivity {

    public static final String TAG = "DataActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        this.setTitle("From: " + intent.getStringExtra("from"));

        setContentView(R.layout.layout_data);

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 实例化一个空 Intent
                Intent intent = new Intent();
                // 放入携带数据
                intent.putExtra("back", "back");
                // 设置 Result
                setResult(RESULT_OK, intent);
                // 结束当前活动(只有在 Finish 之后才能收到 Result)
                DataActivity.this.finish();
            }
        });
    }
}
