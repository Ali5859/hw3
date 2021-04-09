package bridge;

public class Multiple extends MultipleAbstraction{
    public Multiple(MultiplicationImplementor multiplicationImplementor){
        super(multiplicationImplementor);
    }

    @Override
    public double multiply(double a, double b) {
        return multiplicationImplementor.multiple(a,b);
    }
}
