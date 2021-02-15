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

public class SignUpFacebook extends AppCompatActivity {
    EditText username, password;
    ImageView fbLoginBtn;
    TextView backSymbol;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_facebook);

        username= (EditText) findViewById(R.id.signUpUser);
        password= (EditText) findViewById(R.id.signUpPass);
        fbLoginBtn= (ImageView) findViewById(R.id.fbLoginBtn);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        DB = new DBHelper(this);

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });

        fbLoginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),QRCode.class));
                Toast.makeText(SignUpFacebook.this,"Registered Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}


