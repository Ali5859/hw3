package decorator;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Delicious Espresso";
    }
    public double cost(){
        return 1.99;
    }
}
