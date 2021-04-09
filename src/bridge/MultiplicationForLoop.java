package bridge;

public class MultiplicationForLoop implements MultiplicationImplementor{
    @Override
    public double multiple(double a, double b) {
        double result = 0;
        for (int i = 0; i < b; i++){
            result += a;
        }
        return result;
    }
}
