import java.util.Arrays;
import java.util.Scanner;

public class duplicado {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("¿Cuantos identificadores de transacciones deseas ingresar?");
        int n = tc.nextInt();

        int[] arregloOriginal = new int[n];
        System.out.println("Ingresa los identificadores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arregloOriginal[i] = tc.nextInt();
        }

        System.out.println("\nArreglo original: " + Arrays.toString(arregloOriginal));

        int[] copiaOrdenada = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        Arrays.sort(copiaOrdenada);

        int maxDuplicados = arregloOriginal.length;
        int[] duplicadosTemporales = new int[maxDuplicados];
        int contadorDuplicadosUnicos = 0;

        for (int i = 0; i < copiaOrdenada.length - 1; i++) {
            if (copiaOrdenada[i] == copiaOrdenada[i + 1]) {
                boolean yaRegistrado = false;
                for (int k = 0; k < contadorDuplicadosUnicos; k++) {
                    if (duplicadosTemporales[k] == copiaOrdenada[i]) {
                        yaRegistrado = true;
                        break;
                    }
                }
                if (!yaRegistrado) {
                    duplicadosTemporales[contadorDuplicadosUnicos] = copiaOrdenada[i];
                    contadorDuplicadosUnicos++;
                }
            }
        }

        int[] identificadoresDuplicados = Arrays.copyOf(duplicadosTemporales, contadorDuplicadosUnicos);

        int[] temporalDepurado = new int[arregloOriginal.length];
        int contadorDepurado = 0;

        for (int i = 0; i < arregloOriginal.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < contadorDepurado; j++) {
                if (arregloOriginal[i] == temporalDepurado[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                temporalDepurado[contadorDepurado] = arregloOriginal[i];
                contadorDepurado++;
            }
        }

        int[] arregloDepurado = Arrays.copyOf(temporalDepurado, contadorDepurado);

        int registrosEliminados = arregloOriginal.length - arregloDepurado.length;

        System.out.println("Arreglo depurado: " + Arrays.toString(arregloDepurado));
        System.out.println("Identificadores duplicados: " + Arrays.toString(identificadoresDuplicados));
        System.out.println("Registros eliminados: " + registrosEliminados);

        tc.close();
    }
}