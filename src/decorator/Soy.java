package decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + addBehavior();
    }
    public String addBehavior(){
        return "with soy";
    }
    public double cost() {
        return .15 + super.cost();
    }
}
