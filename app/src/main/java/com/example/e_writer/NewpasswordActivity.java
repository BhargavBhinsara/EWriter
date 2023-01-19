package com.example.e_writer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewpasswordActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpassword);

        button=findViewById(R.id.done);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(NewpasswordActivity.this).create();
                alertDialog.setTitle("Confirmation");
                alertDialog.setMessage("password forgot Successfully..\nGo to LOG IN");
                alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent=new Intent(NewpasswordActivity.this,MainActivity.class);
                        startActivity(intent);

                    }
                });
                alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent=new Intent(NewpasswordActivity.this,SignIn.class);
                        startActivity(intent);
                    }
                });

                alertDialog.show();
            }
        });
    }
}
