package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecentActivity extends AppCompatActivity {
    TextView backSymbol;
    ImageView paperDetails, tinDetails, plasticDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recent_activity);
        backSymbol = (TextView) findViewById(R.id.backSymbol);
        paperDetails = (ImageView) findViewById(R.id.paperDetails);
        tinDetails = (ImageView) findViewById(R.id.tinDetails);
        plasticDetails = (ImageView) findViewById(R.id.plasticDetails);

        backSymbol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Profile.class));
            }
        });

        paperDetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ActivityDetails.class));
            }
        });

        tinDetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ActivityDetailsOne.class));
            }
        });

        plasticDetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ActivityDetailsTwo.class));
            }
        });
    }

}
