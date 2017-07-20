 package com.example.tcpclient;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

 public class SetActivity extends AppCompatActivity {
    EditText editTextIPPort;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        context = this;
        editTextIPPort = (EditText) findViewById(R.id.editTextIPPort);


    }

    public void connection(View v){
        String data[] = editTextIPPort.getText().toString().split(":");
        Thread TTCPClient = new Thread(new ThreadTCPClient(data[0], data[1]));
        runOnUiThread(TTCPClient);
    }
    class ThreadTCPClient implements Runnable{
        private String IP,Port;

        public ThreadTCPClient(String IP, String Port){
            this.IP = IP;
            this.Port =  Port;
        }

        @Override
        public void run() {

            Toast.makeText(getApplicationContext(), IP + ":" + Port, Toast.LENGTH_SHORT).show();
        }
     }
}
