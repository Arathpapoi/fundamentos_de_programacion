Algoritmo ejfunciones2
	Definir p1, p2, p3, sub1, sub2, sub3, subGeneral, descuento, envio, subtotalConDescuento, impuesto, total Como Real;
	Definir c1, c2, c3, tipoCliente Como Entero;
	Definir codigoPostal Como Cadena;
	
	Escribir "precio producto 1:";
	Leer p1;
	Escribir "cantidad producto 1:";
	Leer c1;
	
	Escribir "precio producto 2:";
	Leer p2;
	Escribir "cantidad producto 2:";
	Leer c2;
	
	Escribir "precio producto 3:";
	Leer p3;
	Escribir "cantidad producto 3:";
	Leer c3;
	
	Escribir "tipo de cliente (1: regular, 2: frecuente):";
	Leer tipoCliente;
	
	Escribir "codigo postal:";
	Leer codigoPostal;
	
	Si p1 < 1 O p2 < 1 O p3 < 1 Entonces
		Escribir "precio invalido";
	Sino
		Si c1 < 1 O c2 < 1 O c3 < 1 Entonces
			Escribir "cantidad invalida";
		Sino
			Si tipoCliente <> 1 Y tipoCliente <> 2 Entonces
				Escribir "tipo de cliente invalido";
			Sino
				Si Longitud(codigoPostal) <> 5 Entonces
					Escribir "codigo postal invalido";
				Sino
					sub1 <- calcularSubtotalProducto(p1, c1);
					sub2 <- calcularSubtotalProducto(p2, c2);
					sub3 <- calcularSubtotalProducto(p3, c3);
					
					subGeneral <- calcularSubtotalGeneral(sub1, sub2, sub3);
					descuento <- calcularDescuento(subGeneral, tipoCliente);
					envio <- calcularEnvio(subGeneral, codigoPostal);
					
					subtotalConDescuento <- subGeneral - descuento;
					impuesto <- calcularImpuesto(subtotalConDescuento);
					
					total <- calcularTotal(subGeneral, descuento, impuesto, envio);
					
					Escribir "el total a pagar es: ", total;
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

Funcion resultado <- calcularSubtotalProducto(precio, cantidad)
	Definir resultado Como Real;
	resultado <- precio * cantidad;
FinFuncion

Funcion resultado <- calcularSubtotalGeneral(subtotal1, subtotal2, subtotal3)
	Definir resultado Como Real;
	resultado <- subtotal1 + subtotal2 + subtotal3;
FinFuncion

Funcion resultado <- calcularDescuento(subtotal, tipoCliente)
	Definir resultado Como Real;
	Si tipoCliente = 2 Entonces
		resultado <- subtotal * 0.10;
	Sino
		resultado <- 0;
	FinSi
FinFuncion

Funcion resultado <- calcularEnvio(subtotal, codigoPostal)
	Definir resultado Como Real;
	Si subtotal < 1000 Entonces
		resultado <- 150;
	Sino
		Si subtotal >= 1000 Y subtotal < 3000 Entonces
			resultado <- 80;
		Sino
			resultado <- 0;
		FinSi
	FinSi
FinFuncion

Funcion resultado <- calcularImpuesto(subtotalConDescuento)
	Definir resultado Como Real;
	resultado <- subtotalConDescuento * 0.16;
FinFuncion

Funcion resultado <- calcularTotal(subtotal, descuento, impuesto, envio)
	Definir resultado Como Real;
	resultado <- subtotal - descuento + impuesto + envio;
FinFuncion