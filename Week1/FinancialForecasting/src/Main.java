public class Main {
    public static void main(String[] args) {
        double principal = 12300;
        double rate = 0.05;
        int years = 3;

        double predicted = FinancialForecast.predict(principal, rate, years);
        System.out.printf("Predicted future value after %d years: ₹%.2f\n", years, predicted);
    }
}
