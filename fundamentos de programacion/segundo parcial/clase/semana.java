
import java.util.Scanner;

    public class semana{
        public static void main(String[] args) {
            Scanner tc=new Scanner(System.in);
            System.out.println("ingresa un numero del 1-7:");
            int s=tc.nextInt();
            switch (s) {
                case 1:
                    System.out.println("Lunes");
                    break;
                     case 2:
                    System.out.println("Martes");
                    break;
                     case 3:
                    System.out.println("Miercoles");
                    break;
                     case 4:
                    System.out.println("Jueves");
                    break;
                     case 5:
                    System.out.println("Viernes");
                    break;
                     case 6:
                    System.out.println("Sabado");
                    break;
                     case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("no existe");
                    break;
            }
            tc.close();
        }

    }