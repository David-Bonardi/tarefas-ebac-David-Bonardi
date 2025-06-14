package src;

public class SuperCarFactory implements CarAbstractFactory{

    private String model;
    private String color;
    private Integer horsePower;
    private Double price;


    public SuperCarFactory(String model, String color, Integer horsePower, Double price) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.price = price;
    }



    @Override
    public Car createCar() {
        return new SuperCar(model, color, horsePower, price);
    }

}
