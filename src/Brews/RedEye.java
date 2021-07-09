package Brews;

import Brews.BlondeRoast;

public class RedEye extends BlondeRoast {

    public RedEye(){
        description = "Red Eye";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
