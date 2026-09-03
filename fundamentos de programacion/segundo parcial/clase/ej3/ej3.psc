Algoritmo ej3
	
	Definir op, r, l, b, a Como Real
	Definir area Como Caracter
	
	op <- 0
	
	Escribir "elige una opcion para calcular un area:"
	Escribir "-ci para circulo"
	Escribir "-cu para cuadrado"
	Escribir "-t para triangulo"
	Escribir "-r para rectangulo"
	
	Leer area
	
	Segun area Hacer
		"ci":
			Escribir "circulo: Ingresa el radio"
			Leer r
			op <- 3.14 * (r ^ 2)
			
		"cu":
			Escribir "cuadrado: Ingresa el valor del lado"
			Leer l
			op <- l ^ 2
			
		"r":
			Escribir "rectangulot: Ingresa la base y altura"
			Leer b
			Leer a
			op <- b * a
			
		"t":
			Escribir "triangulo: Ingresa la base y altura"
			Leer b
			Leer a
			op <- (b * a) / 2
			
		De Otro Modo:
			Escribir "no existe"
	FinSegun
	
	Escribir "el resultado de su operacion es:", op
	
FinAlgoritmo