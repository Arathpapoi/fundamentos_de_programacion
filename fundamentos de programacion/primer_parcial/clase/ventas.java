
import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int v4,v1=0,v2=0,v3=0,ven3=0,ven2=0,ven1=0,monto,total;     
        System.out.println("hubo una venta s/n");
        String venta=tc.next();
        while (venta.equals("s")) { 
            System.out.println("ingresa el monto de la venta");
            monto=tc.nextInt();
            if (monto>=1000) {
                v1=v1+1;
                ven1=ven1+monto;
            }else if (monto<1000 && monto>=500) {
                v2=v2+1;
                ven2=ven2+monto;
            }else{
             v3=v3+1;
            ven3=ven3+monto;
            }
            System.out.println("hubo una venta s/n");
            venta=tc.next();
        }
        total=ven1+ven2+ven3;
        v4=v1+v2+v3;
        System.out.println("el numero de ventas mayores a 1000 son="+v1+" y el total es de:"+ven1);
        System.out.println("el numero de ventas menores a 1000 y mayores o iguales a 500 son="+v2+" y el total es de:"+ven2);
        System.out.println("el numero de ventas menores a 500 son="+v3+" y el total es de:"+ven3);
        System.out.println("el numero de ventas son="+v4+" y el total es de:"+total);
        tc.close();
    }
}
