package com.example.cryptode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    Button enc, dec, abt;
    //ViewFlipper vf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        enc = findViewById(R.id.encryption_btn);
        dec = findViewById(R.id.decryption_btn);
        enc.setOnClickListener(view -> {
            Intent temp = new Intent(MainActivity.this, Encoder.class);
            startActivity(temp);
        });

        dec.setOnClickListener(view -> {
            Intent temp = new Intent(MainActivity.this, Decoder.class);
            startActivity(temp);
        });

//        vf = findViewById(R.id.vf);
//        int images[] = {R.drawable.hacker, R.drawable.hacker2, R.drawable.hacker3 };
//
//        for (int i=0; i<images.length; i++){
//            flipper(images[i]);
//        }
//    }
//    public void flipper(int images){
//        ImageView test = new ImageView(this);
//        test.setBackgroundResource(images);
//        vf.addView(test);
//        vf.setFlipInterval(3000);
//        vf.setAutoStart(true);
//        vf.setInAnimation(this, android.R.anim.slide_in_left);
//        vf.setOutAnimation(this, android.R.anim.slide_out_right);

   }
}