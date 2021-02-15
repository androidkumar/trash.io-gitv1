package com.example.myapplicationreceiptify1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Faq extends AppCompatActivity {

    ImageView faqQuesBtn, faqQuesBtnTwo, faqQuesBtnThree, faqQuesBtnFour;
    TextView backSymbol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        faqQuesBtn = (ImageView) findViewById(R.id.faqQuesBtn);
        faqQuesBtnTwo = (ImageView) findViewById(R.id.faqQuesBtnTwo);
        faqQuesBtnThree = (ImageView) findViewById(R.id.faqQuesBtnThree);
        faqQuesBtnFour = (ImageView) findViewById(R.id.faqQuesBtnFour);
        backSymbol = (TextView) findViewById(R.id.backSymbol);

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

        backSymbol.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Profile.class));
            }
        });
    }

}

