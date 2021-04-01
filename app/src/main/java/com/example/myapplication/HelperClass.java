package com.example.myapplication;

import java.util.UUID;

public class HelperClass {
    String OrderID;
     String  BurgerName, BurgerQuantity, BurgerSize, ColddrinkName, ColddrinkQuantity, ColddrinkSize, Extras, FrenchFriesName, FrenhFriesQuantity, FrenchFriesSize, IcecreamName, IcecreamSize, IcecreamQuantity, PizzaName, PizzaQuantity, PizzaSize, PopcornName, PopcornSize, PopcornQuantity, Row, Seat, Screen;

    public HelperClass() {
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public String getBurgerName() {
        return BurgerName;
    }

    public void setBurgerName(String burgerName) {
        BurgerName = burgerName;
    }

    public String getBurgerQuantity() {
        return BurgerQuantity;
    }

    public void setBurgerQuantity(String burgerQuantity) {
        BurgerQuantity = burgerQuantity;
    }

    public String getBurgerSize() {
        return BurgerSize;
    }

    public void setBurgerSize(String burgerSize) {
        BurgerSize = burgerSize;
    }

    public String getColddrinkName() {
        return ColddrinkName;
    }

    public void setColddrinkName(String colddrinkName) {
        ColddrinkName = colddrinkName;
    }

    public String getColddrinkQuantity() {
        return ColddrinkQuantity;
    }

    public void setColddrinkQuantity(String colddrinkQuantity) {
        ColddrinkQuantity = colddrinkQuantity;
    }

    public String getColddrinkSize() {
        return ColddrinkSize;
    }

    public void setColddrinkSize(String colddrinkSize) {
        ColddrinkSize = colddrinkSize;
    }

    public String getExtras() {
        return Extras;
    }

    public void setExtras(String extras) {
        Extras = extras;
    }

    public String getFrenchFriesName() {
        return FrenchFriesName;
    }

    public void setFrenchFriesName(String frenchFriesName) {
        FrenchFriesName = frenchFriesName;
    }

    public String getFrenchFriesQuantity() {
        return FrenhFriesQuantity;
    }

    public void setFrenhFriesQuantity(String frenhFriesQuantity) {
        frenhFriesQuantity = frenhFriesQuantity;
    }

    public String getFrenchFriesSize() {
        return FrenchFriesSize;
    }

    public void setFrenchFriesSize(String frenchFriesSize) {
        FrenchFriesSize = frenchFriesSize;
    }

    public String getIcecreamName() {
        return IcecreamName;
    }

    public void setIcecreamName(String icecreamName) {
        IcecreamName = icecreamName;
    }

    public String getIcecreamSize() {
        return IcecreamSize;
    }

    public void setIcecreamSize(String icecreamSize) {
        IcecreamSize = icecreamSize;
    }

    public String getIcecreamQuantity() {
        return IcecreamQuantity;
    }

    public void setIcecreamQuantity(String icecreamQuantity) {
        IcecreamQuantity = icecreamQuantity;
    }

    public String getPizzaName() {
        return PizzaName;
    }

    public void setPizzaName(String pizzaName) {
        PizzaName = pizzaName;
    }

    public String getPizzaQuantity() {
        return PizzaQuantity;
    }

    public void setPizzaQuantity(String pizzaQuantity) {
        PizzaQuantity = pizzaQuantity;
    }

    public String getPizzaSize() {
        return PizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        PizzaSize = pizzaSize;
    }

    public String getPopcornName() {
        return PopcornName;
    }

    public void setPopcornName(String popcornName) {
        PopcornName = popcornName;
    }

    public String getPopcornSize() {
        return PopcornSize;
    }

    public void setPopcornSize(String popcornSize) {
        PopcornSize = popcornSize;
    }

    public String getPopcornQuantity() {
        return PopcornQuantity;
    }

    public void setPopcornQuantity(String popcornQuantity) {
        PopcornQuantity = popcornQuantity;
    }

    public String getRow() {
        return Row;
    }

    public void setRow(String row) {
        Row = row;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String seat) {
        Seat = seat;
    }

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String screen) {
        Screen = screen;
    }

    public HelperClass(String burgerName, String burgerQuantity, String burgerSize, String colddrinkName, String colddrinkQuantity, String colddrinkSize, String extras, String frenchFriesName, String frenhFriesQuantity, String frenchFriesSize, String icecreamName, String icecreamSize, String icecreamQuantity, String pizzaName, String pizzaQuantity, String pizzaSize, String popcornName, String popcornSize, String popcornQuantity, String row, String seat, String screen) {
        OrderID = UUID.randomUUID().toString();
        BurgerName = burgerName;
        BurgerQuantity = burgerQuantity;
        BurgerSize = burgerSize;
        ColddrinkName = colddrinkName;
        ColddrinkQuantity = colddrinkQuantity;
        ColddrinkSize = colddrinkSize;
        Extras = extras;
        FrenchFriesName = frenchFriesName;
        FrenhFriesQuantity = frenhFriesQuantity;
        FrenchFriesSize = frenchFriesSize;
        IcecreamName = icecreamName;
        IcecreamSize = icecreamSize;
        IcecreamQuantity = icecreamQuantity;
        PizzaName = pizzaName;
        PizzaQuantity = pizzaQuantity;
        PizzaSize = pizzaSize;
        PopcornName = popcornName;
        PopcornSize = popcornSize;
        PopcornQuantity = popcornQuantity;
        Row = row;
        Seat = seat;
        Screen = screen;

    }
}
