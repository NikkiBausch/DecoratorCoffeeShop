package BeverageBasises;

import BeverageBasises.VanillaMatchaLatte;

public class WithoutMilk extends VanillaMatchaLatte {
    @Override
    public double cost() {
        return 0;
    }
}
