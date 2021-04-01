package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class screenseat extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


//

//

    /*
    static public int pizzacounter;
    static public int icecreamcounter;
    static public int burgercounter;
    static public int frenchfriescounter;
    static public int colddrinkcounter;
    static public int popcorncounter;
    */
    public static ArrayList<String> optionresult = new ArrayList<>();
static public String seat;
static public String row;
static public String screen;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenseat);



        Spinner spinnerscreen =  findViewById(R.id.btotal);

        ArrayAdapter<CharSequence> adapterscreen = ArrayAdapter.createFromResource(this, R.array.screen, android.R.layout.simple_spinner_item);
        adapterscreen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerscreen.setAdapter(adapterscreen);
        spinnerscreen.setOnItemSelectedListener(this);


        Spinner spinnerrow = findViewById(R.id.rowadmin);

        ArrayAdapter<CharSequence> adapterrow = ArrayAdapter.createFromResource(this, R.array.row, android.R.layout.simple_spinner_item);
        adapterrow.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerrow.setAdapter(adapterrow);
        spinnerrow.setOnItemSelectedListener(this);


        Spinner spinnerseat =findViewById(R.id.seatadmin);

        ArrayAdapter<CharSequence> adapterseat = ArrayAdapter.createFromResource(this, R.array.seat, android.R.layout.simple_spinner_item);
        adapterseat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerseat.setAdapter(adapterseat);
        spinnerseat.setOnItemSelectedListener(this);



        Button screenseatsubmit = (Button) findViewById(R.id.screenseatsubmit);
        screenseatsubmit.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                       Intent intentLoadscreenseat = new Intent(screenseat.this, FirstPage.class);


//


                        seat = spinnerseat.getSelectedItem().toString();
                        row = spinnerrow.getSelectedItem().toString();
                        screen = spinnerscreen.getSelectedItem().toString();

                        intentLoadscreenseat.putExtra("keyscreen",screen);
                        intentLoadscreenseat.putExtra("keyrow",row);
                        intentLoadscreenseat.putExtra("keyseat",seat);
//




                        startActivity(intentLoadscreenseat);


                    }


                });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {



    }

}

