package bridge;

import java.math.*;


public class PowerMethodTwo extends Multiple implements PowerImplementor{
    public PowerMethodTwo(MultiplicationImplementor multiplicationImplementor) {
        super(multiplicationImplementor);
    }

    @Override
    public double power(double a, double b) {
        double result = 1;
        if (b == 0){
            return 1;
        }
        if (b % 2 == 0){
            for (int i = 0; i < Math.ceil(b/2); i++){
                result = multiplicationImplementor.multiple(result,a);
            }
            result = multiplicationImplementor.multiple(result,result);
            return result;
        }
        if (b % 2 == 1){
            for (int i = 1; i <= (int) Math.ceil(b/2)-1; i++){
                result = multiplicationImplementor.multiple(result,a);
            }
            result = multiplicationImplementor.multiple(result,result);
            result = multiplicationImplementor.multiple(result,a);
            return result;
        }
        return result;

    }
}
