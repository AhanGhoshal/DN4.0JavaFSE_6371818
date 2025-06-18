public class FinancialForecast {
    public static double predict(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return (1 + rate) * predict(principal, rate, years - 1);
    }
}