package src;

public class StreetCar extends Car{

    private String model;
    private String color;
    private Integer horsePower;
    private Double price;

    public StreetCar(String model, String color, Integer horsePower, Double price){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

}
