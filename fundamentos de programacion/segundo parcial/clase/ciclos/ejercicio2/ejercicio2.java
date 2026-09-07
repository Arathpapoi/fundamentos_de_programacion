import java.util.Scanner;
public class ejercicio2{
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        int m,n;
        System.out.println("ingresa un numero (0 para finalizar):");
        n=tc.nextInt();
        while (n!=0) {
            for(int i=1;i<11;i++){
              m=n*i;
              System.out.println(n+"*"+i+"="+m);
            }
        System.out.println("ingresa un numero (0 para finalizar):");
        n=tc.nextInt();
        }
        System.out.println("se finalizo con exito");
        tc.close();

    }
}