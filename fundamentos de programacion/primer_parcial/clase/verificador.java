
import java.util.Scanner;

public class verificador {
    public static void main(String[] args) {
        Scanner np=new Scanner(System.in);
         int n1,n2,n3;
     System.out.println("ingresa 3 cantidades:");
     n1=np.nextInt();
     n2=np.nextInt();
     n3=np.nextInt();
     if(n1>=n2 && n1>=n3){
        System.out.println("el mayor es:"+n1);
     }else if(n2>=n1 && n2>=n3){
        System.out.println("el mayor es:"+n2);
     }else{
         System.out.println("el mayor es:"+n3);
     }
     np.close();

     if (n1==n3 && n1==n2) {
         System.out.println("Los tres son iguales");
         return;
     }if (n1==n2  || n1==n3 || n3==n2) {
         System.out.println("dos numeros son iguales");
     }else{
        System.out.println("ninguno es igual");
     }
    
    }
}
