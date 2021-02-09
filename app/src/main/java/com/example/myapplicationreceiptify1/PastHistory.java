package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PastHistory extends AppCompatActivity {
    TextView backSymbol;
    ImageView organicDetail, organicDetailTwo, plasticDetail, plasticDetailTwo, paperDetail, paperDetailTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.past_history);

        backSymbol = (TextView) findViewById(R.id.backSymbol);

        organicDetail = (ImageView) findViewById(R.id.organicDetail);

        organicDetailTwo = (ImageView) findViewById(R.id.organicDetailTwo);
        plasticDetail = (ImageView) findViewById(R.id.plasticDetail);
        plasticDetailTwo = (ImageView) findViewById(R.id.plasticDetailTwo);
        paperDetail = (ImageView) findViewById(R.id.paperDetail);
        paperDetailTwo = (ImageView) findViewById(R.id.paperDetailTwo);

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

        organicDetailTwo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),OrganicTwoDetails.class));
            }
        });

        plasticDetail.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PlasticDetails.class));
            }
        });

        plasticDetailTwo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PlasticTwoDetails.class));
            }
        });

        paperDetail.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PaperDetails.class));
            }
        });

        paperDetailTwo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PaperTwoDetails.class));
            }
        });

    }
}


