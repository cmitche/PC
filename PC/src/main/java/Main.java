public class Main {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(2560, 1600);
        Monitor monitor = new Monitor(resolution,"Superior Image", "Asus");
        Motherboard motherboard = new Motherboard("B450 Max ATX", "Asus", 4, 2, "AMD");
        Dimensions dimensions = new Dimensions(12, 24, 12);
        Case pcCase = new Case("PC-o11", "Lian Li", "EVGA", dimensions);
        PC macbook = new PC(pcCase, monitor, motherboard);

        macbook.description();
        macbook.powerUp();
    }
}
