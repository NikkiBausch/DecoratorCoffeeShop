package Brews;

import Brews.BlondeRoast;

public class BlackEye extends BlondeRoast {

    public BlackEye(){
        description= "Black Eye";
    }
    @Override
    public double cost() {
        return 3.50;
    }
}
