package Operadores.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.printf("Seu nome é %s e voce tem %s anos", nome, idade);
    }
}
