import java.util.Scanner;

public class ej_1{
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int precio,tamano,kilos,p_k=0;
        double perdida=0,ganancia=0,total=0;
        System.out.println("cual es precio por kilo");
        precio=tc.nextInt();
        System.out.println("cuantos kilos va a vender:");
        kilos=tc.nextInt();
        System.out.println("cual es el tipo de la uva (a/b):");
        String tipo=tc.next();
        System.out.println("cual es el tamaño de la uva (1/2):");
        tamano=tc.nextInt();

        if (tipo.equals("a") && tamano==1) {
            p_k=(precio*kilos);
            ganancia=(kilos*.2);
            total=p_k+ganancia;          
        } else if (tipo.equals("a") && tamano==2) {
           p_k=(precio*kilos);
            ganancia=(kilos*.3);
            total=p_k+ganancia; 
        }else if (tipo.equals("b") && tamano==1) {
           p_k=(precio*kilos);
            perdida=(kilos*.3);
            total=p_k-perdida; 
        }else if (tipo.equals("b") && tamano==2) {
           p_k=(precio*kilos);
            perdida=(kilos*.5);
            total=p_k-perdida; 
        }else{
            System.out.println("opcion invalida");
        }
        System.out.println("total por kilo:"+p_k);
        System.out.println("la ganancia es de:"+ganancia);
        System.out.println("la perdida es de:"+perdida);
        System.out.println("el total es de:"+total);

       tc.close();
    }
}