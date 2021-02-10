package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReportDropdown extends AppCompatActivity {

    TextView deviceLid, mobileAppErrors, deviceSorting,deviceCleaning, deviceVoice, backSymbol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_dropdown);
        deviceLid = (TextView) findViewById(R.id.deviceLid);
        deviceSorting = (TextView) findViewById(R.id.deviceSorting);
        deviceCleaning = (TextView) findViewById(R.id.deviceCleaning);
        deviceVoice = (TextView) findViewById(R.id.deviceVoice);
        mobileAppErrors = (TextView) findViewById(R.id.mobileAppErrors);
        backSymbol = (TextView) findViewById(R.id.backSymbol);

       backSymbol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Report.class));
            }
        });

        deviceLid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportDeviceLid.class));
            }
        });

        deviceSorting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportSorting.class));
            }
        });

        deviceCleaning.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportCleaning.class));
            }
        });

        deviceVoice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportVoice.class));
            }
        });

        mobileAppErrors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportMobile.class));
            }
        });
    }

}
