package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nbutton;
    private Button lbutton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nbutton = (Button) findViewById(R.id.nbutton);
        lbutton = (Button) findViewById(R.id.lbutton);
        nbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewUser();
            }
        });
        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwlcomepage();
            }
        });
    }

    private void openNewUser() {
        Intent intent = new Intent(this, NewUser.class);
        startActivity(intent);
    }

    private void openwlcomepage() {
        Intent intent = new Intent(this, wlcomepage.class);
        startActivity(intent);
    }


}