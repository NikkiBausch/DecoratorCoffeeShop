package BeverageBasises;



public abstract class Latte extends Beverage{
    String latteDescription= "Unknown Latte Beverage";

    public String getLatteDescription(){
        return latteDescription;
    }

    public void setLatteDescription(String latteDescription) {
        this.latteDescription = latteDescription;
    }

    public abstract double cost();
}
