package bridge;

public abstract class PowerAbstraction {
    PowerImplementor powerImplementor;

    public PowerAbstraction(PowerImplementor powerImplementor) {
        this.powerImplementor = powerImplementor;
    }

    public abstract double powerify(double a, double b);
}
