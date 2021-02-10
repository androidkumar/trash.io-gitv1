package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Faq extends AppCompatActivity {

    ImageView faqQuesBtn, faqQuesBtnTwo, faqQuesBtnThree, faqQuesBtnFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        faqQuesBtn = (ImageView) findViewById(R.id.faqQuesBtn);
        faqQuesBtnTwo = (ImageView) findViewById(R.id.faqQuesBtnTwo);
        faqQuesBtnThree = (ImageView) findViewById(R.id.faqQuesBtnThree);
        faqQuesBtnFour = (ImageView) findViewById(R.id.faqQuesBtnFour);

        faqQuesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FaqTwo.class));
            }
        });

        faqQuesBtnTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FaqTwoTwo.class));
            }
        });

        faqQuesBtnThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FaqTwoThree.class));
            }
        });

        faqQuesBtnFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FaqTwoFour.class));
            }
        });

    }

}

