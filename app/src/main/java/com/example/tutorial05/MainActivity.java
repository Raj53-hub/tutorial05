package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun1(View view) {

        EditText efnm = findViewById(R.id.edtFname);
        EditText elnm = findViewById(R.id.edtLname);
        EditText euname = findViewById(R.id.edtUname);
        EditText epass = findViewById(R.id.edtPass);
        CheckBox c1 = (CheckBox)findViewById(R.id.checkBox);
        RadioButton r1 = (RadioButton)findViewById(R.id.rb1);
        Spinner s1 = (Spinner)findViewById(R.id.Spinner);
        Switch sch = (Switch)findViewById(R.id.switch1);



        String fname = efnm.getText().toString();
        String lname = elnm.getText().toString();
        String username  = euname.getText().toString();
        String password  = epass.getText().toString();
        String text = s1.getSelectedItem().toString();
        String s2 = "";
        if (sch.isChecked()) {
            s2 = "IT";
        }
        else{
            s2 = "CE";
        }
        String s3 = "";
        if (r1.isChecked()) {
            s3 = "Male";
        }
        else{
            s3 = "Female";
        }
        String s4 ="";
        if (c1.isChecked()) {
            s4 = "Active";
        }
        else{
            s4 = "Inactive";
        }





        Intent a1 = new Intent(MainActivity.this, RegistrationForm.class);
        a1.putExtra("Fname",fname);
        a1.putExtra("Lname",lname);
        a1.putExtra("User",username);
        a1.putExtra("pass",password);
        a1.putExtra("Branch",s2);
        a1.putExtra("Gender",s3);
        a1.putExtra("Text",text);
        a1.putExtra("status",s4);
        startActivity(a1);
        finish();

        if (c1.isChecked()) {


        }
        else{
            //String tv = c1.getText().toString();
            //tv+="Inactive\n";
            //a1.putExtra("status",tv);
        }

    }
}