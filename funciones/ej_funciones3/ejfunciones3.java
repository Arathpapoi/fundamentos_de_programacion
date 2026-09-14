import java.util.Scanner;

public class ejfunciones3 {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);

        System.out.println("lectura anterior:");
        double lecturaAnterior = tc.nextDouble();

        System.out.println("lectura actual:");
        double lecturaActual = tc.nextDouble();

        System.out.println("¿tiene programa de apoyo? (s/n):");
        String respuesta = tc.next();
        boolean tieneApoyo = respuesta.equalsIgnoreCase("s");

        if (lecturaAnterior < 0 || lecturaActual < 0) {
            System.out.println("las lecturas no pueden ser negativas");
            return;
        }

        if (lecturaActual < lecturaAnterior) {
            System.out.println("lectura actual debe ser mayor o igual a la anterior");
            return;
        }

        double consumo = calcularConsumo(lecturaAnterior, lecturaActual);

        if (consumo > 10000) {
            System.out.println("consumo maximo excedido");
            return;
        }

        double cargoFijo = 95.0;
        double costoConsumo = calcularCostoConsumo(consumo);
        double costoAntesImpuesto = costoConsumo + cargoFijo;

        double descuento = calcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo);
        double baseImponible = costoAntesImpuesto - descuento;
        double impuesto = calcularImpuesto(baseImponible);

        double total = calcularTotal(costoConsumo, cargoFijo, descuento, impuesto);

        mostrarRecibo(consumo, costoConsumo, descuento, impuesto, total);

        tc.close();
    }

    static double calcularConsumo(double lecturaAnterior, double lecturaActual) {
        return lecturaActual - lecturaAnterior;
    }

    static double calcularCostoConsumo(double consumo) {
        double costo = 0;

        if (consumo <= 150) {
            costo = consumo * 1.20;
        } else if (consumo <= 400) {
            costo = (150 * 1.20) + ((consumo - 150) * 1.80);
        } else {
            costo = (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75);
        }

        return costo;
    }

    static double calcularDescuentoApoyo(double consumo, double costoAntesImpuesto, boolean tieneApoyo) {
        if (tieneApoyo && consumo <= 250) {
            return costoAntesImpuesto * 0.30;
        } else {
            return 0;
        }
    }

    static double calcularImpuesto(double baseImponible) {
        return baseImponible * 0.16;
    }

    static double calcularTotal(double costoConsumo, double cargoFijo, double descuento, double impuesto) {
        return (costoConsumo + cargoFijo) - descuento + impuesto;
    }

    static void mostrarRecibo(double consumo, double costoConsumo, double descuento, double impuesto, double total) {
        System.out.println("consumo registrado: " + consumo + " kWh");
        System.out.println("costo por consumo: $" + costoConsumo);
        System.out.println("descuento: $" + descuento);
        System.out.println("impuesto: $" + impuesto);
        System.out.println("el total a pagar es: $" + total);
    }
}