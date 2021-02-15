package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PointsHistory extends AppCompatActivity {

    TextView backSymbolPoin ;
    ImageView usedOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points_history);
        backSymbolPoin = (TextView) findViewById(R.id.backSymbolPoin);
        usedOption = (ImageView) findViewById(R.id.usedOption);

        usedOption.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PointsHistoryUsed.class));
            }
        });

        backSymbolPoin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PointsOne.class));
            }
        });

    }

}

