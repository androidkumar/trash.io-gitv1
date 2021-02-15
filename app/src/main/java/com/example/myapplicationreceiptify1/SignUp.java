package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
/*

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

*/

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class SignUp extends AppCompatActivity {

    EditText username, password, repassword;
    EditText email;
    EditText mobile;
    TextView loginText1, backSymbol;
    ImageView signup, facebookBtn, googleBtn, signUpPhone;
    FirebaseAuth fAuth;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        fAuth = FirebaseAuth.getInstance();

        username = (EditText) findViewById(R.id.signUpUser);
        password = (EditText) findViewById(R.id.signUpPass);
        repassword = (EditText) findViewById(R.id.signUpRepass);
        email = (EditText) findViewById(R.id.signUpEmail);
        mobile = (EditText) findViewById(R.id.signUpMobile);
        facebookBtn = (ImageView) findViewById(R.id.facebookBtn);
        googleBtn = (ImageView) findViewById(R.id.googleBtn);
        signUpPhone = (ImageView) findViewById(R.id.signUpPhone);
        signup = (ImageView) findViewById(R.id.signUp);
        loginText1 = (TextView) findViewById(R.id.loginText1);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        DB = new DBHelper(this);

        backSymbol.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
            }
        });

        facebookBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpFacebook.class));
            }
        });

        googleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpGoogle.class));
            }
        });

        signUpPhone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpPhone.class));
            }
        });

        loginText1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignIn.class));
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();
                String e = email.getText().toString();
                String mob = mobile.getText().toString();

                if (TextUtils.isEmpty(e)) {
                    email.setError("Email is required");
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    password.setError("Password is required");
                    return;
                }
                if (password.length() < 0) {
                    password.setError("Password must be => 6 characters");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(e, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(SignUp.this, "user created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Profile.class));
                        } else {
                            Toast.makeText(SignUp.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }
}