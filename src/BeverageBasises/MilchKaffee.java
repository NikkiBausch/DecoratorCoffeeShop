package BeverageBasises;

public class MilchKaffee extends BlondeRoast{

    public MilchKaffee(){
        description = "Coffee with Milk";
    }
    @Override
    public double cost() {
        return 2.00;
    }
}
