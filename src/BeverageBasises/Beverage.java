package BeverageBasises;

public abstract class Beverage {
    String description= "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public abstract double cost();
}
