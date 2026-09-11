package aplication;

import entities.funcionarios;
import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

public class funcionariosPrograma {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<funcionarios> lista = new ArrayList<>();


        System.out.println("how many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("employee #" + (i + 1));

            System.out.println("id: ");
            int id = sc.nextInt();
            boolean idRepetido = false;
                for (int j=0;j< lista.size();j++){
                    if (id == lista.get(j).id) {
                        System.out.println("id existente");
                    }
                }
            System.out.println("name: ");
            String nome = sc.nextLine();
            sc.next();

            System.out.println("salary: ");
            double salario = sc.nextDouble();

            funcionarios funcionario = new funcionarios(id, nome, salario);
            lista.add(funcionario);
        }
        System.out.println("enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        System.out.println("enter the percentage: ");
        double porcentagem = sc.nextDouble();

    }
}
