 package com.example.tcpclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

 public class SetActivity extends AppCompatActivity {
    EditText editTextIPPort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        editTextIPPort = (EditText) findViewById(R.id.editTextIPPort);
    }

    public void connection(View v){
        Toast.makeText(getApplicationContext(),editTextIPPort.getText(),Toast.LENGTH_SHORT).show();
    }

}
