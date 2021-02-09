package com.example.myapplicationreceiptify1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class SignIn extends AppCompatActivity {
EditText email, password;
Button btnSignIn;
TextView signUpText, backSymbol;
ImageView signInPhone, facebookBtn, googleBtn;
DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        email = (EditText) findViewById(R.id.textEmailAddress);
        password = (EditText) findViewById(R.id.textPassword);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        signUpText = (TextView) findViewById(R.id.signUpText);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        signInPhone = (ImageView) findViewById(R.id.signInPhone);
        facebookBtn = (ImageView) findViewById(R.id.facebookBtn);
        googleBtn = (ImageView) findViewById(R.id.googleBtn);

        DB = new DBHelper (this);

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SplashScreen.class));
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String e = email.getText().toString();
                String pass = password.getText().toString();

                if(e.equals("")||pass.equals(""))
                    Toast.makeText(SignIn.this, "Please enter all the fields",Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkemailpass = DB.checkemailpassword(e, pass);
                    if(checkemailpass==true){
                        Toast.makeText(SignIn.this,"Sign In Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), QRCode.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(SignIn.this,"Sign In Successfully", Toast.LENGTH_SHORT).show();
                    }
                    startActivity(new Intent(getApplicationContext(),QRCode.class));
                }
            }
        });

        signUpText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });

        signInPhone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),QRCode.class));
                Toast.makeText(SignIn.this, "Sign In Successfully",Toast.LENGTH_SHORT).show();
            }
        });

        facebookBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),QRCode.class));
                Toast.makeText(SignIn.this, "Sign In Successfully",Toast.LENGTH_SHORT).show();
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),QRCode.class));
                Toast.makeText(SignIn.this, "Sign In Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
