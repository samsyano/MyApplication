package com.example.samson.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button secondActivityButton;
    Button toastButton;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secondActivityButton = (Button) findViewById(R.id.second_activity);
        toastButton = (Button) findViewById(R.id.buttonToast);
        secondActivityButton.setOnClickListener(this);
        toastButton.setOnClickListener(this);
        username = (EditText) findViewById(R.id.username);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.second_activity:
                Intent startSecondActivity = new Intent(this, SecondActivity.class);
                String name = username.getText().toString();
                startSecondActivity.putExtra("username", name);
                startActivity(startSecondActivity);
                break;
            case R.id.buttonToast:
                Toast.makeText(getBaseContext(), "Toast button clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
