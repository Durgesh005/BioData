package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button submit_btn;
    EditText name_edt, email_edt, grid_edt, course_edt, age_edt, mobile_edt, city_edt, state_edt, other_edt;
    RadioGroup rg_group, rd_group;
    RadioButton male_rg_btn, female_rg_btn, no_rd_btn, yes_rd_btn;
    CheckBox teamwork_box, solve_box, responsibility_box, leadership_box;

    String teamwork, solve, responsibility, leadership, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();
        teamwork_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    teamwork = "Teamwork";
                } else {
                    teamwork = "";
                }

            }
        });

        solve_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    solve = "Problem Solving";
                } else {
                    solve = "";
                }
            }
        });
        responsibility_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    responsibility = "Responsibility";
                } else {
                    responsibility = "";
                }
            }
        });
        leadership_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    leadership = "Leadership";
                } else {
                    leadership = "";
                }
            }
        });



        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = name_edt.getText().toString();
                String email = email_edt.getText().toString();
                String grid = grid_edt.getText().toString();
                String course = course_edt.getText().toString();
                String birth = age_edt.getText().toString();
                String number = mobile_edt.getText().toString();
                String city = city_edt.getText().toString();
                String state = state_edt.getText().toString();
                String other = other_edt.getText().toString();
                if (rg_group.getCheckedRadioButtonId() == R.id.male_rg_btn) {
                    gender = "Male";
                } else if (rg_group.getCheckedRadioButtonId() == R.id.female_rg_btn) {
                    gender = "Female";
                }
                if (name_edt.getText().length() == 0) {
                    name_edt.setError("Enter the Name");
                } else if (email_edt.getText().length() == 0) {
                    email_edt.setError("Enter The Email");
                } else if (grid_edt.getText().length() == 0) {
                    grid_edt.setError("Enter The GRID");
                } else if (course_edt.getText().length() == 0) {
                    course_edt.setError("Course Details");
                } else if (age_edt.getText().length() == 0) {
                    age_edt.setError("Date Of Birth");
                } else if (mobile_edt.getText().length() == 0) {
                    mobile_edt.setError("Mobile No");
                } else if (city_edt.getText().length() == 0) {
                    city_edt.setError("City Details");
                } else if (state_edt.getText().length() == 0) {
                    state_edt.setError("State Details");
                }

                else{
                    Intent intent = new Intent(MainActivity.this,Bio_Details.class);
                    intent.putExtra("n1",name);
                    intent.putExtra("n2",email);
                    intent.putExtra("n3",grid);
                    intent.putExtra("n4",course);
                    intent.putExtra("n5",birth);
                    intent.putExtra("n6",number);
                    intent.putExtra("n7",city);
                    intent.putExtra("n8",state);
                    intent.putExtra("n10",other);
                    intent.putExtra("n11",gender);
                    intent.putExtra("n12",teamwork);
                    intent.putExtra("n13",solve);
                    intent.putExtra("n14",responsibility);
                    intent.putExtra("n15",leadership);

                    startActivity(intent);
                }

            }
        });


    }

    void binding() {
        name_edt = findViewById(R.id.name_edt);
        email_edt = findViewById(R.id.email_edt);
        grid_edt = findViewById(R.id.grid_edt);
        age_edt = findViewById(R.id.age_edt);
        course_edt = findViewById(R.id.course_edt);
        mobile_edt = findViewById(R.id.mobile_edt);
        city_edt = findViewById(R.id.city_edt);
        state_edt = findViewById(R.id.state_edt);
        other_edt = findViewById(R.id.other_edt);
        rd_group = findViewById(R.id.rd_group);
        rg_group = findViewById(R.id.rg_group);
        male_rg_btn = findViewById(R.id.male_rg_btn);
        female_rg_btn = findViewById(R.id.female_rg_btn);
        no_rd_btn = findViewById(R.id.no_rd_btn);
        yes_rd_btn = findViewById(R.id.yes_rd_btn);
        teamwork_box = findViewById(R.id.teamwork_box);
        solve_box = findViewById(R.id.solve_box);
        responsibility_box = findViewById(R.id.responsibility_box);
        leadership_box = findViewById(R.id.leadership_box);
        submit_btn = findViewById(R.id.submit_btn);



    }

}