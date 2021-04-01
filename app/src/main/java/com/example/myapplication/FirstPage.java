package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;



public class FirstPage extends AppCompatActivity {



    //
    public TextView screenstore, rowstore, seatstore;
    public TextView screen1, row1, seat1;
//
//
    public TextView burgername, burgersize, burgerquantity;
    public TextView pizzaname, pizzasize, pizzaquantity;


//
//
    public TextView colddrinkname, colddrinksize, colddrinkquantity;
    public TextView icecreamname, icecreamsize, icecreamquantity;
    public TextView frenchfriesname, frenchfriessize, frenchfriesquantity;
    public TextView popcornname, popcornsize, popcornquantity;

//


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

//
        colddrinkname = findViewById(R.id.colddrinkname);
        colddrinksize = findViewById(R.id.colddrinksize);
        colddrinkquantity = findViewById(R.id.colddrinkquantity);
        String colddrinknamefp = colddrinkcategory.colddrinkname;
        String colddrinksizefp = colddrinkcategory.colddrinksize;
        String colddrinkquantityfp = colddrinkcategory.colddrinkquantity;
        colddrinkname.setText(colddrinknamefp);
        colddrinksize.setText(colddrinksizefp);
        colddrinkquantity.setText(colddrinkquantityfp);

//
//
        frenchfriesname = findViewById(R.id.frenchfriesname);
        frenchfriessize = findViewById(R.id.frenchfriessize);
        frenchfriesquantity = findViewById(R.id.frenchfriesquantity);
        String frenchfriesnamefp = frenchfriescategory.frenchfriesname;
        String frenchfriessizefp = frenchfriescategory.frenchfriessize;
        String frenchfriesquantityfp = frenchfriescategory.frenchfriesquantity;
        frenchfriesname.setText(frenchfriesnamefp);
        frenchfriessize.setText(frenchfriessizefp);
        frenchfriesquantity.setText(frenchfriesquantityfp);

//
//
        icecreamname = findViewById(R.id.icecreamname);
        icecreamsize = findViewById(R.id.icecreamsize);
        icecreamquantity = findViewById(R.id.icecreamquantity);
        String icecreamnamefp = icecreamcategory.icecreamname;
        String icecreamsizefp = icecreamcategory.icecreamsize1;
        String icecreamquantityfp = icecreamcategory.icecreamquantity2;
        icecreamname.setText(icecreamnamefp);
        icecreamsize.setText(icecreamsizefp);
        icecreamquantity.setText(icecreamquantityfp);
//
//
        popcornname = findViewById(R.id.popcornname);
        popcornsize = findViewById(R.id.popcornsize);
        popcornquantity = findViewById(R.id.popcornquantity);
        String popcornnamefp = popcorncategory.popcornname;
        String popcornsizefp = popcorncategory.popcornsize;
        String popcornquantityfp = popcorncategory.popcornquantity;
        popcornname.setText(popcornnamefp);
        popcornsize.setText(popcornsizefp);
        popcornquantity.setText(popcornquantityfp);
//


//
        //
        screenstore = findViewById(R.id.screenstore);
        rowstore = findViewById(R.id.rowrstore);
        seatstore = findViewById(R.id.seatstore);

        String screen = screenseat.screen;
        String row = screenseat.row;
        String seat = screenseat.seat;


        screenstore.setText(screen);
        rowstore.setText(row);
        seatstore.setText(seat);
        //
        //
        screen1 = findViewById(R.id.screen1);
        row1 = findViewById(R.id.row1);
        seat1 = findViewById(R.id.seat1);
        String seat123 = screenseat.seat;
        String row123 = screenseat.row;
        String screen123 = screenseat.screen;
        screen1.setText(screen123);
        row1.setText(row123);
        seat1.setText(seat123);


        //

        //
        burgername = findViewById(R.id.burgernamefirstpage);
        burgersize = findViewById(R.id.burgersizefirstpage);
        burgerquantity = findViewById(R.id.burgerquantityfirstpage);

        String burgernamefp = burgercategory.burgername;
        String burgersizefp = burgercategory.burgersize;
        String burgerquantityfp = burgercategory.burgerquantity;

        burgername.setText(burgernamefp);
        burgersize.setText(burgersizefp);
        burgerquantity.setText(burgerquantityfp);
        //

        //
        pizzaname = findViewById(R.id.pizzanamefirstpage);
        pizzasize = findViewById(R.id.pizzasizefirstpage);
        pizzaquantity = findViewById(R.id.pizzaquantityfirstpage);

        String pizzanamefp = pizzacategory.pizzaname;
        String pizzasizefp = pizzacategory.pizzasize;
        String pizzaquantityfp = pizzacategory.pizzaquantity;

        pizzaname.setText(pizzanamefp);
        pizzasize.setText(pizzasizefp);
        pizzaquantity.setText(pizzaquantityfp);
        //


        ImageButton pizza = (ImageButton) findViewById(R.id.pizza);
               /*
                if(screenseat.pizzacounter == 1)
                {
                   pizza.setVisibility(View.GONE);
                }
                */

        pizza.setOnClickListener(
                new ImageButton.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Log.d("tag", "button disabled ? " + Boolean.toString(pizza.isEnabled()));

                            /*
                            pizza.setClickable(false);
                            pizza.setEnabled(false);
                            pizza.setVisibility(View.GONE);
                            */

                        Intent intentLoadFirstPage = new Intent(FirstPage.this, pizzacategory.class);
                        startActivity(intentLoadFirstPage);

                    }

                }
        );


        //


        //
        ImageButton icecream = (ImageButton) findViewById(R.id.icecream);
       /*
        if(screenseat.icecreamcounter == 1)
        {
            icecream.setVisibility(View.GONE);
        }
        */


        icecream.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentLoadicecream = new Intent(FirstPage.this, icecreamcategory.class);
                        startActivity(intentLoadicecream);
                    }
                });

        ImageButton burger1 = (ImageButton) findViewById(R.id.burger);
        /*
        if(screenseat.burgercounter == 1)
        {
            burger.setVisibility(View.GONE);
        }

         */

        burger1.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intentLoadburger = new Intent(FirstPage.this, burgercategory.class);
                        startActivity(intentLoadburger);
                    }
                });

        ImageButton frenchfries = (ImageButton) findViewById(R.id.frenchfries);
      /*
        if(screenseat.frenchfriescounter == 1)
        {
            frenchfries.setVisibility(View.GONE);
        }
*/
        frenchfries.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentLoadfrenchfries = new Intent(FirstPage.this, frenchfriescategory.class);
                        startActivity(intentLoadfrenchfries);
                    }
                });

        ImageButton colddrink = (ImageButton) findViewById(R.id.colddrink);
       /*
        if(screenseat.colddrinkcounter == 1)
        {
            colddrink.setVisibility(View.GONE);
        }
*/
        colddrink.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentLoadcolddrink = new Intent(FirstPage.this, colddrinkcategory.class);
                        //Second parameter is to load new activity...for now its main page only.
                        //Firstpage.class
                        startActivity(intentLoadcolddrink);
                    }
                });

        ImageButton popcorn = (ImageButton) findViewById(R.id.popcorn);
       /*
        if(screenseat.popcorncounter == 1)
        {
            popcorn.setVisibility(View.GONE);
        }
        */


        popcorn.setOnClickListener(


                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentLoadpopcorn = new Intent(FirstPage.this, popcorncategory.class);
                        //Second parameter is to load new activity...for now its main page only.
                        //Firstpage.class
                        startActivity(intentLoadpopcorn);

                    }

                });


        Button viewcart = (Button) findViewById(R.id.viewcart);

        viewcart.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View viewcart) {
                        Intent intentLoadviewcart = new Intent(FirstPage.this, ViewCart.class);
                        //
                        String seatfinal = screenseat.seat;
                        String rowfinal = screenseat.row;
                        String screenfinal = screenseat.screen;

                        intentLoadviewcart.putExtra("keyscreen", screenfinal);
                        intentLoadviewcart.putExtra("keyrow", rowfinal);
                        intentLoadviewcart.putExtra("keyseat", seatfinal);


                        //
                        //
                        String pizzanamefinal = pizzacategory.pizzaname;
                        String pizzasizefinal = pizzacategory.pizzasize;
                        String pizzaquantityfinal = pizzacategory.pizzaquantity;
                        intentLoadviewcart.putExtra("pizzanamefinal", pizzanamefinal);
                        intentLoadviewcart.putExtra("pizzasizefinal", pizzasizefinal);
                        intentLoadviewcart.putExtra("pizzaquantityfinal", pizzaquantityfinal);
                        //
                        //
                        String burgernamefinal = burgercategory.burgername;
                        String burgersizefinal = burgercategory.burgersize;
                        String burgerquantityfinal = burgercategory.burgerquantity;
                        intentLoadviewcart.putExtra("burgernamefinal", burgernamefinal);
                        intentLoadviewcart.putExtra("burgersizefinal", burgersizefinal);
                        intentLoadviewcart.putExtra("burgerquantityfinal", burgerquantityfinal);
                        //
                        //
                        String colddrinknamefinal = colddrinkcategory.colddrinkname;
                        String colddrinksizefinal = colddrinkcategory.colddrinksize;
                        String colddrinkquantityfinal = colddrinkcategory.colddrinkquantity;
                        intentLoadviewcart.putExtra("colddrinknamefinal", colddrinknamefinal);
                        intentLoadviewcart.putExtra("colddrinksizefinal", colddrinksizefinal);
                        intentLoadviewcart.putExtra("colddrinkquantityfinal", colddrinkquantityfinal);
                        //
                        //
                        String icecreamnamefinal = icecreamcategory.icecreamname;
                        String icecreamsizefinal = icecreamcategory.icecreamsize1;
                        String icecreamquantityfinal = icecreamcategory.icecreamquantity2;
                        intentLoadviewcart.putExtra("icecreamnamefinal", icecreamnamefinal);
                        intentLoadviewcart.putExtra("icecreamsizefinal", icecreamsizefinal);
                        intentLoadviewcart.putExtra("icecreamquantityfinal", icecreamquantityfinal);
                        //
                        //
                        String frenchfriesnamefinal = frenchfriescategory.frenchfriesname;
                        String frenchfriessizefinal = frenchfriescategory.frenchfriessize;
                        String frenchfriesquantityfinal = frenchfriescategory.frenchfriesquantity;
                        intentLoadviewcart.putExtra("frenchfriesnamefinal", frenchfriesnamefinal);
                        intentLoadviewcart.putExtra("frenchfriessizefinal", frenchfriessizefinal);
                        intentLoadviewcart.putExtra("frenchfriesquantityfinal", frenchfriesquantityfinal);
                        //
                        //
                        String popcornnamefinal = popcorncategory.popcornname;
                        String popcornsizefinal = popcorncategory.popcornsize;
                        String popcornquantityfinal = popcorncategory.popcornquantity;
                        intentLoadviewcart.putExtra("popcornnamefinal", popcornnamefinal);
                        intentLoadviewcart.putExtra("popcornsizefinal", popcornsizefinal);
                        intentLoadviewcart.putExtra("popcornquantityfinal", popcornquantityfinal);
                        //
                        //
                        //Second parameter is to load new activity...for now its main page only.
                        //Firstpage.class

                        startActivity(intentLoadviewcart);

                    }

                });


        Button orderfood = (Button) findViewById(R.id.orderfood);

        orderfood.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View orderfood) {

                        Intent intentLoadorderfood = new Intent(FirstPage.this, finalpage.class);
                        /*
                        rootNode = FirebaseDatabase.getInstance();
                        reference = rootNode.getReference("Order");
                       reference.child(id).setValue(helperClass);
                       */
                       startActivity(intentLoadorderfood);



                    }

                });


        ImageView help = (ImageView) findViewById(R.id.help);

        help.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View help) {
                        Intent intenthelp = new Intent(FirstPage.this, helppage.class);
                        startActivity(intenthelp);
                    }
                }
        );
//

//
        Button startagain = (Button) findViewById(R.id.startagain);

        startagain.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View startagain) {

                        Intent mStartActivity = new Intent(getBaseContext(), SplashScreen.class);
                        int mPendingIntentId = 123456;
                        PendingIntent mPendingIntent = PendingIntent.getActivity(getBaseContext(), mPendingIntentId, mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
                        AlarmManager mgr = (AlarmManager) getBaseContext().getSystemService(getBaseContext().ALARM_SERVICE);
                        mgr.set(AlarmManager.RTC, System.currentTimeMillis(), mPendingIntent);
                        System.exit(0);




                    }



                });
        Button options = (Button)findViewById(R.id.options);
        options.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View options){
                        Intent Loadoptions = new Intent(FirstPage.this,options.class);
                        startActivity(Loadoptions);
                    }

                }
        );








    }}
