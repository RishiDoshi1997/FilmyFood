package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<Model> mList;
    Context context;

    public MyAdapter(Context context , ArrayList<Model> mList)
    {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = mList.get(position);
        holder.BurgerName.setText(model.getBurgerName());
        holder.BurgerQuantity.setText(model.getBurgerQuantity());
        holder.BurgerSize.setText(model.getBurgerSize());
        holder.ColddrinkName.setText(model.getColddrinkName());
        holder.ColddrinkSize.setText(model.getColddrinkSize());
        holder.ColddrinkQuantity.setText(model.getColddrinkQuantity());
        holder.Extra.setText(model.getExtra());

        holder.FrenchFriesName.setText(model.getFrenchFriesName());
        holder.FrenchFriesQuantity.setText(model.getFrenchFriesQuantity());
        holder.FrenchFriesSize.setText(model.getFrenchFriesSize());

        holder.IceCreamName.setText(model.getIceCreamName());
        holder.IceCreamSize.setText(model.getIceCreamSize());
        holder.IceCreamQuantity.setText(model.getIceCreamQuantity());

        holder.OrderID.setText(model.getOrderID());
        holder.PopcornName.setText(model.getPopcornName());
        holder.PopcornQuantity.setText(model.getPopcornQuantity());
        holder.PopcornSize.setText(model.getPopcornSize());
        holder.PizzaName.setText(model.getPizzaName());
        holder.PizzaSize.setText(model.getPizzaSize());
        holder.PizzaQuantity.setText(model.getPizzaQuantity());
        holder.Screen.setText(model.getScreen());
        holder.Seat.setText(model.getSeat());
        holder.Row.setText(model.getRow());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
            TextView BurgerName, BurgerQuantity, BurgerSize, ColddrinkName, ColddrinkQuantity, ColddrinkSize, Extra, FrenchFriesName, FrenchFriesQuantity, FrenchFriesSize, IceCreamName, IceCreamQuantity, IceCreamSize, OrderID, PizzaName, PizzaSize, PizzaQuantity, PopcornName, PopcornSize, PopcornQuantity, Row,Screen,Seat;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            BurgerName = itemView.findViewById(R.id.bnadmin);
            BurgerQuantity = itemView.findViewById(R.id.bqadmin);
            BurgerSize = itemView.findViewById(R.id.bsadmin);
            ColddrinkName = itemView.findViewById(R.id.cnadmin);
            ColddrinkQuantity = itemView.findViewById(R.id.cqadmin);
            ColddrinkSize = itemView.findViewById(R.id.csadmin);
            Extra = itemView.findViewById(R.id.eadmin);
            FrenchFriesName = itemView.findViewById(R.id.fnadmin);
            FrenchFriesQuantity = itemView.findViewById(R.id.fqadmin);
            FrenchFriesSize = itemView.findViewById(R.id.fsadmin);

            IceCreamName = itemView.findViewById(R.id.inadmin);
            IceCreamQuantity = itemView.findViewById(R.id.iqadmin);
            IceCreamSize = itemView.findViewById(R.id.isadmin);

            OrderID = itemView.findViewById(R.id.oadmin);
            PizzaName = itemView.findViewById(R.id.pnadmin);
            PizzaQuantity = itemView.findViewById(R.id.pqadmin);
            PizzaSize = itemView.findViewById(R.id.psadmin);
            PopcornName = itemView.findViewById(R.id.ppnadmin);
            PopcornQuantity = itemView.findViewById(R.id.ppqadmin);
            PopcornSize = itemView.findViewById(R.id.ppsadmin);
            Screen = itemView.findViewById(R.id.btotal);
            Seat = itemView.findViewById(R.id.seatadmin);
            Row = itemView.findViewById(R.id.rowadmin);
        }
    }
}
