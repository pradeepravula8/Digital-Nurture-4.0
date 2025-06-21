public class Calculator {
public static double findPower(double base, int times) {
if (times == 0) {
return 1;
}
return base * findPower(base, times - 1);
    }
}
