package BeverageBasises;

public  class Americano extends EspressoDrink {

    public Americano(){
        espDescription= "Americano";
    }
    @Override
    public double cost() {
        return 2.75;
    }
}
