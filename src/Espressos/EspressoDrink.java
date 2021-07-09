package Espressos;

public abstract class EspressoDrink {

    String espDescription = "Unknown Espresso Drink";

    public String getDescription(){
        return espDescription;
    }

    public abstract double cost();

    public void setDescription(String espDescription) {
        this.espDescription = espDescription;
    }
}

