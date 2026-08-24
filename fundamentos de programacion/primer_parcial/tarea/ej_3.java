
import java.util.Scanner;

public class ej_3 {
   public static void main(String[] args) {
       Scanner tc=new Scanner(System.in);
       int num,res;
       System.out.println("ingresa un numero");
       num=tc.nextInt();
       if(num==0){
        System.out.println("numero neutro");
        return;
       }
       res=num%2;
       if(res==0){
        System.out.println("el numero es par");
       }else{
        System.out.println("es impar");
       }
   } 
}
