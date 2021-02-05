package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    ImageView recycleBar, qrCodeBar, bellBar, profBar, editSymbol;
    TextView pointDetails, manageBins, recentActivity, report, helpCentre, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        recycleBar = (ImageView) findViewById(R.id.recycleBar);
        qrCodeBar = (ImageView) findViewById(R.id.qrCodeBar);
        bellBar = (ImageView) findViewById(R.id.bellBar);
        profBar = (ImageView) findViewById(R.id.profBar);
        editSymbol = (ImageView) findViewById(R.id.editSymbol);

        pointDetails = (TextView) findViewById(R.id.pointDetails);
        manageBins = (TextView) findViewById(R.id.manageBins);
        recentActivity = (TextView) findViewById(R.id.recentActivity);
        report = (TextView) findViewById(R.id.report);
        helpCentre = (TextView) findViewById(R.id.helpCentre);
        settings = (TextView) findViewById(R.id.settings);

        pointDetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PointsOne.class));
            }
        });

        manageBins.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ManageBins.class));
            }
        });

        recentActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RecentActivity.class));
            }
        });

        report.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Report.class));
            }
        });

        helpCentre.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Faq.class));
            }
        });


        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Settings.class));
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

        editSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EditProfile.class));
            }
        });
    }

}
