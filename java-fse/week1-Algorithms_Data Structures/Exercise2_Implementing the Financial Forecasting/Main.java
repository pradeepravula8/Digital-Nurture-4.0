public class Main {
public static void main(String[] args) {
double startingAmount = 10000;      
double yearlyIncreaseRate = 0.08;   
int totalYears = 5;                 
double futureAmount = FutureCalculator.findFutureValue(startingAmount, yearlyIncreaseRate, totalYears);
System.out.printf("Amount after %d years: %.2f%n", totalYears, futureAmount);
    }
}
