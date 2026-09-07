
import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int i,f=0,g=0,sum=0,summ=0;
        System.out.println("ingresa un numero:");
        int n=tc.nextInt();
        int suma=0;
        for(i=0;i<=n;i++){
            suma=suma+i;
        }

       while(f<=n){
        sum=sum+f;
        f++;
        }
         
       do {
        summ=summ+g;
        g++;
       } while (g<=n);

       System.out.println("el resultado de la suma es :"+summ);
       System.out.println("el resultado de la suma es :"+sum);
       System.out.println("el resultado de la suma es :"+suma);
       tc.close();

    }

}