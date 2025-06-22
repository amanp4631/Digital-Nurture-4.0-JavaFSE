public class Main {
    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();
        
        inventory.addProduct(new Product(101, "Munch", 300, 10.0));
        inventory.addProduct(new Product(102, "Perk", 250, 5.0));

        inventory.displayAll();

        inventory.updateProduct(101, 275, 5.0);
        inventory.deleteProduct(102);

        inventory.displayAll();
    }
}
