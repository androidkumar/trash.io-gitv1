package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PointsHistoryUsed extends AppCompatActivity {

    TextView backSymbolPoin ;
    ImageView receivedOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points_history_used);
        backSymbolPoin = (TextView) findViewById(R.id.backSymbolPoin);
        receivedOption = (ImageView) findViewById(R.id.receivedOption);

        receivedOption.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PointsHistory.class));
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


