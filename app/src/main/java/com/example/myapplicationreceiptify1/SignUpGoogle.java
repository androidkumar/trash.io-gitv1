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

import com.example.myapplicationreceiptify1.DBHelper;
import com.example.myapplicationreceiptify1.QRCode;
import com.example.myapplicationreceiptify1.R;
import com.example.myapplicationreceiptify1.SignUp;

public class SignUpGoogle extends AppCompatActivity {
    EditText username, password;
    ImageView googleSignIn;
    TextView backSymbol;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_google);

        username= (EditText) findViewById(R.id.signUpUser);
        password= (EditText) findViewById(R.id.signUpPass);
        googleSignIn= (ImageView) findViewById(R.id.googleSignIn);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        DB = new DBHelper(this);

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUp.class));
            }
        });

        googleSignIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QRCode.class));
                Toast.makeText(SignUpGoogle.this,"Registered Successfully", Toast.LENGTH_SHORT).show();

            }
        });


    }
}



