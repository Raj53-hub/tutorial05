package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class RegistrationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);



        String Fname = getIntent().getStringExtra("Fname");
        String Lname = getIntent().getStringExtra("Lname");
        String User = getIntent().getStringExtra("User");
        String pass = getIntent().getStringExtra("pass");
        String city = getIntent().getStringExtra("Text");
        String stat = getIntent().getStringExtra("status");
        String s5 = getIntent().getStringExtra("Branch");
        String s6 = getIntent().getStringExtra("Gender");
        String s7 = getIntent().getStringExtra("status");


        TextView t1 = (TextView)findViewById(R.id.textView1);
        t1.setText("First Name : "+Fname);
        TextView t2 = (TextView)findViewById(R.id.textView2);
        t2.setText("Last Name : "+Lname);
        TextView t3 = (TextView)findViewById(R.id.textView3);
        t3.setText("Username : "+User);
        TextView t4 = (TextView)findViewById(R.id.textView4);
        t4.setText("Password : "+pass);
        TextView t5 = (TextView)findViewById(R.id.textView5);
        t5.setText("Branch : "+s5);
        TextView t6 = (TextView)findViewById(R.id.textView6);
        t6.setText("Gender : "+s6);
        TextView t7 = (TextView)findViewById(R.id.textView7);
        t7.setText("City : "+city);
        TextView t8 = (TextView)findViewById(R.id.textView8);
        t8.setText("Status : "+s7);





    }
}