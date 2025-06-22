import java.util.Arrays;
import java.util.Comparator;

public class SearchService {

    // Linear Search 
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search 
    public static Product binarySearch(Product[] products, String name) 
    {
        int low = 0, high = products.length - 1;
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    // Sort array 
    public static void sortProductsByName(Product[] products) 
    {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
