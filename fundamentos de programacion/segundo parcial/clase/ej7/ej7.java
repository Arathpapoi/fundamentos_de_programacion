
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int precio=0,p=0;
        String t_chocolate="",palabra="",snack="",t_snack="";
        Scanner tc=new Scanner(System.in);
        System.out.println("que sabor de pastel desea:");
        System.out.println("-c para chocolate");
        System.out.println("-f para fresa");
        System.out.println("-m para manzana");
        String sabor=tc.next();

        if (sabor.equals("c")) {
        System.out.println("que tipo de chocolate desea:");
        System.out.println("-n para chocolate negro");
        System.out.println("-b para chocolate blanco"); 
        t_chocolate=tc.next();
        if (t_chocolate.equals("n")) {
            p=280;
        }else if (t_chocolate.equals("b")){
            p=300;
        }else{
            System.out.println("opcion erronea");
            return;
        }
        }

        switch (sabor) {
            case "f":
                precio=250;
                break;
            case "m":
                precio=200;
            break;
            case "c":
                precio=p;
             break;
            default:
             System.out.println("opcion no valida");
            return;
        }

        System.out.println("desea escribir en el pastel(s/n):");
        palabra=tc.next();
        if(palabra.equals("s")) {
            precio=precio+30;
        }else if (palabra.equals("n")){
            precio=precio+0;
        }else{
            System.out.println("opcion erronea");
            return;
        }

        
        System.out.println("desea agregar un snack al pastel(s/n):");
        snack=tc.next();
        while (snack.equals("s")) {
           System.out.println("elija un snack:");
           System.out.println("-f para fresa");
           System.out.println("-g para galleta");
           System.out.println("-d para durazno");
           t_snack=tc.next();
           switch (t_snack) {
                   case "f":
                   precio=precio+25;
                   break;
                   case "g":
                   precio=precio+25;
                   break;
                   case "d":
                   precio=precio+25;
                   break;
            default:
                System.out.println("opcion no valida");
            break;
            }
        System.out.println("desea agregar un snack al pastel(s/n):");
        snack=tc.next();
        }
        System.out.println("el total de su paste es:"+precio);
  
    }
}
