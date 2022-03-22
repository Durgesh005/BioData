package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bio_Details extends AppCompatActivity {
    TextView name_txt, email_txt, grid_txt, course_txt, gender_txt, dob_txt, mobile_txt, city_txt, state_txt, skills1_txt, skills2_txt, skills3_txt, skills4_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_details);
        binding();

        String name = getIntent().getStringExtra("n1");
        String email = getIntent().getStringExtra("n2");
        String grid = getIntent().getStringExtra("n3");
        String course = getIntent().getStringExtra("n4");
        String birth = getIntent().getStringExtra("n5");
        String number = getIntent().getStringExtra("n6");
        String city = getIntent().getStringExtra("n7");
        String state = getIntent().getStringExtra("n8");
        String other = getIntent().getStringExtra("n10");
        String gender = getIntent().getStringExtra("n11");
        String teamwork = getIntent().getStringExtra("n12");
        String solve = getIntent().getStringExtra("n13");
        String responsibility = getIntent().getStringExtra("n14");
        String leadership = getIntent().getStringExtra("n15");


        name_txt.setText(name);
        email_txt.setText(email);
        grid_txt.setText(grid);
        course_txt.setText(course);
        dob_txt.setText(birth);
        mobile_txt.setText(number);
        city_txt.setText(city);
        state_txt.setText(state);
        gender_txt.setText(gender);
        skills1_txt.setText(teamwork);
        skills2_txt.setText(solve);
        skills3_txt.setText(responsibility);
        skills4_txt.setText(leadership);
        mobile_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no="tel:"+number;
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(no));
                startActivity(i);
            }
        });


    }

    void binding() {
        name_txt = findViewById(R.id.name_txt);
        email_txt = findViewById(R.id.email_txt);
        grid_txt = findViewById(R.id.grid_txt);
        dob_txt = findViewById(R.id.dob_txt);
        gender_txt = findViewById(R.id.gender_txt);
        course_txt = findViewById(R.id.course_txt);
        mobile_txt = findViewById(R.id.mobile_txt);
        city_txt = findViewById(R.id.city_txt);
        state_txt = findViewById(R.id.state_txt);
        skills1_txt = findViewById(R.id.skills1_txt);
        skills2_txt = findViewById(R.id.skills2_txt);
        skills3_txt = findViewById(R.id.skills3_txt);
        skills4_txt = findViewById(R.id.skills4_txt);
    }
}