public class FutureCalculator {
public static double findFutureValue(double currentAmount, double rate, int years) {
double multiplier = Calculator.findPower(1 + rate, years);  // (1 + r)^n
return currentAmount * multiplier;
    }
}

