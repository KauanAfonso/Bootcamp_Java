package Operadores.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa 1");
        int pessoa1 = scanner.nextInt();
        System.out.println("Digite a idade da pessoa 2");
        int pessoa2 = scanner.nextInt();
        System.out.printf("A diferença de idades é de: %s", pessoa1 - pessoa2);
    }
}
