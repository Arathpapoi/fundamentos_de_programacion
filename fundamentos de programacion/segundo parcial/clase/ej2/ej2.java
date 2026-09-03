
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        System.out.println("ingresa dos numeros");
        double op=0;
        int n1=tc.nextInt();
        int n2=tc.nextInt();
        System.out.println("elige una operacion *,/,+,-:");
        String operacion =tc.next();
        switch (operacion) {
            case "*":
                System.out.println("multiplicacion:");
                op=n1*n2;
                break;
                case "/":
                System.out.println("division:");  
                op=n1/n2;
                break;
                case "+":
                System.out.println("suma:");
                op=n1+n2;
                break;
                case "-":
                System.out.println("resta:");
                op=n1-n2;
                break;
            default:
                System.out.println("no valido");
                break;
        }
        System.out.println("el resultado su operacion es:"+op);
        tc.close();
    }
}
