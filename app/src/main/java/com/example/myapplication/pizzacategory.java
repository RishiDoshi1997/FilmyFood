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

public class pizzacategory extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//
    static public String pizzaname;
    static public String pizzasize;
    static public String pizzaquantity;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizzacategory);

        Spinner spinner = findViewById(R.id.pizzaspin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.pizza, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinnersize = findViewById(R.id.pizzasizespin);
        ArrayAdapter<CharSequence> adaptersize = ArrayAdapter.createFromResource(this,R.array.pizzasize, android.R.layout.simple_spinner_item);
        adaptersize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersize.setAdapter(adaptersize);
        spinnersize.setOnItemSelectedListener(this);

        Spinner spinnerquantity = findViewById(R.id.pizzasizespin2);
        ArrayAdapter<CharSequence> adapterquantity = ArrayAdapter.createFromResource(this,R.array.pizzaquantity, android.R.layout.simple_spinner_item);
        adapterquantity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerquantity.setAdapter(adapterquantity);
        spinnerquantity.setOnItemSelectedListener(this);

    //    screenseat.pizzacounter = 0;


        Button pizzasubmit = (Button) findViewById(R.id.pizzasubmit);

        pizzasubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {

        //                screenseat.pizzacounter = 1;
                        Intent intentLoadpizzacategory = new Intent(pizzacategory.this, FirstPage.class);
                               startActivity(intentLoadpizzacategory);


                          //
                                pizzaname = spinner.getSelectedItem().toString();
                             pizzasize =spinnersize.getSelectedItem().toString();
                           pizzaquantity =spinnerquantity.getSelectedItem().toString();

                        intentLoadpizzacategory.putExtra("pizzanamefirstpage",pizzaname);
                        intentLoadpizzacategory.putExtra("pizzasizefirstpage",pizzasize);
                        intentLoadpizzacategory.putExtra("pizzaquantityfirstpage",pizzaquantity);


                           //

                        /*
                        pizza.setClickable(false);
                        pizza.setEnabled(false);
                        pizza.setVisibility(View.GONE);
                        */

                    }



                }

                );

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}