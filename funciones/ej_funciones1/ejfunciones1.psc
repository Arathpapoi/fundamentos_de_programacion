Algoritmo ejfunciones1
	Definir valorVehiculo, tarifa, r_edad, t_ac, sub, descuento, total Como Real;
	Definir edad, accidentes Como Entero;
	Definir respuesta Como Cadena;
	Definir seguro Como Logico;
	
	Escribir "el valor del vehiculo:";
	Leer valorVehiculo;
	
	Escribir "ingresa tu edad:";
	Leer edad;
	
	Escribir "cuantos accidentes tuvo durante el ultimo año:";
	Leer accidentes;
	
	Escribir "¿tiene seguro?:";
	Leer respuesta;
	
	seguro <- (respuesta = "s" O respuesta = "S");
	
	Si edad < 18 O edad > 100 Entonces
		Escribir "edad invalida";
	Sino
		Si valorVehiculo < 1 Entonces
			Escribir "valor del auto no valido";
		Sino
			Si accidentes < 0 Entonces
				Escribir "valor de accidentes invalido";
			Sino
				tarifa <- calcularTarifaBase(valorVehiculo);
				r_edad <- calcularRecargoPorEdad(tarifa, edad);
				t_ac <- calcularRecargoPorAccidentes(tarifa, accidentes);
				sub <- tarifa + r_edad + t_ac;
				descuento <- calcularDescuentoSeguridad(sub, seguro);
				total <- calcularCostoFinal(tarifa, r_edad, t_ac, descuento);
				
				Escribir "el costo por su seguro es de: ", total;
			FinSi
		FinSi
	FinSi
FinAlgoritmo

Funcion resultado <- calcularTarifaBase(valorVehiculo)
	Definir resultado Como Real;
	resultado <- valorVehiculo * 0.04;
FinFuncion

Funcion resultado <- calcularRecargoPorEdad(tarifaBase, edad)
	Definir resultado Como Real;
	Si edad > 17 Y edad < 25 Entonces
		resultado <- tarifaBase * 0.20;
	Sino
		Si edad > 60 Entonces
			resultado <- tarifaBase * 0.10;
		Sino
			resultado <- 0;
		FinSi
	FinSi
FinFuncion

Funcion resultado <- calcularRecargoPorAccidentes(tarifaBase, accidentes)
	Definir resultado Como Real;
	resultado <- accidentes * (tarifaBase * 0.08);
FinFuncion

Funcion resultado <- calcularDescuentoSeguridad(subtotal, tieneSeguridad)
	Definir resultado Como Real;
	Si tieneSeguridad Entonces
		resultado <- subtotal * 0.05;
	Sino
		resultado <- 0;
	FinSi
FinFuncion

Funcion resultado <- calcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
	Definir resultado Como Real;
	resultado <- (tarifaBase + recargoEdad + recargoAccidentes) - descuento;
FinFuncion