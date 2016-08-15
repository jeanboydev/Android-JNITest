package com.jeanboy.demo.jnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jniTest(View v) {
        Toast.makeText(this, NdkTest.getString(), Toast.LENGTH_SHORT).show();
    }

    public void jniTest2(View v) {

        Toast.makeText(this, String.valueOf(NdkTest.doAdd(5, 12)), Toast.LENGTH_SHORT).show();
    }
}
