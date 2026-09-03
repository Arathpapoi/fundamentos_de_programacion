Algoritmo ej7	
	Definir precio, p Como Real
	Definir t_chocolate, palabra, snack, t_snack, sabor Como Caracter
	
	precio <- 0
	p <- 0
	t_chocolate <- ""
	palabra <- ""
	snack <- ""
	t_snack <- ""
	
	Escribir "que sabor de pastel desea:"
	Escribir "-c para chocolate"
	Escribir "-f para fresa"
	Escribir "-m para manzana"
	Leer sabor
	
	Si sabor = "c" Entonces
		Escribir "que tipo de chocolate desea:"
		Escribir "-n para chocolate negro"
		Escribir "-b para chocolate blanco"
		Leer t_chocolate
		
		Si t_chocolate = "n" Entonces
			p <- 280
		SiNo
			Si t_chocolate = "b" Entonces
				p <- 300
			SiNo
				Escribir "opcion erronea"
			FinSi
		FinSi
	FinSi
	
	Segun sabor Hacer
		"f":
			precio <- 250
			
		"m":
			precio <- 200
			
		"c":
			precio <- p
			
		De Otro Modo:
			Escribir "opcion no valida"
	FinSegun
	
	Escribir "desea escribir en el pastel(s/n):"
	Leer palabra
	
	Si palabra = "s" Entonces
		precio <- precio + 30
	SiNo
		Si palabra = "n" Entonces
			precio <- precio + 0
		SiNo
			Escribir "opcion erronea"
		FinSi
	FinSi
	
	Escribir "desea agregar un snack al pastel(s/n):"
	Leer snack
	
	Mientras snack = "s" Hacer
		
		Escribir "elija un snack:"
		Escribir "-f para fresa"
		Escribir "-g para galleta"
		Escribir "-d para durazno"
		Leer t_snack
		
		Segun t_snack Hacer
			"f":
				precio <- precio + 25
				
			"g":
				precio <- precio + 25
				
			"d":
				precio <- precio + 25
				
			De Otro Modo:
				Escribir "opcion no valida"
		FinSegun
		
		Escribir "desea agregar un snack al pastel(s/n):"
		Leer snack
		
	FinMientras
	
	Escribir "el total de su paste es:", precio
	
FinAlgoritmo
