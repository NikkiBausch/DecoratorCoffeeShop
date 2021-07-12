package BeverageBasises;

public abstract class MatchaLatte extends Beverage{
    String matchaDescription= "Unknown Matcha Beverage";

    public String getMatchaDescription(){
        return matchaDescription;
    }

    public void setMatchaDescription(String matchaDescription) {
        this.matchaDescription = matchaDescription;
    }

    public abstract double cost();
}
