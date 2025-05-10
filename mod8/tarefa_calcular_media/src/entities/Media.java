package entities;

public class Media {
    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public Media(double nota1, double nota2, double nota3, double nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calculaMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
