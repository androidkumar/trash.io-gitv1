package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BinDropdown extends AppCompatActivity {
    ImageView  recycleBar, qrCodeBar, bellBar, profBar, cleanupNow, wastageAnalysis, pastHisBinDropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bin_dropdown);

        recycleBar = (ImageView) findViewById(R.id.recycleBar);
        qrCodeBar = (ImageView) findViewById(R.id.qrCodeBar);
        bellBar = (ImageView) findViewById(R.id.bellBar);
        profBar = (ImageView) findViewById(R.id.profBar);
        cleanupNow = (ImageView) findViewById(R.id.cleanupNow);
        wastageAnalysis = (ImageView) findViewById(R.id.wastageAnalysis);
        pastHisBinDropdown = (ImageView) findViewById(R.id.pastHisBinDropdown);



        cleanupNow.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ConfirmCleanup.class));
            }
        });

        wastageAnalysis.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),WastageAnalysis.class));
            }
        });

        pastHisBinDropdown.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PastHistory.class));
            }
        });

        recycleBar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BinCapacity.class));
            }
        });

        qrCodeBar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),QRCode.class));
            }
        });

        bellBar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Notifications.class));
            }
        });

        profBar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Profile.class));
            }
        });
    }

}




