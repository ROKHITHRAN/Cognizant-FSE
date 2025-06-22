public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double rate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return calculateFutureValue(initialValue, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization
    public static double calculateFutureValueMemo(double initialValue, double rate, int years, Double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != null) return memo[years];
        memo[years] = calculateFutureValueMemo(initialValue, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.1; 
        int years = 5;

        double future = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Recursive Forecast (No Memo): $%.2f\n", future);

        Double[] memo = new Double[years + 1];
        double futureMemo = calculateFutureValueMemo(initialValue, growthRate, years, memo);
        System.out.printf("Recursive Forecast (With Memo): $%.2f\n", futureMemo);
    }
}
