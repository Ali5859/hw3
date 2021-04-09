package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }
    public String addBehavior(){
        return "with mocha";
    }
    public double cost() {
        return .20 + super.cost();
    }
}
