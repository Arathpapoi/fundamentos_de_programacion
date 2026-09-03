
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner niupi=new Scanner(System.in);
        double op=0;
        System.out.println("elige una opcion para calcular un area:");
        System.out.println("-ci para circulo");
        System.out.println("-cu para cuadrado");
        System.out.println("-t para triangulo");
        System.out.println("-r para rectangulo");
        String area=niupi.next();
        switch (area) {
            case "ci":
                System.out.println("circulo: Ingresa el radio");
                int r=niupi.nextInt();
                op=3.14*(Math.pow(r,2));
                break;
            case "cu":
                System.out.println("cuadrado: Ingresa el valor del lado");
                int l=niupi.nextInt();
                op=Math.pow(l, 2);
                break;
            case "r":
                System.out.println("rectangulot: Ingresa la base y altura");
                double b=niupi.nextInt();
                double a=niupi.nextInt();
                op=b*a;
                break;
                case "t":
                System.out.println("triangulo: Ingresa la base y altura");
                b=niupi.nextInt();
                a=niupi.nextInt();
                op=(b*a)/2;
                break;
            default:
                System.out.println("no existe");
                break;
        }
        System.out.println("el resultado de su operacion es:"+op);
        niupi.close();
    }
}
