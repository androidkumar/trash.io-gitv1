package com.example.myapplicationreceiptify1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.scanlibrary.ScanActivity;
import com.scanlibrary.ScanConstants;

import java.io.IOException;

public class BinCapacity extends AppCompatActivity {
    ImageView  recycleBar, qrCodeBar, bellBar, profBar, binOne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.bin_capacity);

        recycleBar = (ImageView) findViewById(R.id.recycleBar);
        qrCodeBar = (ImageView) findViewById(R.id.qrCodeBar);
        bellBar = (ImageView) findViewById(R.id.bellBar);
        profBar = (ImageView) findViewById(R.id.profBar);
        binOne = (ImageView) findViewById(R.id.binOne);




       binOne.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BinDropdown.class));
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



