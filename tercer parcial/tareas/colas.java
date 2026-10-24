import java.util.Scanner;

public class colas {
     public static void mostrar(int []arreglo, int n){
        if (n == 0 || n == -1) {
            System.out.println("La cola está vacía");
        } else {
            System.out.print("Arreglo: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }

    public static int push(int dato, int n, int []arreglo){
        if (n < arreglo.length) {
           arreglo[n] = dato;
           System.out.println("elemento insertado");  
           return n + 1;
        } else {
            System.out.println("cola llena, error de desbordamientp");
            return n;
        }
    }

    public static int pop_colas(int n, int []arreglo, int correcto, int elemento, int existe, int correcto2){
        int idx = -1;
        
        for(int i = 0; i < n; i++){
            if (arreglo[i] == elemento) {
                idx = i;
                break;
            }
        }
        
        if (idx != -1) {
            int nuevosElementos = n - (idx + 1);
            
            for (int i = 0; i < nuevosElementos; i++) {
                arreglo[i] = arreglo[idx + 1 + i];
            }
            
            n = nuevosElementos;
            System.out.println("Elemento y sus precedentes extraídos de la cola.");
        } else {
            System.out.println("el elemento no existe dentro del arreglo");
        }
        
        return n;
    }

    public static int eliminar_primero(int n, int []arreglo) {
        if (n == 0 || n == -1) {
            System.out.println("La cola está vacía, no hay elementos para eliminar.");
        } else {
            for (int i = 0; i < n - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            n = n - 1;
            System.out.println("Primer elemento eliminado con éxito.");
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner te = new Scanner(System.in);
        int existe = 0;
        int correcto = 0;
        int correcto2 = 0;
        int op = 0;
        int n = 0;
        int da = 0;
        
        System.out.println("Cual es tamaño maximo que desea para el arreglo:");
        int tam = te.nextInt();
        int []pilas = new int[tam];
       
        int ele;
        do {
            System.out.println("cuantos elementos desea insertar de 1 a " + tam);
            ele = te.nextInt();
            if (ele > tam || ele < 1) {
                System.out.println("Error: Cantidad no válida. Intenta de nuevo.");
            }
        } while (ele > tam || ele < 1);

        System.out.println("Ingresa los " + ele + " elementos:");
        for (int i = 1; i <= ele; i++) {
            da = te.nextInt();
            n = push(da, n, pilas);
        }
       
        do{
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Mostrar");
            System.out.println("2. Push");
            System.out.println("3. Eliminación por elemento y precedentes (colas)");
            System.out.println("4. Eliminar solo el primer elemento");
            System.out.println("5. Salir");
            System.out.println("¿Qué operación desea realizar?");
            op = te.nextInt();
           
            switch (op) {
                case 1:
                    mostrar(pilas, n);
                    break;
                case 2:
                    System.out.println("inserte un elemento");
                    da = te.nextInt();
                    n = push(da, n, pilas);
                    break;
                case 3:
                    if (n == 0 || n == -1) {
                        System.out.println("cola vacia, error UNDERFLOW");
                    } else {
                        System.out.println("que elemento desea Eliminar");
                        mostrar(pilas, n);
                        int eli = te.nextInt();
                        existe = 0;
                        n = pop_colas(n, pilas, correcto, eli, existe, correcto2);
                    }
                    break;
                case 4:
                    n = eliminar_primero(n, pilas);
                    break;
                case 5:
                    System.out.println("Adios, vuelve pronto");
                    break;
                default:
                    System.out.println("opcion no valida, seleccione otra opcion");
                    break;
            }
        } while(op != 5);
       
        te.close();
    }
}
