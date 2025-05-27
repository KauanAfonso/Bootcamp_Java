package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //USANDO POO
        Pessoa pessoa = new Pessoa("Kauan", "AFonso", 18);
        String nome_completo = pessoa.getFullName();
        System.out.println(nome_completo);

        //ESTRUTURADO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("Olá %s sua idade é %s \n", nome, idade);
    }
}
