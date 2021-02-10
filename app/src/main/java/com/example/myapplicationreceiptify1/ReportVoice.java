package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ReportVoice extends AppCompatActivity {

    ImageView submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_voice);
        submitBtn = (ImageView) findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReportSubmitted.class));
            }
        });
    }

}