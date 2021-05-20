package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv346;
    TextView tv206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv346 = findViewById(R.id.textView346);
        tv206 = findViewById(R.id.textView206);

        tv346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("moduleCode", "C346");
                i.putExtra("moduleName","Mobile App Development");
                i.putExtra("academicYear", 2021);
                i.putExtra("semester",1);
                i.putExtra("moduleCredit",4);
                i.putExtra("venue","E62E");
                startActivity(i);
            }
        });

        tv206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("moduleCode", "C206");
                i.putExtra("moduleName","Software Development Process");
                i.putExtra("academicYear", 2021);
                i.putExtra("semester",1);
                i.putExtra("moduleCredit",4);
                i.putExtra("venue","W67M");
                startActivity(i);
            }
        });
    }
}