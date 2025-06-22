
public class Searching {
	public Product linearSearch(Product[] products, int productId) {
        for (Product p : products) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }
	
	public Product binarySearch(Product[] products, int productId) {
		
		int mid = 0;
		int low = 0, high = products.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (products[mid].getProductId() == productId)
                return products[mid];

            if (products[mid].getProductId() < productId)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }
}
