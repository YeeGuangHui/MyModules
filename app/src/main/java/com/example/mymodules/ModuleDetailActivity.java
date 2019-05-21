package com.example.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvmodcode , tvmodname , tvacadyr , tvsem , tvmodcredit , tvvenue;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvmodcode = findViewById(R.id.modcode);
        tvmodname = findViewById(R.id.modname);
        tvacadyr = findViewById(R.id.acadyr);
        tvsem = findViewById(R.id.sem);
        tvmodcredit = findViewById(R.id.modcredit);
        tvvenue = findViewById(R.id.venue);
        btnReturn = findViewById(R.id.btnReturn);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("modulecode");
        String name = intentReceived.getStringExtra("modulename");
        int year = intentReceived.getIntExtra("academicyear" , '0');
        int sem = intentReceived.getIntExtra("semester" , '0');
        int credit = intentReceived.getIntExtra("modulecredit" , '0');
        String venue = intentReceived.getStringExtra("venue");

        tvmodcode.setText("Module Code:" + code);
        tvmodname.setText("Module Name:" + name);
        tvacadyr.setText("Academic Year:" + year);
        tvsem.setText("Semester:" + sem);
        tvmodcredit.setText("Module Credit:" + credit);
        tvvenue.setText("Venue:" + venue);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
