   package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ImageView EnterImage;

Button clicktoenter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               EnterImage = findViewById(R.id.firstimage);
    clicktoenter = findViewById(R.id.clicktoenter);
        clicktoenter.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentLoadFirstPage = new Intent(MainActivity.this, screenseat.class);
                        //Second parameter is to load new activity...for now its main page only.
                        //Firstpage.class
                        startActivity(intentLoadFirstPage);
                    }
                });
                


    /*
        EnterImage.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentLoadFirstPage = new Intent(MainActivity.this, screenseat.class);
                        //Second parameter is to load new activity...for now its main page only.
                        //Firstpage.class
                        startActivity(intentLoadFirstPage);
                    }
                });
*/

Button admin = ( Button ) findViewById(R.id.admin);
admin.setOnClickListener(
        new View.OnClickListener(){
            @Override
            public void onClick(View v){
              Intent intentLoadadmin = new Intent(MainActivity.this,admin.class);
              startActivity(intentLoadadmin);
            }
        }
);
    }
}