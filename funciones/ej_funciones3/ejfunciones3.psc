Algoritmo ejfunciones3
	Definir lecturaAnterior, lecturaActual, consumo, cargoFijo, costoConsumo, costoAntesImpuesto, descuento, baseImponible, impuesto, total Como Real;
	Definir respuesta Como Cadena;
	Definir tieneApoyo Como Logico;
	
	Escribir "lectura anterior:";
	Leer lecturaAnterior;
	
	Escribir "lectura actual:";
	Leer lecturaActual;
	
	Escribir "¿tiene programa de apoyo? (s/n):";
	Leer respuesta;
	
	tieneApoyo <- (respuesta = "s" O respuesta = "S");
	
	Si lecturaAnterior < 0 O lecturaActual < 0 Entonces
		Escribir "las lecturas no pueden ser negativas";
	Sino
		Si lecturaActual < lecturaAnterior Entonces
			Escribir "lectura actual debe ser mayor o igual a la anterior";
		Sino
			consumo <- calcularConsumo(lecturaAnterior, lecturaActual);
			
			Si consumo > 10000 Entonces
				Escribir "consumo maximo excedido";
			Sino
				cargoFijo <- 95.0;
				costoConsumo <- calcularCostoConsumo(consumo);
				costoAntesImpuesto <- costoConsumo + cargoFijo;
				
				descuento <- calcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo);
				baseImponible <- costoAntesImpuesto - descuento;
				impuesto <- calcularImpuesto(baseImponible);
				
				total <- calcularTotal(costoConsumo, cargoFijo, descuento, impuesto);
				
				mostrarRecibo(consumo, costoConsumo, descuento, impuesto, total);
			FinSi
		FinSi
	FinSi
FinAlgoritmo

Funcion resultado <- calcularConsumo(lecturaAnterior, lecturaActual)
	Definir resultado Como Real;
	resultado <- lecturaActual - lecturaAnterior;
FinFuncion

Funcion resultado <- calcularCostoConsumo(consumo)
	Definir resultado Como Real;
	Si consumo <= 150 Entonces
		resultado <- consumo * 1.20;
	Sino
		Si consumo <= 400 Entonces
			resultado <- (150 * 1.20) + ((consumo - 150) * 1.80);
		Sino
			resultado <- (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75);
		FinSi
	FinSi
FinFuncion

Funcion resultado <- calcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo)
	Definir resultado Como Real;
	Si tieneApoyo Y consumo <= 250 Entonces
		resultado <- costoAntesImpuesto * 0.30;
	Sino
		resultado <- 0;
	FinSi
FinFuncion

Funcion resultado <- calcularImpuesto(baseImponible)
	Definir resultado Como Real;
	resultado <- baseImponible * 0.16;
FinFuncion

Funcion resultado <- calcularTotal(costoConsumo, cargoFijo, descuento, impuesto)
	Definir resultado Como Real;
	resultado <- (costoConsumo + cargoFijo) - descuento + impuesto;
FinFuncion

SubProceso mostrarRecibo(consumo, costoConsumo, descuento, impuesto, total)
	Escribir "consumo registrado: ", consumo, " kWh";
	Escribir "costo por consumo: $", costoConsumo;
	Escribir "descuento: $", descuento;
	Escribir "impuesto: $", impuesto;
	Escribir "el total a pagar es: $", total;
FinSubProceso