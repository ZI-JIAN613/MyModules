package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer = findViewById(R.id.textView);
        btnBack = findViewById(R.id.button);

        Intent i = getIntent();
        String code = i.getStringExtra("moduleCode");
        String name = i.getStringExtra("moduleName");
        int year = i.getIntExtra("academicYear", 0);
        int semester = i.getIntExtra("semester", 0);
        int credit = i.getIntExtra("moduleCredit", 0);
        String venue = i.getStringExtra("venue");

        tvAnswer.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: " + year + "\nSemester: " + semester + "\nModule Credit: " + credit + "\nVenue: " + venue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}