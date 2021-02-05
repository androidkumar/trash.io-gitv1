package com.example.myapplicationreceiptify1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
public class QRCodeEnlarged extends AppCompatActivity {

    ImageView btnExit, qrCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_code_enlarged);

        btnExit = findViewById(R.id.btnredexit);
        qrCode = findViewById(R.id.qrCode);

        btnExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), QRCode.class));
            }
        });

        qrCode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), QRCode.class));
            }
        });
    }
}


