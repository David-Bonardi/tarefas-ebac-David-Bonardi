package src;

public class StreetCarFactory implements CarAbstractFactory{

    private String model;
    private String color;
    private Integer horsePower;
    private Double price;
    
    public StreetCarFactory(String model, String color, Integer horsePower, Double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.price = price;
    }

    @Override
    public Car createCar() {
        return new StreetCar(model, color, horsePower, price);
    }

}
