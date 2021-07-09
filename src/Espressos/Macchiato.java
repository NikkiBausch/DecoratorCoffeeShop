package Espressos;

import Espressos.EspressoDrink;

public class Macchiato extends EspressoDrink {

    public Macchiato(){
        espDescription ="Espresso Macchiato";
    }
    @Override
    public double cost() {
        return 2.80;
    }
}
