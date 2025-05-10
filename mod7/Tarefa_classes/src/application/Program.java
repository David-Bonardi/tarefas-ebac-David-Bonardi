package application;

import entities.Car;

import java.util.Scanner;

/**
 * @author David Bonardi
 */
public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car car = new Car();


        System.out.print("Digite o modelo do carro: ");

        car.setModelName(sc.nextLine());
        System.out.print("Digite o ano do modelo: ");
        car.setModelYear(sc.nextInt());
        /**
         * Pegando a resposta do usuário e retornando o método de acordo
         */
        System.out.println("O que deseja fazer? (F/A)");
        char response = sc.next().charAt(0);
        if(response == 'A'){
            System.out.println(car);
            System.out.println(car.acelerar());
        } else if(response == 'F'){
            System.out.println(car);
            System.out.println(car.frear());
        } else{
            System.out.println("Função inválida!");
        }
    }
}
