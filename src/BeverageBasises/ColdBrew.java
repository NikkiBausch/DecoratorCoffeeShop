package BeverageBasises;

public abstract class ColdBrew {

    String brewDescription= "Unknown Cold Brew Beverage";

    public String getBrewDescription(){
        return brewDescription;
    }

    public void setBrewDescription(String brewDescription) {
        this.brewDescription = brewDescription;
    }


    public abstract double cost();
}
