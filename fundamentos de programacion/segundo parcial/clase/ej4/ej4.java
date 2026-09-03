
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner samu=new Scanner(System.in);
        System.out.println("Introduce una hora (1-24)");
        int hora=samu.nextInt();
        int saludo;
        if (hora>=6 && hora<=12) {
            saludo=1;
        }else if (hora>=13 && hora<=20) {
            saludo=2;
        }else if (hora<=0 || hora>24 ) {
            System.out.println("fuera de horario");
            return;
        }else{
            saludo=3;
        }

        switch (saludo) {
            case 1:System.out.println("buenos dias");   
            break;
            case 2:System.out.println("buenas tardes");   
            break;
            case 3:System.out.println("buenas noches");   
            break;
        }
        samu.close();
    }
}
