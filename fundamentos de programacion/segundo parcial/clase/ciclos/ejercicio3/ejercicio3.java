
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        String in="";
        System.out.println("ingresa un numero:");
        int n=tc.nextInt();
        for (int i = 1; i<=n; i++) {
               in=in+i+" ";
                System.out.println(in);
        }
        tc.close();
    }
}
