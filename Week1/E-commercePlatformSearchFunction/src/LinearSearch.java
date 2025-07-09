public class LinearSearch {
    public static Product linear(Product[] pro, String target) {
        for (Product p : pro) {
            if (p.productName.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }
}
