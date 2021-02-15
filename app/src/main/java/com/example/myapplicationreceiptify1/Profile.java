package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class Profile extends AppCompatActivity {

    ImageView recycleBarProf, qrCodeBar, bellBar, profBar, logoutImg;
    TextView pointDetails, recentActivity, report, helpCentre, settingsInsideProf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        recycleBarProf = (ImageView) findViewById(R.id.recycleBarProf);
        qrCodeBar = (ImageView) findViewById(R.id.qrCodeBar);
        bellBar = (ImageView) findViewById(R.id.bellBar);
        profBar = (ImageView) findViewById(R.id.profBar);
        logoutImg = (ImageView) findViewById(R.id.logoutImg);
        pointDetails = (TextView) findViewById(R.id.pointDetails);
        recentActivity = (TextView) findViewById(R.id.recentActivity);
        report = (TextView) findViewById(R.id.report);
        helpCentre = (TextView) findViewById(R.id.helpCentre);
        settingsInsideProf = (TextView) findViewById(R.id.settingsInsideProf);

        logoutImg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
            }
        });


        pointDetails.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PointsOne.class));
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

        settingsInsideProf.setOnClickListener(new View.OnClickListener(){
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

        recycleBarProf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BinCapacity.class));
            }
        });


    }

}
