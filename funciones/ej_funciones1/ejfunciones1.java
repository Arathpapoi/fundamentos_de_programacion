import java.util.Scanner;

public class ejfunciones1 {
     public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        System.out.println("el valor del vehiculo:");
        double valorVehiulo=tc.nextDouble();
        System.out.println("ingresa tu edad");
        int edad=tc.nextInt();
        System.out.println("cuantos accidentes tuvo durante el ultimo año:");
        int accidentes=tc.nextInt();
        System.out.println("¿tiene seguro?");
        String respuesta=tc.next();
        boolean seguro=respuesta.equalsIgnoreCase("s");
        if (edad <18 || edad>100) {
            System.out.println("edad invalida");
            return;
        }
        if (valorVehiulo<1) {
         System.out.println("valor del auto no valido");
         return;
        }
        if (accidentes<0) {
         System.out.println("valor de accidentes invalido");
         return;
        }
       double tarifa= calcularTarifaBase(valorVehiulo);
       double r_edad=calcularRecargoPorEdad(tarifa, edad);
       double  t_ac=calcularRecargoPorAccidentes(tarifa, accidentes);
       double sub=tarifa+r_edad+t_ac;
       double descuento=calcularDescuentoSeguridad(sub,seguro);
       double total=calcularCostoFinal(tarifa, r_edad, t_ac, descuento);
       System.out.println("el costo por su seguro es de: "+total);
       tc.close();
    }


    static double calcularTarifaBase(double valorVehiculo){
    return (valorVehiculo*0.04);
    }

   static double calcularRecargoPorEdad(double tarifaBase, int edad){
      if (edad>17 && edad <25 ) {
          return tarifaBase*.20; 
      }else if (edad >60) {
           return tarifaBase*.10; 
      }else{
      return 0; 
      }
     
   }

   static double calcularRecargoPorAccidentes(double tarifaBase, int accidentes){
      return accidentes*(tarifaBase*0.08);
   }

   static double calcularDescuentoSeguridad(double subtotal, boolean tieneSeguridad){
      if (tieneSeguridad) {
      return subtotal*.05;
      }else{
      return 0;
      }
      
   }

   static double calcularCostoFinal(double tarifaBase, double recargoEdad,double recargoAccidentes, double descuento){
      return (tarifaBase+recargoEdad+recargoAccidentes)-descuento;
   }

}