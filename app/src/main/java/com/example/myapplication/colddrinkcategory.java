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

public class colddrinkcategory extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
//
    static public String colddrinkname;
    static public String colddrinksize;
    static public String colddrinkquantity;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colddrinkcategory);

        Spinner spinner = findViewById(R.id.colddrinkspin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.colddrink, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinnersize = findViewById(R.id.colddrinksizespin);
        ArrayAdapter<CharSequence> adaptersize = ArrayAdapter.createFromResource(this,R.array.colddrinksize, android.R.layout.simple_spinner_item);
        adaptersize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersize.setAdapter(adaptersize);
        spinnersize.setOnItemSelectedListener(this);

        Spinner spinnerquantity = findViewById(R.id.colddrinksizespin2);
        ArrayAdapter<CharSequence> adapterquantity = ArrayAdapter.createFromResource(this,R.array.colddrinkquantity, android.R.layout.simple_spinner_item);
        adapterquantity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerquantity.setAdapter(adapterquantity);
        spinnerquantity.setOnItemSelectedListener(this);

       // screenseat.colddrinkcounter = 0;
        Button colddrinksubmit = (Button) findViewById(R.id.colddrink);

        colddrinksubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {
         //               screenseat.colddrinkcounter = 1;
//
                        colddrinkname = spinner.getSelectedItem().toString();
                        colddrinksize = spinnersize.getSelectedItem().toString();
                        colddrinkquantity = spinnerquantity.getSelectedItem().toString();
//
                        Intent intentcolddrinkcategory = new Intent(colddrinkcategory.this, FirstPage.class);

                        startActivity(intentcolddrinkcategory);
                        /*
                        ImageButton colddrink = (ImageButton) findViewById(R.id.colddrink);
                        colddrink.setClickable(false);
                        colddrink.setEnabled(false);
                        colddrink.setVisibility(View.GONE);
                        */

                    }




                });

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