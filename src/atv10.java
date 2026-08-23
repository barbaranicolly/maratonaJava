import java.util.Scanner;
public class atv10 {
    public static void main(String [] args){
    int inicial, fim, duracao;
        Scanner sc = new Scanner(System.in);
        inicial = sc.nextInt();
        fim = sc.nextInt();
        if (fim > inicial) {
            duracao = fim - inicial;
            System.out.println("o jogo durou " + duracao);
        } else if (fim < inicial) {
            duracao = 24 - inicial + fim;
            System.out.println("o jogo durou " + duracao);
        } else {
                duracao = 24;
        System.out.println("o jogo durou " + duracao); }


        sc.close();


    }
}
