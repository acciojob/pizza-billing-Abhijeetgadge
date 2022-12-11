package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperbagAdded;
    private boolean isBillGenerated;
    private int extraCheese;
    private int extraTopping;
    private int paperBag;


    public Pizza(Boolean isVeg){
        isCheeseAdded = false;
        isToppingAdded = false;
        isBillGenerated = false;
        isPaperbagAdded = false;

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
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            price += extraCheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            price += extraTopping;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperbagAdded){
            price += paperBag;
            isPaperbagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            isBillGenerated = true;

            if(isCheeseAdded)
                bill += "Extra Cheese Added: " + extraCheese + "\n";

            if(isToppingAdded)
                bill += "Extra Topping Added: " + extraTopping + "\n";

            if(isPaperbagAdded)
                bill += "Paperbag Added: " + paperBag + "\n";

            bill += "Total Price: " + price + "\n";
        }
        return this.bill;
    }
}
