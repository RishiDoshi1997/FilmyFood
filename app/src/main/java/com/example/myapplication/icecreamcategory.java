package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class icecreamcategory extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//
    static public String icecreamname;
    static public String icecreamsize1;
    static public String icecreamquantity2;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecreamcategory);

        Spinner icecream = findViewById(R.id.icecreamlist);
        ArrayAdapter<CharSequence> adaptericecream = ArrayAdapter.createFromResource(this,R.array.icecream, android.R.layout.simple_spinner_item);
        adaptericecream.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecream.setAdapter(adaptericecream);
        icecream.setOnItemSelectedListener(this);

        Spinner icecreamsize = findViewById(R.id.icecreamsize);
        ArrayAdapter<CharSequence> adaptericecreamsize = ArrayAdapter.createFromResource(this,R.array.icecreamsize, android.R.layout.simple_spinner_item);
        adaptericecreamsize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecreamsize.setAdapter(adaptericecreamsize);
        icecreamsize.setOnItemSelectedListener(this);

        Spinner icecreamquantity = findViewById(R.id.icecreamquantity);
        ArrayAdapter<CharSequence> adaptericecreamquantity = ArrayAdapter.createFromResource(this,R.array.icecreamquantity, android.R.layout.simple_spinner_item);
        adaptericecreamquantity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icecreamquantity.setAdapter(adaptericecreamquantity);
        icecreamquantity.setOnItemSelectedListener(this);

     //   screenseat.icecreamcounter = 0;

        Button icecreamsubmit = (Button) findViewById(R.id.icecreamsubmit);

        icecreamsubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                  //      screenseat.icecreamcounter = 1;
                        Intent intentLoadicecreamcategory = new Intent(icecreamcategory.this, FirstPage.class);
                        icecreamname = icecream.getSelectedItem().toString();
                        icecreamsize1 = icecreamsize.getSelectedItem().toString();
                        icecreamquantity2 = icecreamquantity.getSelectedItem().toString();
                        startActivity(intentLoadicecreamcategory);
                        /*
                        ImageButton icecream = (ImageButton) findViewById(R.id.icecream);
                        icecream.setClickable(false);
                        icecream.setEnabled(false);
                        icecream.setVisibility(View.GONE);
                    */
                    }



                });
  //
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}