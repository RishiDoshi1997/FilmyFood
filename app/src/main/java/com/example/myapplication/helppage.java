package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class helppage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helppage);

        Button goback2 = (Button) findViewById(R.id.goback2);

        goback2.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View goback2) {

                        Intent intentLoadgoback2 = new Intent(helppage.this, FirstPage.class);
                        //Second parameter is to load new activity...for now its main page only.
                        //Firstpage.class
                        startActivity(intentLoadgoback2);

                    }




                });
    }
}