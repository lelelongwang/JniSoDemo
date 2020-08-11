package com.eben.longjunhao.otherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.eben.longjunhao.ndkjnisodemo.ndk.JniUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.other_text);
        textView.setText("三方应用成果调用so库："+JniUtils.getStringFromJNI());
    }
}
