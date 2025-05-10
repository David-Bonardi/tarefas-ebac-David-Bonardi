package application;

import entities.Media;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author David Bonardi
 */
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as 4 notas para saber se está aprovado ou não: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();

        Media media = new Media(nota1, nota2, nota3, nota4);

        double resultado = media.calculaMedia();

        if(resultado >= 7){
            System.out.println("Você está APROVADO!");
            System.out.printf("Sua média foi: %.1f", resultado);
        } else if(resultado >= 5){
            System.out.println("Você está de RECUPERAÇÃO!");
            System.out.printf("Sua média foi: %.1f", resultado);
        } else{
            System.out.println("Você está REPROVADO!");
            System.out.printf("Sua média foi: %.1f", resultado);
        }

    }
}
