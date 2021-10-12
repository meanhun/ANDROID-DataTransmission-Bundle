package com.meanHun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity_GetData.class);
                Bundle bundle = new Bundle();
                bundle.putString("sendStr","Dữ liệu gửi STRING");
                bundle.putInt("sendInt",48);
                bundle.putFloat("sendFloat",47f);

                // if use objet: bundle.putSerializable("key",name_object);

                intent.putExtra("send",bundle);
                startActivity(intent);
            }
        });
    }
}