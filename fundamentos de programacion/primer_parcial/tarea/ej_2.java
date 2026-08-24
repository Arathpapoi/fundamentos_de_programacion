
import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int vel,lim1=0,lim2=0,multa;
        System.out.println("es su cumpleaños (s/n):");
        String cumple=tc.next();
        System.out.println("cual es su velocida:");
        vel=tc.nextInt();
        if (cumple.equals("s")) {
            lim1=66;
            lim2=86;
        }else if (cumple.equals("n")) {
            lim1=61;
            lim2=81;
        }else{
            System.out.println("opcion no valida");

        }
        
        if (vel<lim1) {
           multa=0;
           System.out.println("sin multa");  
        }else if (vel>=lim1 && vel<lim2) {
            multa=1;
            System.out.println("multa pequeña");  
        }else{
           multa=2;
           System.out.println("multa grande");    
        }
        System.out.println("valor codificado:"+multa);
       tc.close();
    }
}
