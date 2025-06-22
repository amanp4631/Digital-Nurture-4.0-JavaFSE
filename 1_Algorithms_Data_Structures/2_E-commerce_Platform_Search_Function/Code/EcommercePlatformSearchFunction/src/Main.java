import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone", "Electronics"),
            new Product(104, "Crocs", "Footwear"),
            new Product(103, "MacBoook", "Electronics"),
            new Product(102, "Allen Solly", "Clothing"),
            new Product(105, "SkyBags", "Accessories")
        };

        int searchId = 104;
        
        Searching search = new Searching();

        Product result = search.linearSearch(products, searchId);
        System.out.println("Linear Search Result:");
        if(result == null) {
        	System.out.println("Product not found");
        }
        else {
        	System.out.println("Product Found");
        }
        
        Arrays.sort(products, Comparator.comparingInt(p -> p.getProductId()));
        
        result = search.binarySearch(products, searchId);
        System.out.println("Binary Search Result:");
        if(result == null) {
        	System.out.println("Product not found");
        }
        else {
        	System.out.println("Product Found");
        }
        
    }
}
