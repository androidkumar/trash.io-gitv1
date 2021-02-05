package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PastHistory extends AppCompatActivity {
    TextView backSymbol;
    ImageView organicDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_history);

        backSymbol = (TextView) findViewById(R.id.backSymbol);

        organicDetail = (ImageView) findViewById(R.id.organicDetail);

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BinDropdown.class));
            }
        });

        organicDetail.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),HistoryDetails.class));
            }
        });


    }
}


