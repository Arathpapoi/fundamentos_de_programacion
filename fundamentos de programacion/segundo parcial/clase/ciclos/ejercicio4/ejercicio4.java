import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String in = "", in2 = "", in3 = "";
        int f = 1;

        System.out.println("Ingresa el numero de lineas que desea para su patron:");
        int n = tc.nextInt();

        // PRIMER PATRÓN
        for (int i = 1; i <= n; i++) {
            while (f <= n) {
                in = in + "*";
                f++;
            }
            System.out.println(in);
        }

        // SEGUNDO PATRÓN
        for (int j = 1; j <= n; j++) {

            String espacios = "";

            for (int i = 0; i < n - j + 1; i++) {
                espacios = espacios + " ";
            }

            if (j == 1) {
                in2 = in2 + "*";
            } else {
                in2 = in2 + "**";
            }

            System.out.println(espacios + in2);
        }
        System.out.println();
        for (int j = 1; j <= n; j++) {

            String espacios = "";
            in3 = "";

            for (int i = 0; i < j - 1; i++) {
                espacios = espacios + " ";
            }

            for (int i = 0; i < 2 * (n - j) + 1; i++) {
                in3 = in3 + "*";
            }

            System.out.println(espacios + in3);
        }

        tc.close();
    }
}