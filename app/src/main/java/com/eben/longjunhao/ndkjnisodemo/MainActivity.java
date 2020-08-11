package com.eben.longjunhao.ndkjnisodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.eben.longjunhao.ndkjnisodemo.ndk.JniUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String stringFromJNI = JniUtils.getStringFromJNI();
        TextView textView = (TextView) findViewById(R.id.jni_text);
         textView.setText(stringFromJNI);
    }
}
