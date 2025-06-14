package src;

public abstract class Car {
    public abstract String getModel();
    public abstract String getColor();
    public abstract Integer getHorsePower();
    public abstract Double getPrice();

    @Override
    public String toString(){
        return "\nModelo: " + this.getModel() + "\nCor: " + this.getColor() + "\nCavalos: " + this.getHorsePower() + String.format("\nPreço: $%.2f", this.getPrice());
    }
}
