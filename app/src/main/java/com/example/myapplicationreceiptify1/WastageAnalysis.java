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

public class WastageAnalysis extends AppCompatActivity {
   ImageView usageProgression;
   TextView backSymbol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wastage_analysis);

        usageProgression = (ImageView) findViewById(R.id.usageProgression);
        backSymbol = (TextView) findViewById(R.id.backSymbol);


        usageProgression.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),UsageProgression.class));
            }
        });


        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BinDropdown.class));
            }
        });


    }
}
