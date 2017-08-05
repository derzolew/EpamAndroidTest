package com.derzo.max.helloepamapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String MESSAGE_HELLO = "Hello EPAM!";

    private Button mButtonHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findButtonViews();
        setButtonListeners();
    }

    private void findButtonViews() {
        mButtonHello = (Button) findViewById(R.id.btn_say_hello);
    }

    private void setButtonListeners() {
        mButtonHello.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, MESSAGE_HELLO, Toast.LENGTH_LONG).show();
            }
        });
    }

}