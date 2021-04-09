package bridge;

public abstract class MultipleAbstraction {
    MultiplicationImplementor multiplicationImplementor;

    public MultipleAbstraction(MultiplicationImplementor multiplicationImplementor) {
        this.multiplicationImplementor = multiplicationImplementor;
    }

    public abstract double multiply(double a, double b);
}
