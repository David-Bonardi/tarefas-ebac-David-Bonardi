package entities;

/**
 * @author David bonardi
 */

public class Car {
    private String modelName;
    private int modelYear;


    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    /**
     *
     * @return retorna a função de acelerar e frear
     */
    public String acelerar(){
        return "Acelerando...";
    }

    public String frear(){
        return "Freando...";
    }

    /**
     *
     * @return retorna o toString da classe Car
     */
    public String toString(){
        return "Nome do modelo: "
                + modelName
                + ", Ano do modelo: "
                + modelYear;
    }
}
