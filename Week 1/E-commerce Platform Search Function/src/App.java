public class App {
    public static void main(String[] args) throws Exception 
    {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Watch", "Accessories")
        };

        // Linear Search
        Product foundLinear = SearchService.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        SearchService.sortProductsByName(products);

        // Binary Search
        Product foundBinary = SearchService.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}
