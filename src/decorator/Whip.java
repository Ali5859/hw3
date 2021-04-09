package decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }
    public String addBehavior(){
        return "with whip";
    }
    public double cost() {
        return .10 + super.cost();
    }
}
