package com.test.myapplication;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        process();
        // test
        Log.i("==>", "Hello World");
    }

    private void process() { Log.i("==>", "Hello World");
    System.out.println(getText());
    }

    private String getText() {
        return "NEXT";
    }
}
