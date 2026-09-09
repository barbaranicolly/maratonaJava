package vetores.entities;

import java.util.Scanner;

public class rentRoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("how many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[10];
        String[] email = new String[10];

        for (int i=0;i<n;i++){
            System.out.println("rent #" + (i + 1) + ":");

            System.out.println("name: ");
            String nomeTemp = sc.nextLine();

            System.out.println("email: ");
            String emailTemp = sc.nextLine();

            System.out.println("room: ");
            int room = sc.nextInt();
            sc.nextLine();

            nome[room] = nomeTemp;
            email[room] = emailTemp;
        }
        System.out.println("busy rooms: ");
        for (int i=0;i<10;i++){
            if (nome[i] != null){
                System.out.println(i + ": " + nome[i] + ", " + email[i]);
            }
        }


        sc.close();
    }
}
