package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PointsHistory extends AppCompatActivity {

    TextView backSymbolPoin ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points_history);
        backSymbolPoin = (TextView) findViewById(R.id.backSymbolPoin);
        backSymbolPoin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PointsOne.class));
            }
        });

    }

}

