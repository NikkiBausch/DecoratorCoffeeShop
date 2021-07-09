package Espressos;

import Espressos.EspressoDrink;

public class Cappuccino extends EspressoDrink {

    public Cappuccino(){
        espDescription ="Cappuccino";
    }
    @Override
    public double cost() {
        return 3.00;
    }
}
