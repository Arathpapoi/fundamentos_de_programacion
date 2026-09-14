import java.util.Scanner;

public class ejfunciones2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("precio producto 1:");
        double p1 = tc.nextDouble();
        System.out.println("cantidad producto 1:");
        int c1 = tc.nextInt();

        System.out.println("precio producto 2:");
        double p2 = tc.nextDouble();
        System.out.println("cantidad producto 2:");
        int c2 = tc.nextInt();

        System.out.println("precio producto 3:");
        double p3 = tc.nextDouble();
        System.out.println("cantidad producto 3:");
        int c3 = tc.nextInt();

        System.out.println("tipo de cliente (1: regular, 2: frecuente):");
        int tipoCliente = tc.nextInt();

        System.out.println("codigo postal:");
        String codigoPostal = tc.next();

        if (p1 < 1 || p2 < 1 || p3 < 1) {
            System.out.println("precio invalido");
            return;
        }
        if (c1 < 1 || c2 < 1 || c3 < 1) {
            System.out.println("cantidad invalida");
            return;
        }
        if (tipoCliente != 1 && tipoCliente != 2) {
            System.out.println("tipo de cliente invalido");
            return;
        }
        if (codigoPostal.length() != 5) {
            System.out.println("codigo postal invalido");
            return;
        }

        double sub1 = calcularSubtotalProducto(p1, c1);
        double sub2 = calcularSubtotalProducto(p2, c2);
        double sub3 = calcularSubtotalProducto(p3, c3);

        double subGeneral = calcularSubtotalGeneral(sub1, sub2, sub3);
        double descuento = calcularDescuento(subGeneral, tipoCliente);
        double envio = calcularEnvio(subGeneral, codigoPostal);
        
        double subtotalConDescuento = subGeneral - descuento;
        double impuesto = calcularImpuesto(subtotalConDescuento);

        double total = calcularTotal(subGeneral, descuento, impuesto, envio);

        System.out.println("el total a pagar es: " + total);
        tc.close();
    }

    static double calcularSubtotalProducto(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularSubtotalGeneral(double subtotal1, double subtotal2, double subtotal3) {
        return subtotal1 + subtotal2 + subtotal3;
    }

    static double calcularDescuento(double subtotal, int tipoCliente) {
        if (tipoCliente == 2) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }

    static double calcularEnvio(double subtotal, String codigoPostal) {
        if (subtotal < 1000) {
            return 150;
        } else if (subtotal >= 1000 && subtotal < 3000) {
            return 80;
        } else {
            return 0;
        }
    }

    static double calcularImpuesto(double subtotalConDescuento) {
        return subtotalConDescuento * 0.16;
    }

    static double calcularTotal(double subtotal, double descuento, double impuesto, double envio) {
        return subtotal - descuento + impuesto + envio;
    }
}