package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PointsOne extends AppCompatActivity {
    ImageView viewPointsHist, viewVouchers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points_one);
        viewPointsHist = (ImageView) findViewById(R.id.viewPointsHist);
        viewVouchers = (ImageView) findViewById(R.id.viewVouchers);

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


