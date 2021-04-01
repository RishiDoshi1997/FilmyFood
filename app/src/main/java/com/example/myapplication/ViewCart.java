package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ViewCart extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    //
        TextView ptotal;
        TextView btotalcart;
        TextView ctotalcart;
        TextView itotalcart;
        TextView ftotalcart;
        TextView pptotalcart;
        TextView totalpricecart;
        //

    public static HelperClass helperClass;

public TextView extracart;
public TextView screenfinal, rowfinal, seatfinal;
    public TextView pizzanamefinal, pizzasizefinal, pizzaquantityfinal;
    public TextView burgernamefinal, burgersizefinal, burgerquantityfinal;
    public TextView colddrinknamefinal, colddrinksizefinal, colddrinkquantityfinal;
    public TextView icecreamnamefinal, icecreamsizefinal, icecreamquantityfinal;
    public TextView frenchfriesnamefinal, frenchfriessizefinal, frenchfriesquantityfinal;
    public TextView popcornnamefinal, popcornsizefinal, popcornquantityfinal;
    public String extraTop;


    ///

    ///
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cart);
//


        //


        //
        extracart = findViewById(R.id.extracart);
        StringBuilder stringBuilder1 = new StringBuilder();
        for (String s : screenseat.optionresult)
            stringBuilder1.append(s).append("\n");
        extracart.setText(stringBuilder1.toString());
        extraTop = new String(stringBuilder1.toString());
        //

        //
        //
        screenfinal = findViewById(R.id.screenfinal);
        rowfinal = findViewById(R.id.rowfinal);
        seatfinal = findViewById(R.id.seatfinal);

        String screen = getIntent().getStringExtra("keyscreen");
        String row = getIntent().getStringExtra("keyrow");
        String seat = getIntent().getStringExtra("keyseat");


        screenfinal.setText(screen);
        rowfinal.setText(row);
        seatfinal.setText(seat);
//

//
        pizzanamefinal = findViewById(R.id.pizzanamefinal);
        pizzasizefinal = findViewById(R.id.pizzasizefinal);
        pizzaquantityfinal = findViewById(R.id.pizzaquantityfinal);

        String pizzaname = getIntent().getStringExtra("pizzanamefinal");
        String pizzasize = getIntent().getStringExtra("pizzasizefinal");
        String pizzaquantity = getIntent().getStringExtra("pizzaquantityfinal");


        pizzanamefinal.setText(pizzaname);
        pizzasizefinal.setText(pizzasize);
        pizzaquantityfinal.setText(pizzaquantity);
//
//
        burgernamefinal = findViewById(R.id.burgernamefinal);
        burgersizefinal = findViewById(R.id.burgersizefinal);
        burgerquantityfinal = findViewById(R.id.burgerquantityfinal);

        String burgername = getIntent().getStringExtra("burgernamefinal");
        String burgersize = getIntent().getStringExtra("burgersizefinal");
        String burgerquantity = getIntent().getStringExtra("burgerquantityfinal");


        burgernamefinal.setText(burgername);
        burgersizefinal.setText(burgersize);
        burgerquantityfinal.setText(burgerquantity);
//
//
        colddrinknamefinal = findViewById(R.id.colddrinknamefinal);
        colddrinksizefinal = findViewById(R.id.colddrinksizefinal2);
        colddrinkquantityfinal = findViewById(R.id.colddrinkquantityfinal);

        String colddrinkname = getIntent().getStringExtra("colddrinknamefinal");
        String colddrinksize = getIntent().getStringExtra("colddrinksizefinal");
        String colddrinkquantity = getIntent().getStringExtra("colddrinkquantityfinal");


        colddrinknamefinal.setText(colddrinkname);
        colddrinksizefinal.setText(colddrinksize);
        colddrinkquantityfinal.setText(colddrinkquantity);
//
//
        icecreamnamefinal = findViewById(R.id.icecreamnamefinal);
        icecreamsizefinal = findViewById(R.id.icecreamsizefinal);
        icecreamquantityfinal = findViewById(R.id.icecreamquantityfinal);

        String icecreamname = getIntent().getStringExtra("icecreamnamefinal");
        String icecreamsize = getIntent().getStringExtra("icecreamsizefinal");
        String icecreamquantity = getIntent().getStringExtra("icecreamquantityfinal");


        icecreamnamefinal.setText(icecreamname);
        icecreamsizefinal.setText(icecreamsize);
        icecreamquantityfinal.setText(icecreamquantity);
//
//
        popcornnamefinal = findViewById(R.id.popcornnamefinal);
        popcornsizefinal = findViewById(R.id.popcornsizefinal);
        popcornquantityfinal = findViewById(R.id.popcornquantityfinal);

        String popcornname = getIntent().getStringExtra("popcornnamefinal");
        String popcornsize = getIntent().getStringExtra("popcornsizefinal");
        String popcornquantity = getIntent().getStringExtra("popcornquantityfinal");


        popcornnamefinal.setText(popcornname);
        popcornsizefinal.setText(popcornsize);
        popcornquantityfinal.setText(popcornquantity);
//
//
        frenchfriesnamefinal = findViewById(R.id.frenchfriesnamefinal);
        frenchfriessizefinal = findViewById(R.id.frenchfriessizefinal2);
        frenchfriesquantityfinal = findViewById(R.id.frenchfriesquantityfinal);

        String frenchfriesname = getIntent().getStringExtra("frenchfriesnamefinal");
        String frenchfriessize = getIntent().getStringExtra("frenchfriessizefinal");
        String frenchfriesquantity = getIntent().getStringExtra("frenchfriesquantityfinal");


        frenchfriesnamefinal.setText(frenchfriesname);
        frenchfriessizefinal.setText(frenchfriessize);
        frenchfriesquantityfinal.setText(frenchfriesquantity);
//
//


        Button goback = (Button) findViewById(R.id.goback);

        goback.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View goback) {


                        rootNode = FirebaseDatabase.getInstance();
                        reference = rootNode.getReference("Order");
                        helperClass = new HelperClass(burgercategory.burgername, burgercategory.burgerquantity, burgercategory.burgersize, colddrinkcategory.colddrinkname, colddrinkcategory.colddrinkquantity, colddrinkcategory.colddrinksize, extraTop, frenchfriescategory.frenchfriesname, frenchfriescategory.frenchfriesquantity, frenchfriescategory.frenchfriessize, icecreamcategory.icecreamname, icecreamcategory.icecreamsize1, icecreamcategory.icecreamquantity2, pizzacategory.pizzaname, pizzacategory.pizzaquantity, pizzacategory.pizzasize, popcorncategory.popcornname, popcorncategory.popcornsize, popcorncategory.popcornquantity, row, seat, screen);
                        String id = helperClass.getOrderID();
                        reference.child(id).setValue(helperClass);
                        Intent intentLoadgoback = new Intent(ViewCart.this, ViewCart.class);

                        startActivity(intentLoadgoback);

                    }


                });
        Button goback7 = (Button) findViewById(R.id.goback7);

        goback7.setOnClickListener(
                new Button.OnClickListener() {


                    @Override
                    public void onClick(View goback7) {
                        Intent intentLoadgoback7 = new Intent(ViewCart.this, FirstPage.class);

                        startActivity(intentLoadgoback7);
                    }
                });

        //      //


//
        ImageView pizzacancel = (ImageView) findViewById(R.id.pizzacancel);
        pizzacancel.setOnClickListener(
                new ImageView.OnClickListener() {
                    @Override
                    public void onClick(View pizzacancel) {
                        pizzanamefinal.setText("");
                        pizzasizefinal.setText("");
                        pizzaquantityfinal.setText("");

                        pizzacategory.pizzaname = "";
                        pizzacategory.pizzaquantity = "";
                        pizzacategory.pizzasize = "";
                    }
                }
        );
//
        //
        ImageView burgercancel = (ImageView) findViewById(R.id.burgercancel);
        burgercancel.setOnClickListener(
                new ImageView.OnClickListener() {
                    @Override
                    public void onClick(View burgercancel) {
                        burgernamefinal.setText("");
                        burgersizefinal.setText("");
                        burgerquantityfinal.setText("");
                        burgercategory.burgername = "";
                        burgercategory.burgerquantity = "";
                        burgercategory.burgersize = "";
                    }
                }
        );
        //
        ImageView colddrinkcancel = (ImageView) findViewById(R.id.colddrinkcancel);
        colddrinkcancel.setOnClickListener(
                new ImageView.OnClickListener() {
                    @Override
                    public void onClick(View colddrinkcancel) {
                        colddrinknamefinal.setText("");
                        colddrinksizefinal.setText("");
                        colddrinkquantityfinal.setText("");
                        colddrinkcategory.colddrinkname = "";
                        colddrinkcategory.colddrinkquantity = "";
                        colddrinkcategory.colddrinksize = "";
                    }
                }
        );
        //
        ImageView icecreamcancel = (ImageView) findViewById(R.id.icecreamcancel);
        icecreamcancel.setOnClickListener(
                new ImageView.OnClickListener() {
                    @Override
                    public void onClick(View icecreamcancel) {
                        icecreamnamefinal.setText("");
                        icecreamsizefinal.setText("");
                        icecreamquantityfinal.setText("");
                        icecreamcategory.icecreamname = "";
                        icecreamcategory.icecreamquantity2 = "";
                        icecreamcategory.icecreamsize1 = "";
                    }
                }
        );
        //
        ImageView frenchfriescancel = (ImageView) findViewById(R.id.frenchfriescancel);
        frenchfriescancel.setOnClickListener(
                new ImageView.OnClickListener() {
                    @Override
                    public void onClick(View frenchfriescancel) {
                        frenchfriesnamefinal.setText("");
                        frenchfriessizefinal.setText("");
                        frenchfriesquantityfinal.setText("");
                        frenchfriescategory.frenchfriesname = "";
                        frenchfriescategory.frenchfriesquantity = "";
                        frenchfriescategory.frenchfriessize = "";
                    }
                }
        );
        //
        ImageView popcorncancel = (ImageView) findViewById(R.id.popcorncancel);
        popcorncancel.setOnClickListener(
                new ImageView.OnClickListener() {
                    @Override
                    public void onClick(View popcorncancel) {
                        popcornnamefinal.setText("");
                        popcornsizefinal.setText("");
                        popcornquantityfinal.setText("");
                        popcorncategory.popcornname = "";
                        popcorncategory.popcornquantity = "";
                        popcorncategory.popcornsize = "";
                    }
                }
        );



        ptotal = (TextView) findViewById(R.id.ptotal);
        btotalcart = (TextView) findViewById(R.id.btotalcart);
        ctotalcart = (TextView)findViewById(R.id.ctotalcart);
        itotalcart = (TextView)findViewById(R.id.itotalcart);
        ftotalcart = (TextView)findViewById(R.id.ftotalcart);
        pptotalcart = (TextView)findViewById(R.id.pptotalcart);

        //


        float zero = 0;
        String emp =Float.toString(zero);




        String psizeinput = pizzasizefinal.getText().toString();//get size input in application
        String pquantityinput = pizzaquantityfinal.getText().toString();//get integer value from application for quantity
        String pizzasizeget1 = "Small - 8.00$";//compare size input in application
        String pizzasizeget2 = "Medium - 10.00$";
        String pizzasizeget3 = "Large - 12.00$";
if(psizeinput.equals(pizzasizeget1) || psizeinput.equals(pizzasizeget2) || psizeinput.equals(pizzasizeget3))
{
    int piquan = Integer.parseInt(pquantityinput);


    if (psizeinput.equals(pizzasizeget1)) {
        float totalforpizza1 = (float) 8 * piquan;
        ptotal.setText(( String.format("%f", totalforpizza1) ));
    } else if (psizeinput.equals(pizzasizeget2)) {
        float totalforpizza2 = (float) 10 * piquan;
        ptotal.setText(String.format("%f", totalforpizza2));
    } else if (psizeinput.equals(pizzasizeget3)) {
        float totalforpizza3 = (float) 12 * piquan;
        ptotal.setText(String.format("%f", totalforpizza3));

    }
}
else
{
    ptotal.setText(emp);
}


//
//

        btotalcart.setText(emp);

            String bsizeinput = burgersizefinal.getText().toString();
            String bquantityfinal = burgerquantityfinal.getText().toString();

                 String burgersizeget1 = "Medium - 10.00$";
            String burgersizeget3 = "Large - 12.00$";
            if(bsizeinput.equals(burgersizeget1) || bsizeinput.equals(burgersizeget3))
            {
            int buquan  = Integer.parseInt(bquantityfinal);




                if (bsizeinput.equals(burgersizeget1))
                {
                    float totalforburger1 = (float) 10 * buquan;
                    btotalcart.setText(String.format("%f", totalforburger1));
                }
                else if (bsizeinput.equals(burgersizeget3))
                {
                    float totalforburger2 = (float) 12 * buquan;
                    btotalcart.setText(String.format("%f", totalforburger2));

        }
        }
        else
        {
        btotalcart.setText(emp);
        }
        //


        ctotalcart.setText(emp);

            String csizeinput = colddrinksizefinal.getText().toString();
            String cquantityfinal = colddrinkquantityfinal.getText().toString();

               String colddrinksizeget1 = "Small - 2.50$";//compare size input in application
            String colddrinksizeget2 = "Medium - 5.50$";
            String colddrinksizeget3 = "Large - 7.500$";
        if(csizeinput.equals(colddrinksizeget1) || csizeinput.equals(colddrinksizeget2)||csizeinput.equals(colddrinksizeget3))
        {
            int coquan  = Integer.parseInt(cquantityfinal);





                if
                (csizeinput.equals(colddrinksizeget1))
                {
                    float totalforcolddrink1 = (float) ( 2.5 * coquan );
                    ctotalcart.setText(( String.format("%f", totalforcolddrink1) ));
                }
                else if (csizeinput.equals(colddrinksizeget2))
                {
                    float totalforcolddrink2 = (float) ( 5.50 * coquan );
                    ptotal.setText(String.format("%f", totalforcolddrink2));
                }
                else if (csizeinput.equals(colddrinksizeget3))
                {
                    float totalforcolddrink3 = (float) ( 7.5 * coquan );
                    ptotal.setText(String.format("%f", totalforcolddrink3));

        }}
        else
        {
            ctotalcart.setText(emp);
        }
        //

        itotalcart.setText(emp);

            String isizeinput = icecreamsizefinal.getText().toString();
            String iquantityfinal = icecreamquantityfinal.getText().toString();
               String icecreamsizeget1 = "Small - 5.00$";//compare size input in application
            String icecreamsizeget2 = "Medium - 7.00$";
            String icecreamsizeget3 = "Large - 9.00$";
        if(isizeinput.equals(icecreamsizeget1) || isizeinput.equals(icecreamsizeget2)||isizeinput.equals(icecreamsizeget3))
        {
            int icquan = Integer.parseInt(iquantityfinal);





                if (isizeinput.equals(icecreamsizeget1))
                {
                    float totalforicecream1 = (float) ( 5 * icquan );
                    itotalcart.setText(( String.format("%f", totalforicecream1) ));
                }
                else if (isizeinput.equals(icecreamsizeget2))
                {
                    float totalforicecream2 = (float) ( 7 * icquan );
                    itotalcart.setText(String.format("%f", totalforicecream2));
                }
                else if (isizeinput.equals(icecreamsizeget3))
                {
                    float totalforicecreamm3 = (float) ( 9 * icquan );
                    itotalcart.setText(String.format("%f", totalforicecreamm3));

        }}
        else
        {
            itotalcart.setText(emp);
        }
//

        ftotalcart.setText(emp);

            String fsizeinput = frenchfriessizefinal.getText().toString();
            String fquantityfinal = frenchfriesquantityfinal.getText().toString();
             String frenchfriessizeget1 = "Small - 7.00$";//compare size input in application
            String frenchfriessizeget2 = "Medium - 9.00$";
            String frenchfriessizeget3 = "Large - 11.00$";
        if(fsizeinput.equals(frenchfriessizeget1) || fsizeinput.equals(frenchfriessizeget2)||fsizeinput.equals(frenchfriessizeget3)) {
            int ffquan = Integer.parseInt(fquantityfinal);


            if (fsizeinput.equals(frenchfriessizeget1)) {
                float totalforfrenchfries1 = (float) ( 7 * ffquan );
                ftotalcart.setText(( String.format("%f", totalforfrenchfries1) ));
            } else if (fsizeinput.equals(frenchfriessizeget2)) {
                float totalforfrenchfries2 = (float) ( 9 * ffquan );
                ftotalcart.setText(String.format("%f", totalforfrenchfries2));
            } else if (fsizeinput.equals(frenchfriessizeget3)) {
                float totalforfrenchfries3 = (float) ( 9 * ffquan );
                ftotalcart.setText(String.format("%f", totalforfrenchfries3));
            }
        }
        else
        {
            ftotalcart.setText(emp);
        }
//

        pptotalcart.setText(emp);

            String ppsizeinput = popcornsizefinal.getText().toString();
            String ppquantityfinal = popcornquantityfinal.getText().toString();
              String popcornsizeget1 = "Small - 7.00$";//compare size input in application
            String popcornsizeget2 = "Medium - 9.00$";
            String popcornsizeget3 = "Large - 11.00$";
        if(ppsizeinput.equals(popcornsizeget1) || ppsizeinput.equals(popcornsizeget2)||ppsizeinput.equals(popcornsizeget3))
        {
            int ppquan = Integer.parseInt(ppquantityfinal);





                if (ppsizeinput.equals(popcornsizeget1))
                {
                    float totalforpopcorn1 = (float) ( 7 * ppquan );
                    pptotalcart.setText(( String.format("%f", totalforpopcorn1) ));
                }
                else if (ppsizeinput.equals(popcornsizeget2))
                {
                    float totalforpopcorn2 = (float) ( 9 * ppquan );
                    pptotalcart.setText(String.format("%f", totalforpopcorn2));
                }
                else if (ppsizeinput.equals(popcornsizeget3))
                {
                    float totalforpopcorn3 = (float) ( 9 * ppquan );
                    pptotalcart.setText(String.format("%f", totalforpopcorn3));
                }}
        else
        {
            pptotalcart.setText(emp);
        }


        totalpricecart = (TextView)findViewById(R.id.totalpricecart);
        Float totalforcart = (float) 0;

        Float pizzasettotal;
        String pizzagettotal = ptotal.getText().toString();
        pizzasettotal = Float.parseFloat(pizzagettotal);

        Float burgersettotal;
        String burgergettotal = btotalcart.getText().toString();
        burgersettotal = Float.parseFloat(burgergettotal);

        Float frenchfriessettotal;
        String frenchfriesgettotal = ftotalcart.getText().toString();
        frenchfriessettotal = Float.parseFloat(frenchfriesgettotal);

        Float icecreamsettotal;
        String icecreamgettotal = itotalcart.getText().toString();
        icecreamsettotal = Float.parseFloat(icecreamgettotal);

        Float colddrinksettotal;
        String colddrinkgettotal = ctotalcart.getText().toString();
        colddrinksettotal = Float.parseFloat(colddrinkgettotal);

        Float popcornsettotal;
        String popcorngettotal = pptotalcart.getText().toString();
        popcornsettotal = Float.parseFloat(popcorngettotal);

        totalforcart = pizzasettotal + burgersettotal + popcornsettotal + icecreamsettotal + frenchfriessettotal + colddrinksettotal;
        String totaltotal = Float.toString(totalforcart);
        totalpricecart.setText(totaltotal+"$");





}}