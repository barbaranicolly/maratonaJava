package aplication;

import entities.Livros;

import java.util.Locale;
import java.util.Scanner;

public class LivrosPrograma {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o titulo do livro? ");
        String nome = sc.nextLine();

        System.out.println("qual o autor do livro? ");
        String autor = sc.nextLine();

        System.out.println("qual o preço do livro? ");
        double preco = sc.nextDouble();

        Livros livro = new Livros(nome, autor, preco);

        System.out.println();
        sc.nextLine();

        System.out.println("deseja alterar o preço do livro? [y/n]: ");
        String resp = sc.nextLine();

        if (resp.equals("y")){
            System.out.println("digite o novo valor do livro: ");
            double novoPreco = sc.nextDouble();
            livro.setPreco(novoPreco);
        }
        System.out.println("dados atualizados: ");
        System.out.printf("nome do livro: " + livro.getNome()
                + " nome do autor: " + livro.getAutor() + " preço: %.2f" , livro.getPreco());

        sc.close();

    }
}
