
import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        System.out.println("cual es la edad del postulante:");
        int edad=tc.nextInt();
         System.out.println("cual es tu promedio:");
        double prom=tc.nextDouble();
        if (edad>18) {
         if (prom>=9 && prom<=10) {
            System.out.println("su beca es de 10000");
        }else if (prom>=7.5 && prom<9) {
            System.out.println("su beca es de 8000");
        }else if (prom>=6 && prom<7.5) {
            System.out.println("su beca es de 5000");
        }else if (prom>0 && prom<6) {
            System.out.println("necesitas mejorar tu promedio");
        }else{
            System.out.println("promedio no valido");
        }
        }else{
            if (prom>=9 && prom<=10) {
            System.out.println("su beca es de 8000");
        }else if (prom>=8 && prom<9) {
            System.out.println("su beca es de 6000");
        }else if (prom>=6 && prom<8) {
            System.out.println("su beca es de 4000");
        }else if (prom>0 && prom<6) {
            System.out.println("necesitas mejorar tu promedio");
        }else{
            System.out.println("promedio no valido");
        }
        }
      tc.close();
    }
}
