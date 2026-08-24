import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("¿Cuantas horas estuvo el cliente?");
        int horas = tc.nextInt();

        double total = 0;

        if (horas <= 2) {
            total = horas * 30;
        } 
        else if (horas <= 5) {
            total = (2 * 30) + ((horas - 2) * 25);
        } 
        else if (horas <= 10) {
            total = (2 * 30) + (3 * 25) + ((horas - 5) * 20);
        } 
        else {
            int dias = horas / 24;
            int restantes = horas % 24;

            total = dias * 380;

            if (restantes > 0 && restantes <= 2) {
                total = total + (restantes * 30);
            } 
            else if (restantes <= 5) {
                total = total + (2 * 30) + ((restantes - 2) * 25);
            } 
            else if (restantes <= 10) {
                total = total + (2 * 30) + (3 * 25) + ((restantes - 5) * 20);
            } 
            else {
                total = total + 380;
            }
        }

        System.out.println("El total a pagar es: $" + total);
    }
}