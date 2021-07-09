package Lattes;



public abstract class Latte {
    String latteDescription= "Unknown Latte Beverage";

    public String getLatteDescription(){
        return latteDescription;
    }

    public void setLatteDescription(String latteDescription) {
        this.latteDescription = latteDescription;
    }

    public abstract double cost();
}
