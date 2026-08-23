import java.util.Scanner;
public class atv9 {
    public static void main(String[] args){
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("sao multiplos");
        } else {
            System.out.println("nao sao multiplos");
        }
     sc.close();
    }
}
