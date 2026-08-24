
import java.util.Scanner;

public class ahorros {
    public static void main(String[] args) {
       Scanner tc=new Scanner(System.in);
        int i,cantidad,ahorro=0;
        for(i=1;i<=12;i++){
        System.out.println("cuanto desea ahorrar:");
        cantidad=tc.nextInt();
        ahorro=ahorro+cantidad;
        System.out.println("la cantidad ahorrada en el mes "+i+" es de "+ahorro);
        }
        System.out.println("la cantidad ahorrada en todo el año es de: "+ahorro);
      tc.close();
    }
}
