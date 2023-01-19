package com.example.e_writer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView textView1 =(TextView) findViewById(R.id.txtfpw);
        textView = (TextView) findViewById(R.id.signup);
        Button button=findViewById(R.id.sign_in);

       textView1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent1=new Intent(SignIn.this,ForgetPasswordActivity.class);
               startActivity(intent1);
           }
       });

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent2=new Intent(SignIn.this,HomeActivity.class);
               startActivity(intent2);
           }
       });

       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent3=new Intent(SignIn.this,SignupActivity.class);
               startActivity(intent3);
           }
       });
    }
}