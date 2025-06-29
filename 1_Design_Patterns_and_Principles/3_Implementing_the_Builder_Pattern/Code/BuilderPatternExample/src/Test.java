public class Test {
    public static void main(String[] args) {
        Computer basicLaptop = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("256GB SSD")
                .setGraphicsCard(false)
                .build();

        Computer gamingRig = new Computer.Builder()
                .setCpu("AMD Ryzen 9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .build();

        System.out.println(basicLaptop);
        System.out.println(gamingRig);
    }
}