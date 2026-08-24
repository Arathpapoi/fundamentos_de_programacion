
import java.util.Scanner;

public class ej_5 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in); 
        double total=0;
        System.out.println("cual es peso de su paquete en kilos");
        double peso=tc.nextDouble();

        if(peso>5){
            System.out.println("paquete rechazado");
            return;
        }

        System.out.println("elige la zona a la que sera enviado el paquete:");
        System.out.println("-escribe 1 para america del norte");
        System.out.println("-escribe 2 para america central");
        System.out.println("-escribe 3 para america del sur");
        System.out.println("-escribe 4 para europa");
        System.out.println("-escribe 5 para asia");
        int zona=tc.nextInt();

        switch (zona) {
            case 1:
                System.out.println("su paquete sera enviado a america del norte");
                total=(peso*1000)*11;
                break;
            case 2:
               System.out.println("su paquete sera enviado a america central");
                total=(peso*1000)*10;  
                break;
            case 3:
                 System.out.println("su paquete sera enviado a america del sur");
                total=(peso*1000)*12;
                break;
            case 4:
                 System.out.println("su paquete sera enviado a europa");
                total=(peso*1000)*25;
                break;
            case 5:
                 System.out.println("su paquete sera enviado a asia");
                total=(peso*1000)*30;
                break;       
            default:
                System.out.println("opcion invalida");
                return;
        }
        System.out.println("el total por el envio es de:"+total);
        tc.close();
    }
}
