package com.example.myapplicationreceiptify1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;


public class SignIn extends AppCompatActivity {
    EditText email, password;
    ImageView btnSignIn;
    TextView  signUpText,backSymbol;
    ImageView signInPhone, facebookBtn, googleBtn;
    FirebaseAuth fAuth;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        email = (EditText) findViewById(R.id.textEmailAddress);
        password = (EditText) findViewById(R.id.textPassword);
        btnSignIn = (ImageView) findViewById(R.id.btnSignIn);
        signUpText = (TextView) findViewById(R.id.signUpText);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        signInPhone = (ImageView) findViewById(R.id.signInPhone);
        facebookBtn = (ImageView) findViewById(R.id.facebookBtn);
        googleBtn = (ImageView) findViewById(R.id.googleBtn);
        fAuth = FirebaseAuth.getInstance();
        DB = new DBHelper(this);

        backSymbol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = email.getText().toString();
                String pass = password.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    email.setError("Email is required");
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    password.setError("Password is required");
                    return;
                }
                if (password.length() < 6) {
                    password.setError("Password must be => 6 characters");
                    return;
                }

                fAuth.signInWithEmailAndPassword(e, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(SignIn.this, "login successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Profile.class));
                        } else {
                            Toast.makeText(SignIn.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });

                signUpText.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), SignUp.class));
                    }
                });

                signInPhone.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), QRCode.class));
                        Toast.makeText(SignIn.this, "Sign In Successfully", Toast.LENGTH_SHORT).show();
                    }
                });

                facebookBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), QRCode.class));
                        Toast.makeText(SignIn.this, "Sign In Successfully", Toast.LENGTH_SHORT).show();
                    }
                });

                googleBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), QRCode.class));
                        Toast.makeText(SignIn.this, "Sign In Successfully", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
    }