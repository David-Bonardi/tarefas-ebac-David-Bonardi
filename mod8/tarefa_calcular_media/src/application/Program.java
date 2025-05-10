package application;

import entities.Media;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Media media;

        System.out.println("Digite 4 notas para saber a média: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        media = new Media(nota1, nota2, nota3, nota4);

        System.out.printf("A média entre as notas é: %.1f", media.calculaMedia());
    }
}
