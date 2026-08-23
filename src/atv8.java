import java.util.Scanner;
public class atv8 {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
sc.close();
    }
}
