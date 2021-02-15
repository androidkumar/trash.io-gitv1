package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PointsOne extends AppCompatActivity {
    ImageView viewPointsHist, viewVouchers;
    TextView backSymbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points_one);
        viewPointsHist = (ImageView) findViewById(R.id.viewPointsHist);
        viewVouchers = (ImageView) findViewById(R.id.viewVouchers);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Profile.class));
            }
        });

        viewPointsHist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PointsHistory.class));
            }
        });

        viewVouchers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MyVoucher.class));
            }
        });

    }

}


