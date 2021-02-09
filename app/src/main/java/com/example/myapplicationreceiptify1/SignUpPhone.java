package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpPhone extends AppCompatActivity {
    EditText username;
    ImageView logInBtnBlue;
    TextView backSymbol;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_phone);

        username= (EditText) findViewById(R.id.signUpUser);
        logInBtnBlue= (ImageView) findViewById(R.id.logInBtnBlue);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        DB = new DBHelper(this);

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });

        logInBtnBlue.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),QRCode.class));
                Toast.makeText(SignUpPhone.this,"Registered Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
