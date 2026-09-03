package aplication;

import entities.Paciente;

import java.util.Locale;
import java.util.Scanner;

public class PacientePrograma {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("nome: ");
        String nome = sc.nextLine();

        System.out.print("idade: ");
        int idade = sc.nextInt();

        System.out.print("peso: ");
        double peso = sc.nextDouble();

        Paciente pac = new Paciente(nome, idade, peso);

        System.out.print("nova idade: ");
        int NovaIdade = sc.nextInt();
        pac.setIdade(NovaIdade);

        System.out.print("Novo peso: ");
        double NovoPeso = sc.nextDouble();
        pac.setPeso(NovoPeso);
        System.out.println("dados atualizados: ");
        System.out.println("nome: " + pac.getNome() + ", idade: " + pac.getIdade() + ", peso: " + pac.getPeso());
        sc.close();
    }
}
