package BeverageBasises;

import BeverageBasises.EspressoDrink;

public class Macchiato extends EspressoDrink {

    public Macchiato(){
        espDescription ="Espresso Macchiato";
    }
    @Override
    public double cost() {
        return 2.80;
    }
}
