package com.meanHun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_GetData extends AppCompatActivity {

    TextView getString,getInt,getFloat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        getString = findViewById(R.id.getString);
        getInt = findViewById(R.id.getInt);
        getFloat = findViewById(R.id.getFloat);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("send");

        getString.setText("getString: "+bundle.getString("sendStr"));
        getInt.setText("getInt: "+bundle.getInt("sendInt"));
        getFloat.setText("getFloat: "+bundle.getFloat("sendFloat"));
    }
}