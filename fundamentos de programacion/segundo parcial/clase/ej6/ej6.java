
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        String membresia,promo;
        int dia,n_personas;
        double boleto=0,total=0,par=0,truc=0;
        System.out.println("Ingrese el dia de la semana (1-7):");
        dia=tc.nextInt();
        System.out.println("Ingrese el numero de boletos a comprar:");
        n_personas=tc.nextInt();

        if (dia!=3) {
         boleto=50;
        }else{
         boleto=30;
        }

        System.out.println("Usted cuenta con membresia (s/n):");
        promo=tc.next();
        if (promo.equals("s")) {
            boleto=boleto*.9;
        }
        
       
                switch (dia) {
                    case 1:
                    total=n_personas*boleto;
                    break;
                     case 2:
                     total=n_personas*boleto;
                    break;
                     case 3:
                    total=n_personas*boleto;
                    break;
                     case 4:
                    if (promo.equals("s")) {
                      truc=(n_personas%2)*boleto;
                      par=(((n_personas-(n_personas%2))/2)*75)*.9;
                      total=truc+par;
                    }else if (promo.equals("n")) {
                       truc=(n_personas%2)*boleto;
                      par=((n_personas-(n_personas%2))/2)*75;
                      total=truc+par;  
                    }else{
                        System.out.println("no valido");
                        return;
                    }                      
                    break;
                     case 5:
                    total=n_personas*boleto;
                    break;
                     case 6:
                    total=n_personas*boleto;
                    break;
                     case 7:
                    total=n_personas*boleto;
                    break;
                default:
                    System.out.println("no existe");
                    break;
            }
            System.out.println("total es:"+total);
        tc.close();
    }
}
