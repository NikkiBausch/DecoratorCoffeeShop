package BeverageBasises;



public abstract class BlondeRoast extends Beverage {
    String description = "Unknown Roast Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public void setDescription(String description) {
        this.description = description;
    }
}


