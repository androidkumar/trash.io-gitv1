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

public class SignUp extends AppCompatActivity {
    EditText username, password, repassword;
    EditText email;
    EditText mobile;
    Button signup;
    TextView loginText1, backSymbol;

    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        username= (EditText) findViewById(R.id.signUpUser);
        password= (EditText) findViewById(R.id.signUpPass);
        repassword= (EditText) findViewById(R.id.signUpRepass);
        email= (EditText) findViewById(R.id.signUpEmail);
        mobile= (EditText) findViewById(R.id.signUpMobile);

        signup= (Button) findViewById(R.id.signUp);
        loginText1 = (TextView) findViewById(R.id.loginText1);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        DB = new DBHelper(this);

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SplashScreen.class));
            }
        });

        loginText1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignIn.class));
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();
                String e = email.getText().toString();
                String mob = mobile.getText().toString();
                if(user.equals("")|pass.equals("")|repass.equals("")|e.equals("")|mob.equals(""))
                    Toast.makeText(SignUp.this,"Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user,pass,e,mob);
                            if(insert==true){
                                Toast.makeText(SignUp.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),SignUp.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(SignUp.this,"Registration is Failed",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(SignUp.this, "User Already Exists Please Go For Signin", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignUp.this, "Password not matching", Toast.LENGTH_SHORT).show();
                    }
                }
                startActivity(new Intent(getApplicationContext(),RegisterSuccess.class));
            }});


    }
}

