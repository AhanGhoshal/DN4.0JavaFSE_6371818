public class Product {
    int productid;
    String productName;
    String category;

    public Product(int productid, String productName, String category) {
        this.productid = productid;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[ProductID: " + productid + ", ProductName: " + productName + ", Category: " + category + "]";
    }
}
