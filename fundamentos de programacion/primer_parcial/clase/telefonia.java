import java.util.Scanner;

public class telefonia{
        public static void main(String[] args) {
            Scanner np=new Scanner(System.in);
System.out.println("cuanto duro la llamada:");
int min=np.nextInt();
double tarifa = 0;

if(min<=5){
 tarifa=min*1;
}else if (min<=8) {
   tarifa=5+((min-5)*0.7); 
}else if (min<=10) {
   tarifa=5+((min-8)*0.5); 
}

System.out.println("en que dia se realizo la llamada:");
System.out.println("escribe h para dia habil y d para domingo");
String llamada=np.next();
double total=0;
if (llamada.equals("h")) {
    System.out.println("en que horario se raelizo:");
    System.out.println("escribe m para matutino y v para vespertino");
    String horario=np.next();
    if (horario.equals("m")){
      total=tarifa+(tarifa*.15);
    }else if(horario.equals("v")){
         total=tarifa+(tarifa*.10);
    }else{
        System.out.println("no valida");
    }
}else if(llamada.equals("d")){
     total=tarifa+(tarifa*.03);
}else{
    System.out.println("no valida");
}
System.out.println("el total de la llamada es de:"+total);
np.close();
}
}
