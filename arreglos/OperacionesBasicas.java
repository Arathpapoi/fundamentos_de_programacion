import java.util.Scanner;

public class OperacionesBasicas {

    public static void mostrar(int[] arreglo, int n) {
        if (n == 0) {
            System.out.println("El arreglo esta vacio.");
        } else {
            System.out.print("Arreglo: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }
    }

    public static int insertar(int[] arreglo, int n, int valor) {
        if (n < arreglo.length) {
            arreglo[n] = valor;
            System.out.println("Elemento insertado.");
            return n + 1;
        } else {
            System.out.println("El arreglo esta lleno.");
            return n;
        }
    }

    public static void modificar(int[] arreglo, int n, int indice, int nuevoValor) {
        if (indice >= 0 && indice < n) {
            arreglo[indice] = nuevoValor;
            System.out.println("Elemento modificado.");
        } else {
            System.out.println("Indice no valido.");
        }
    }

    public static int eliminar(int[] arreglo, int n, int indice) {
        if (indice >= 0 && indice < n) {
            for (int i = indice; i < n - 1; i++) {
                arreglo[i] = arreglo[i + 1];
            }
            System.out.println("Elemento eliminado.");
            return n - 1;
        } else {
            System.out.println("Indice no valido.");
            return n;
        }
    }

    public static void busquedaSecuencial(int[] arreglo, int n, int valor) {
        int posicion = -1;

        for (int i = 0; i < n; i++) {
            if (arreglo[i] == valor) {
                posicion = i;
                break; 
            }
        }

        if (posicion != -1) {
            System.out.println("El numero " + valor + " existe y esta en la posicion (indice): " + posicion);
        } else {
            System.out.println("El numero " + valor + " NO existe en el arreglo.");
        }
    }

    public static void ordenarAscendente(int[] arreglo, int n) {
        if (n == 0) {
            System.out.println("El arreglo esta vacio.");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo ordenado ascendentemente:");
        mostrar(arreglo, n);
    }

    public static void ordenarDescendente(int[] arreglo, int n) {
        if (n == 0) {
            System.out.println("El arreglo esta vacio.");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo ordenado descendentemente:");
        mostrar(arreglo, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        int n = 0;
        int opcion = 0;
        System.out.println("¿Cuamtos datos desea ingresar?");
        int datoss=sc.nextInt();
        for(int c=1;c<=datoss;c++){
            int elemento = sc.nextInt();
            n = insertar(arreglo, n, elemento);
        }

        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Mostrar arreglo");
            System.out.println("2. Insertar elemento");
            System.out.println("3. Modificar elemento");
            System.out.println("4. Eliminar elemento");
            System.out.println("5. Busqueda Secuencial");
            System.out.println("6. Ordenar Ascendente");
            System.out.println("7. Ordenar Descendente");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrar(arreglo, n);
                    break;

                case 2:
                    System.out.print("Ingrese valor a insertar: ");
                    int valIns = sc.nextInt();
                    n = insertar(arreglo, n, valIns);
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("El arreglo esta vacio.");
                    } else {
                        System.out.print("Ingrese posicion a modificar (0 a " + (n - 1) + "): ");
                        int posMod = sc.nextInt();
                        System.out.print("Ingrese nuevo valor: ");
                        int valMod = sc.nextInt();
                        modificar(arreglo, n, posMod, valMod);
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("El arreglo esta vacio.");
                    } else {
                        System.out.print("Ingrese posicion a eliminar (0 a " + (n - 1) + "): ");
                        int posEli = sc.nextInt();
                        n = eliminar(arreglo, n, posEli);
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("El arreglo esta vacio.");
                    } else {
                        System.out.print("Ingrese valor a buscar: ");
                        int valBus = sc.nextInt();
                        busquedaSecuencial(arreglo, n, valBus);
                    }
                    break;

                case 6:
                    ordenarAscendente(arreglo, n);
                    break;

                case 7:
                    ordenarDescendente(arreglo, n);
                    break;

                case 8:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 8);

        sc.close();
    }
}