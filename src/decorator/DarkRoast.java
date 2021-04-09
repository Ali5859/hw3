package decorator;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Delicious DarkRoast";
    }
    public double cost(){
        return 0.99;
    }
}
