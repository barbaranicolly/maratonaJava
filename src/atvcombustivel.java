import java.util.Scanner;
public class atvcombustivel {
    public static void main(String [] args){
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        while (codigo != 4) {
            if (codigo == 1) {
                alcool += 1;
            } else if (codigo == 2) {
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            } else {
                System.out.println("escolha outro numero");
            }
        codigo = sc.nextInt();
        } System.out.println("muito obrigado");
        System.out.println("alcool: " + alcool);
        System.out.println("gasolina: "+ gasolina);
        System.out.println("diesel: "+ diesel);
sc.close();
    }

}
