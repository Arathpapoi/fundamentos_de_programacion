import java.util.Scanner;

public class banquete{
public static void main(String[] args) {
 Scanner np=new Scanner(System.in);
        System.out.println("ingresa el numero de personas");
        int per=np.nextInt();
        int costo;
        if(per<200){
         costo=per*95;
         System.out.println("el costo por cada platillo es de 95 y el costo total es:"+costo);
        }else if(per >= 200 && per<300){
             costo=per*85;
         System.out.println("el costo por cada platillo es de 85 y el costo total es:"+costo);
        }else if(per>=300){
          costo=per*75;
         System.out.println("el costo por cada platillo es de 75 y el costo total es:"+costo);
        }
        np.close();
}
}