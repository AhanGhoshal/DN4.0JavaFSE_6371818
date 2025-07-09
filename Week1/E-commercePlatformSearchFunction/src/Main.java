public class Main {
    public static void main(String[] args){
        Product[] prod = new Product[]
                {
                        new Product(1, "Shoe", "Clothing"),
                        new Product(2, "Phone", "Electronics"),
                        new Product(3, "Watch", "Accessories"),
                        new Product(4, "Shirt", "Clothing"),
                        new Product(5, "Laptop", "Electronics")
                };

        System.out.println("Linear Search:");
        Product lin = LinearSearch.linear(prod, "Shirt");
        if (lin!=null)
            System.out.println("Found: "+lin+"\n");
        else
            System.out.println("Product Not Found!\n");

        System.out.println("Binary Search:");
        Product bin = BinarySearch.binary(prod, "Laptop");
        if (bin!=null)
            System.out.println("Found: "+bin+"\n");
        else
            System.out.println("Product Not Found!\n");

    }
}
