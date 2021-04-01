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

public class frenchfriescategory extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    static public String frenchfriesname;
    static public String frenchfriessize;
    static public String frenchfriesquantity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frenchfriescategory);

        Spinner spinner = findViewById(R.id.frenchfriesspin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.frenchfries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinnersize = findViewById(R.id.frenchfriessizespin);
        ArrayAdapter<CharSequence> adaptersize = ArrayAdapter.createFromResource(this,R.array.frenchfriessize, android.R.layout.simple_spinner_item);
        adaptersize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersize.setAdapter(adaptersize);
        spinnersize.setOnItemSelectedListener(this);

        Spinner spinnerquantity = findViewById(R.id.frenchfriessizespin2);
        ArrayAdapter<CharSequence> adapterquantity = ArrayAdapter.createFromResource(this,R.array.frenchfriesquantity, android.R.layout.simple_spinner_item);
        adapterquantity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerquantity.setAdapter(adapterquantity);
        spinnerquantity.setOnItemSelectedListener(this);

      //  screenseat.frenchfriescounter = 0;
        Button frenchfriessubmit = (Button) findViewById(R.id.frenchfries);

        frenchfriessubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {
          //              screenseat.frenchfriescounter = 1;
                        frenchfriesname = spinner.getSelectedItem().toString();
                        frenchfriessize = spinnersize.getSelectedItem().toString();
                        frenchfriesquantity = spinnerquantity.getSelectedItem().toString();
                        Intent intentLoadfrenchfriescategory = new Intent(frenchfriescategory.this, FirstPage.class);

                        startActivity(intentLoadfrenchfriescategory);
                        /*
                        ImageButton frenchfries = (ImageButton) findViewById(R.id.frenchfries);
                        frenchfries.setClickable(false);
                        frenchfries.setEnabled(false);
                        frenchfries.setVisibility(View.GONE);
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