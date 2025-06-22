import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> item = new HashMap<>();

    public void addProduct(Product product) {
    	System.out.println("Adding product...");
        item.put(product.getProductId(), product);
    }

    public void updateProduct(int id, int quantity, double price) {
        Product p = item.get(id);
        if (p != null) {
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product Id: " + id + " updated");
        }
    }

    public void deleteProduct(int id) {
        System.out.println("Product ID: " + id + " deleted");
    	item.remove(id);
    }

    public void displayAll() {
    	System.out.println("Displaying all products");
        item.values().forEach(System.out::println);
    }

    public Product findProduct(int id) {
    	System.out.println("FindingProduct...");
        return item.get(id);
    }
}