package BeverageBasises;

import BeverageBasises.EspressoDrink;

public class Doubleshot extends EspressoDrink {

    public Doubleshot(){
        espDescription= "Double Shot on Ice";
    }
    @Override
    public double cost() {
        return 2.00;
    }
}
