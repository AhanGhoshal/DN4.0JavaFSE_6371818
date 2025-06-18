public class Main {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        Logger l3 = Logger.getInstance();

        if (l1 == l3 && l1 == l2) {
            System.out.println("Singleton Pattern.");
        }
        else {
            System.out.println("Different instances exist. Not Singleton Pattern.");
        }
    }
}
