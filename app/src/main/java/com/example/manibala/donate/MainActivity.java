package com.example.manibala.donate;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1, ed2, ed3, ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.clientId);
        ed1 = (EditText)findViewById(R.id.clientPas);
        ed1 = (EditText)findViewById(R.id.scope);
        ed1 = (EditText)findViewById(R.id.orId);


    }
    public void onClick(View view){
        Intent intent = new Intent(this, Donate.class);
        startActivity(intent);
    }
}
