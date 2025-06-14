package src;

public class Demo {
    public static void main(String[] args) {
        carOutput();
    }

    private static void carOutput() {
        Car superCar = src.CarFactory.getCar(new SuperCarFactory("Bugatti", "Preto", 350, 350000d));
        Car streetCar = src.CarFactory.getCar(new StreetCarFactory("Honda Civic", "Cinza", 120, 95000d));
        System.out.println("Super Car  " + superCar);
        System.out.println("Street Car " + streetCar);
    }
}
