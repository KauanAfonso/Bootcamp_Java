package br.com.dio;

import java.util.Scanner;

public class Pessoa {

   String nome;
   String sobre_nome;
   int idade;

   public Pessoa(String nome, String sobre_nome, int idade){
       this.nome = nome;
       this.sobre_nome = sobre_nome;
       this.idade = idade;
   }

   public String getFullName(){
       return this.nome.concat(" ").concat(this.sobre_nome);
   }

}

