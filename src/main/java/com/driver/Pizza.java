package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdd;
    private boolean isToppingsAdd;
    private boolean isPaperBagAdd;
    private boolean isBillGenerat;

    private int extraCheese;
    private int extraTopping;
    private int paperBag;


    public Pizza(Boolean isVeg) {
        isBillGenerat = false;
        isCheeseAdd = false;
        isToppingsAdd = false;
        isPaperBagAdd = false;

        this.isVeg = isVeg;

        extraCheese = 80;
        paperBag = 20;

        // your code goes here
        if (this.isVeg) {
            price = 300;
            extraTopping = 70;
        } else {
            price = 400;
            extraTopping = 120;
        }
        bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice() {

        return this.price;
    }


    public void addExtraCheese() {
        // your code goes here
        if (!isCheeseAdd) {
            price += extraCheese;
            isCheeseAdd = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isToppingsAdd) {
            price += extraTopping;
            isToppingsAdd = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!isPaperBagAdd) {
            price += paperBag;
            isPaperBagAdd = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBillGenerat) {
            isBillGenerat = true;

            if (isCheeseAdd)
                bill += "Extra Cheese Added: " + extraCheese + "\n";

            if (isToppingsAdd)
                bill += "Extra Toppings Added: " + extraTopping + "\n";

            if (isPaperBagAdd)
                bill += "Paperbag Added: " + paperBag + "\n";


            bill += "Total Price: " + price + "\n";


        }
        return this.bill;
    }
}
