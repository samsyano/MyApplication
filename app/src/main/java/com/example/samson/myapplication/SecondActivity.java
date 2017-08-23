package com.example.samson.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by SAMSON on 8/21/2017.
 */

public class SecondActivity extends AppCompatActivity {
    TextView userText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userText = (TextView) findViewById(R.id.second_text);
        Intent messenger = getIntent();
        String data = messenger.getStringExtra("username");
        userText.setText(data);
    }
}
