package Brews;

import Brews.BlondeRoast;

public class WienerMelange extends BlondeRoast {

    public WienerMelange(){
        description= "Wiener Melange";
    }
    @Override
    public double cost() {
        return 4.00;
    }
}
