package decorator;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }
    public String addBehavior(){
        return "with milk";
    }
    public double cost() {
        return .10 + super.cost();
    }
}
