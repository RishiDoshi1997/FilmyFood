package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class options extends AppCompatActivity {
private CheckBox check_cutlery,check_mayonaise,check_ketchup,check_pickles,check_cheese,check_bacon;
private Button submitoptions;

private Button        goback123;
//private TextView a,b,c,d,e,f;
    private TextView optionsview ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        check_cutlery=findViewById(R.id.check_cutlery);
        check_mayonaise=findViewById(R.id.check_mayonaise);
        check_ketchup=findViewById(R.id.check_ketchup);
        check_pickles=findViewById(R.id.check_pickles);
        check_cheese=findViewById(R.id.check_cheese);
        check_bacon=findViewById(R.id.check_bacon);
        goback123 =(Button) findViewById(R.id.goback123);

        if(screenseat.optionresult.contains("Cutlery")){
            check_cutlery.setChecked(true);
        }
        if(screenseat.optionresult.contains("Mayonaise")){
            check_mayonaise.setChecked(true);
        }
        if(screenseat.optionresult.contains("Ketchup")){
            check_ketchup.setChecked(true);
        }
        if(screenseat.optionresult.contains("Pickles")){
            check_pickles.setChecked(true);
        }
        if(screenseat.optionresult.contains("Cheese - 2$")){
            check_cheese.setChecked(true);
        }
        if(screenseat.optionresult.contains("Bacon - 1.5$")){
            check_bacon.setChecked(true);
        }

        /*
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        */
        optionsview = findViewById(R.id.optionsview);
        submitoptions = (Button)findViewById(R.id.submitoptions);
        optionsview.setEnabled(false);

        StringBuilder stringBuilder = new StringBuilder();
        for (String s : screenseat.optionresult)
            stringBuilder.append(s).append("\n");
        optionsview.setText(stringBuilder.toString());

        check_cutlery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_cutlery.isChecked())
                   screenseat.optionresult.add("Cutlery");
                else screenseat.optionresult.remove("Cutlery");
 //                   d.setText("Cutlery");


            }
        });
        check_mayonaise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_mayonaise.isChecked())
                    screenseat.optionresult.add("Mayonaise");
                else screenseat.optionresult.remove("Mayonaise");
  //              a.setText("Mayonaise");
            }
        });
        check_ketchup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_ketchup.isChecked())
                    screenseat.optionresult.add("Ketchup");
          else screenseat.optionresult.remove("Ketchup");
         //           b.setText("Ketchup");
            }
        });
        check_pickles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_pickles.isChecked())
                    screenseat.optionresult.add("Pickles");
                                      else screenseat.optionresult.remove("Pickles");
      //              c.setText("Pickles");
            }
        });
        check_cheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_cheese.isChecked())
                    screenseat.optionresult.add("Cheese - 2$");
              else screenseat.optionresult.remove("Cheese - 2$");
    //                e.setText("Cheese - 2$");
            }
        });
        check_bacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_bacon.isChecked())
                    screenseat.optionresult.add("Bacon - 1.5$");
                else screenseat.optionresult.remove("Bacon - 1.5$");
    //        f.setText("Bacon - 1.5$");
            }
        });

        submitoptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();
                for (String s : screenseat.optionresult)
                stringBuilder.append(s).append("\n");
                optionsview.setText(stringBuilder.toString());


            }
        });
        goback123.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loadsubmitoptions = new Intent(options.this,FirstPage.class);
                startActivity(Loadsubmitoptions);
            }
        }));
    }
}