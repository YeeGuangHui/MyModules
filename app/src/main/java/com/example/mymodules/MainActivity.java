package com.example.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modulecode", "C346");
                intent.putExtra("modulename", "Android Programming");
                intent.putExtra("academicyear", 2018);
                intent.putExtra("semester", 1);
                intent.putExtra("modulecredit", 4);
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modulecode", "C349");
                intent.putExtra("modulename", "iPad Programming");
                intent.putExtra("academicyear", 2019);
                intent.putExtra("semester", 2);
                intent.putExtra("modulecredit", 4);
                intent.putExtra("venue", "W16A");
                startActivity(intent);

            }
        });
    }
}