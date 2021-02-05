package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Faq extends AppCompatActivity {

    ImageView faqQuesBtn, faqOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        faqQuesBtn = (ImageView) findViewById(R.id.faqQuesBtn);
        faqOne = (ImageView) findViewById(R.id.faqOne);

        faqQuesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FaqTwo.class));
            }
        });

        faqOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FaqTwo.class));
            }
        });
    }

}

