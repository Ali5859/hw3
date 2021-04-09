package bridge;

public class PowerMethodOne extends Multiple implements PowerImplementor {
    public PowerMethodOne(MultiplicationImplementor multiplicationImplementor) {
        super(multiplicationImplementor);
    }

    @Override
    public double power(double a, double b) {
        double result = 1;
        for (int i = 0; i < b; i++){
            result = multiplicationImplementor.multiple(result,a);
        }
        if (b == 0){
            return 1;
        }
        return result;
    }
}
