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

public class popcorncategory extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    static public String popcornname;
    static public String popcornsize;
    static public String popcornquantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popcorncategory);

        Spinner spinner = findViewById(R.id.popcornspin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.popcorn, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinnersize = findViewById(R.id.popcornsizespin);
        ArrayAdapter<CharSequence> adaptersize = ArrayAdapter.createFromResource(this,R.array.popcornsize, android.R.layout.simple_spinner_item);
        adaptersize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersize.setAdapter(adaptersize);
        spinnersize.setOnItemSelectedListener(this);

        Spinner spinnerquantity = findViewById(R.id.popcornsizespin2);
        ArrayAdapter<CharSequence> adapterquantity = ArrayAdapter.createFromResource(this,R.array.popcornquantity, android.R.layout.simple_spinner_item);
        adapterquantity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerquantity.setAdapter(adapterquantity);
        spinnerquantity.setOnItemSelectedListener(this);

   //     screenseat.popcorncounter = 0;
        Button popcornsubmit = (Button) findViewById(R.id.popcorn);

        popcornsubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {
        //                screenseat.popcorncounter = 1;
                        popcornname = spinner.getSelectedItem().toString();
                        popcornsize = spinnersize.getSelectedItem().toString();
                        popcornquantity = spinnerquantity.getSelectedItem().toString();
                        Intent intentpopcorncategory = new Intent(popcorncategory.this, FirstPage.class);

                        startActivity(intentpopcorncategory);
                        /*
                        ImageButton popcorn = (ImageButton) findViewById(R.id.popcorn);
                        popcorn.setClickable(false);
                        popcorn.setEnabled(false);
                        popcorn.setVisibility(View.GONE);
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