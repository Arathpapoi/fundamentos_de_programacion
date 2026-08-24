
import java.util.Scanner;

public class ej_4 {
   public static void main(String[] args) {
    Scanner tc=new Scanner(System.in);
      int citas,pagacita=0,pagatotal=0;
      System.out.println("cuantas citas lleva hsata el momento:");
      citas=tc.nextInt();
      if(citas>=1 && citas<=3){
         pagacita=900;
        pagatotal=pagacita*citas; 
      }else if (citas>=4 && citas<=5) {
        pagacita=800;
        pagatotal=2700+(pagacita*(citas-3));
      }else if (citas>=6 && citas<=8){
        pagacita=600;
        pagatotal=4300+(pagacita*(citas-5));
      }else if (citas>8){
        pagacita=500;
        pagatotal=6100+(pagacita*(citas-8));
      }
      System.out.println("el costo de la cita es de:"+pagacita);
    System.out.println("el total pagado durante el tratamiento es de:"+pagatotal);
     tc.close(); 
   } 
}
