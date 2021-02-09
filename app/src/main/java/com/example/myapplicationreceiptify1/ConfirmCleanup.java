package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmCleanup extends AppCompatActivity {

    ImageView btnLater, startNow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_cleanup);

        btnLater = (ImageView) findViewById(R.id.btnLater);
        startNow = (ImageView) findViewById(R.id.startNow);


        btnLater.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),BinDropdown.class));
            }
        });

        startNow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),BinDropdown.class));
            }
        });

    }

}
