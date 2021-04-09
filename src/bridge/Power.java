package bridge;

public class Power extends PowerAbstraction{
    public Power(PowerImplementor powerImplementor){
        super(powerImplementor);
    }

    @Override
    public double powerify(double a, double b) {
        return powerImplementor.power(a,b);
    }
}
