package com.example.e_writer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ForgetPasswordActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {Intent intent = new Intent(ForgetPasswordActivity.this, SignupActivity.class);
        startActivity(intent);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        Button button =findViewById(R.id.resetbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(ForgetPasswordActivity.this,OTPActivity.class);
                startActivity(intent);
            }
        });
    }
}
