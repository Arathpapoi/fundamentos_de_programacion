import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner samu=new Scanner(System.in);
        System.out.println("Ingresa el numero de mes (1-12):");
        int mes=samu.nextInt();
        System.out.println("Ingrese el dia del mes de su nacimiento:");
        int dia=samu.nextInt();
        String signo="";
        switch (mes) {
            case 1:
                if (dia>0 && dia<=19) {
                    signo="Capricornio";
                }else if (dia>19 && dia<32) {
                    signo="Acuario";
                }else{
                    System.out.println("ese dia no existe");
                     return;
                }
            break;
            case 2:
                  if (dia>0 && dia<19) {
                    signo="Acuario";
                }else if (dia>18 && dia<29) {
                    signo="piscis";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }
            break;
            case 3:
                  if (dia>0 && dia<21) {
                    signo="piscis";
                }else if (dia>20 && dia<32) {
                    signo="Aries";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }  
            break;
            case 4:
                if (dia>0 && dia<20) {
                    signo="Aries";
                }else if (dia>19 && dia<31) {
                    signo="Tauro";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }
            break;
            case 5:
                  if (dia>0 && dia<22) {
                    signo="Tauro";
                }else if (dia>21 && dia<32) {
                    signo="Geminis";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }
            break;
            case 6:
                  if (dia>0 && dia<21) {
                    signo="Geminis";
                }else if (dia>20 && dia<31) {
                    signo="Cancer";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }  
            break;
            case 7:
                if (dia>0 && dia<23) {
                    signo="Cancer";
                }else if (dia>22 && dia<32) {
                    signo="Leo";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }
            break;
            case 8:
                  if (dia>0 && dia<23) {
                    signo="Leo";
                }else if (dia>22 && dia<32) {
                    signo="Virgo";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }
            break;
            case 9:
                  if (dia>0 && dia<23) {
                    signo="Virgo";
                }else if (dia>22 && dia<31) {
                    signo="Libra";
                }else{
                    System.out.println("ese dia no existe");
                     return;
                }  
            break;
            case 10:
                if (dia>0 && dia<23) {
                    signo="Libra";
                }else if (dia>22 && dia<32) {
                    signo="Escorpio";
                }else{
                    System.out.println("ese dia no existe");
                     return;
                }
            break;
            case 11:
                  if (dia>0 && dia<22) {
                    signo="Escorpio";
                }else if (dia>21 && dia<31) {
                    signo="Sagitario";
                }else{
                    System.out.println("ese dia no existe");
                     return;
                }
            break;
            case 12:
                  if (dia>0 && dia<22) {
                    signo="Sagitario";
                }else if (dia>21 && dia<32) {
                    signo="Capricornio";
                }else{
                    System.out.println("ese dia no existe");
                    return;
                }  
            break;
            default:
                System.out.println("opcion no valida");
            return;
        }
        System.out.println("su horoscopo es:"+signo);

    }
}
