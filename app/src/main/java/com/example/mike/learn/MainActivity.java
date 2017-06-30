package com.example.mike.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends CommonActivity {

    public static final String TAG = "MainActivity";
    public static final Integer BACK_TEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "is  a tet", Toast.LENGTH_SHORT).show();

        // 给活动分配布局
        this.setContentView(R.layout.main);

        // 查找按钮对象（强制转换）
        Button toastButton = (Button) findViewById(R.id.toast_button);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toastIntent = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(toastIntent);
            }
        });

        Button dataButton = (Button) findViewById(R.id.data_button);
        dataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);

                // 给 Intent 添加扩展数据
                intent.putExtra("from", TAG);

                // 启动活动并监听结果
                startActivityForResult(intent, BACK_TEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult: " + data.getStringExtra("back"), null);

        if (requestCode == BACK_TEST && resultCode == RESULT_OK) {
            Toast.makeText(this, "BackMsg:" + data.getStringExtra("back"), Toast.LENGTH_SHORT).show();
        }

    }
}
