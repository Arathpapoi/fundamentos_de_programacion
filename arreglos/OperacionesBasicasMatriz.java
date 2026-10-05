import java.util.Scanner;

public class OperacionesBasicasMatriz {

    public static void mostrar(int[][] matriz, int filas, int columnas) {
        System.out.println("\n--- MATRIZ ACTUAL ---");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int insertar(int[][] matriz, int n, int filas, int columnas, int valor) {
        int capacidadTotal = filas * columnas;
        if (n < capacidadTotal) {
            int f = n / columnas; 
            int c = n % columnas; 
            matriz[f][c] = valor;
            System.out.println("Elemento insertado en posición [" + f + "][" + c + "].");
            return n + 1;
        } else {
            System.out.println("La matriz está llena.");
            return n;
        }
    }

    public static boolean busquedaSecuencial(int[][] matriz, int n, int columnas, int valor) {
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            int f = i / columnas;
            int c = i % columnas;
            if (matriz[f][c] == valor) {
                System.out.println("-> El número " + valor + " está en la posición: [" + f + "][" + c + "]");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El número " + valor + " NO existe en la matriz.");
        }
        return encontrado;
    }

    public static void modificarPorValor(int[][] matriz, int n, int columnas, int valorViejo, int valorNuevo) {
        boolean modificado = false;
        for (int i = 0; i < n; i++) {
            int f = i / columnas;
            int c = i % columnas;
            if (matriz[f][c] == valorViejo) {
                matriz[f][c] = valorNuevo;
                System.out.println("Elemento " + valorViejo + " modificado por " + valorNuevo + " en [" + f + "][" + c + "].");
                modificado = true;
                break;
            }
        }
        if (!modificado) {
            System.out.println("El elemento " + valorViejo + " no se encontró.");
        }
    }

    public static int eliminarPorValor(int[][] matriz, int n, int columnas, int valor) {
        int posEliminar = -1;

        for (int i = 0; i < n; i++) {
            int f = i / columnas;
            int c = i % columnas;
            if (matriz[f][c] == valor) {
                posEliminar = i;
                break;
            }
        }

        if (posEliminar != -1) {
            for (int i = posEliminar; i < n - 1; i++) {
                int fActual = i / columnas;
                int cActual = i % columnas;

                int fSiguiente = (i + 1) / columnas;
                int cSiguiente = (i + 1) % columnas;

                matriz[fActual][cActual] = matriz[fSiguiente][cSiguiente];
            }

            int fUltima = (n - 1) / columnas;
            int cUltima = (n - 1) % columnas;
            matriz[fUltima][cUltima] = 0;

            System.out.println("Elemento " + valor + " eliminado con éxito.");
            return n - 1;
        } else {
            System.out.println("El elemento " + valor + " no existe en la matriz.");
            return n;
        }
    }

    public static void ordenarAscendente(int[][] matriz, int n, int columnas) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int f1 = j / columnas, c1 = j % columnas;
                int f2 = (j + 1) / columnas, c2 = (j + 1) % columnas;

                if (matriz[f1][c1] > matriz[f2][c2]) {
                    int aux = matriz[f1][c1];
                    matriz[f1][c1] = matriz[f2][c2];
                    matriz[f2][c2] = aux;
                }
            }
        }
        System.out.println("Matriz ordenada ascendentemente.");
    }

    public static void ordenarDescendente(int[][] matriz, int n, int columnas) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int f1 = j / columnas, c1 = j % columnas;
                int f2 = (j + 1) / columnas, c2 = (j + 1) % columnas;

                if (matriz[f1][c1] < matriz[f2][c2]) {
                    int aux = matriz[f1][c1];
                    matriz[f1][c1] = matriz[f2][c2];
                    matriz[f2][c2] = aux;
                }
            }
        }
        System.out.println("Matriz ordenada descendentemente.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese número de columnas de la matriz: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];
        int capacidadTotal = filas * columnas;
        int n = 0;
        int opcion = 0;

        System.out.println("\nIngresa los " + capacidadTotal + " elementos para llenar la matriz:");
        for (int i = 0; i < capacidadTotal; i++) {
            int f = i / columnas;
            int c = i % columnas;
            System.out.print("Elemento [" + f + "][" + c + "]: ");
            int elemento = sc.nextInt();
            n = insertar(matriz, n, filas, columnas, elemento);
        }

        do {
            System.out.println("\n--- MENÚ DE OPCIONES (MATRIZ) ---");
            System.out.println("1. Mostrar matriz");
            System.out.println("2. Insertar elemento");
            System.out.println("3. Modificar elemento (por valor)");
            System.out.println("4. Eliminar elemento (por valor)");
            System.out.println("5. Búsqueda Secuencial (por valor)");
            System.out.println("6. Ordenar Ascendente");
            System.out.println("7. Ordenar Descendente");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrar(matriz, filas, columnas);
                    break;

                case 2:
                    System.out.print("Ingrese valor a insertar: ");
                    int valIns = sc.nextInt();
                    n = insertar(matriz, n, filas, columnas, valIns);
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("La matriz está vacía.");
                    } else {
                        System.out.print("Ingrese el valor que desea buscar para modificar: ");
                        int valViejo = sc.nextInt();
                        System.out.print("Ingrese el nuevo valor: ");
                        int valNuevo = sc.nextInt();
                        modificarPorValor(matriz, n, columnas, valViejo, valNuevo);
                    }
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("La matriz está vacía.");
                    } else {
                        System.out.print("Ingrese el valor que desea eliminar: ");
                        int valEli = sc.nextInt();
                        n = eliminarPorValor(matriz, n, columnas, valEli);
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("La matriz está vacía.");
                    } else {
                        System.out.print("Ingrese valor a buscar: ");
                        int valBus = sc.nextInt();
                        busquedaSecuencial(matriz, n, columnas, valBus);
                    }
                    break;

                case 6:
                    if (n == 0) {
                        System.out.println("La matriz está vacía.");
                    } else {
                        ordenarAscendente(matriz, n, columnas);
                        mostrar(matriz, filas, columnas);
                    }
                    break;

                case 7:
                    if (n == 0) {
                        System.out.println("La matriz está vacía.");
                    } else {
                        ordenarDescendente(matriz, n, columnas);
                        mostrar(matriz, filas, columnas);
                    }
                    break;

                case 8:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);

        sc.close();
    }
}