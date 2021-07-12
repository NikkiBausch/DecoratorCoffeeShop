package BeverageBasises;

public  class Mokka extends BlondeRoast {

    public Mokka(){
        description= "Black coffee";
    }
    @Override
    public double cost() {
        return 1.50;
    }
}
