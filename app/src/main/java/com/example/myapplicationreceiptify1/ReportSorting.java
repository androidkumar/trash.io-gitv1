package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReportSorting extends AppCompatActivity {

    ImageView submitBtn;
    TextView backSymbol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_sorting);
        submitBtn = (ImageView) findViewById(R.id.submitBtn);
        backSymbol = (TextView) findViewById(R.id.backSymbol);

        backSymbol.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Report.class));
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportSubmitted.class));
            }
        });
    }

}
