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

import javax.xml.namespace.QName;

public class burgercategory extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//
    static public String burgername;
    static public String burgersize;
    static public String burgerquantity;
//
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgercategory);

        Spinner spinner = findViewById(R.id.burgerspin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.burger, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        Spinner spinnersize = findViewById(R.id.burgersizespin);
        ArrayAdapter<CharSequence> adaptersize = ArrayAdapter.createFromResource(this,R.array.burgersize, android.R.layout.simple_spinner_item);
        adaptersize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersize.setAdapter(adaptersize);
        spinnersize.setOnItemSelectedListener(this);

        Spinner spinnerquantity = findViewById(R.id.burgersizespin2);
        ArrayAdapter<CharSequence> adapterquantity = ArrayAdapter.createFromResource(this,R.array.burgerquantity, android.R.layout.simple_spinner_item);
        adapterquantity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerquantity.setAdapter(adapterquantity);
        spinnerquantity.setOnItemSelectedListener(this);

        //screenseat.burgercounter = 0;
        Button burgersubmit = (Button) findViewById(R.id.burger);

        burgersubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {

        //                screenseat.burgercounter = 1;

                        /*
                        ImageButton burger  = (ImageButton) findViewById(R.id.burger);
                        burger.setEnabled(false);
                        burger.setClickable(false);
                        burger.setVisibility(View.GONE);
                        */

                        Intent intentburgercategory = new Intent(burgercategory.this, FirstPage.class);
                        //

                        burgername = spinner.getSelectedItem().toString();
                         burgersize = spinnersize.getSelectedItem().toString();
                         burgerquantity = spinnerquantity.getSelectedItem().toString();
//
                        intentburgercategory.putExtra("keyburgername",burgername);
                        intentburgercategory.putExtra("keyburgersize",burgersize);
                        intentburgercategory.putExtra("keyburgerquantity",burgerquantity);
//


                        //
                        startActivity(intentburgercategory);


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