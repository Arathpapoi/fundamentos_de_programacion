Algoritmo ej6
	
	Definir membresia, promo Como Caracter
	Definir dia, n_personas Como Real
	Definir boleto, total, par, truc Como Real
	
	boleto <- 0
	total <- 0
	par <- 0
	truc <- 0
	
	Escribir "Ingrese el dia de la semana (1-7):"
	Leer dia
	
	Escribir "Ingrese el numero de boletos a comprar:"
	Leer n_personas
	
	Si dia <> 3 Entonces
		boleto <- 50
	SiNo
		boleto <- 30
	FinSi
	
	Escribir "Usted cuenta con membresia (s/n):"
	Leer promo
	
	Si promo = "s" Entonces
		boleto <- boleto * 0.9
	FinSi
	
	Segun dia Hacer
		1:
			total <- n_personas * boleto
			
		2:
			total <- n_personas * boleto
			
		3:
			total <- n_personas * boleto
			
		4:
			Si promo = "s" Entonces
				truc <- (n_personas % 2) * boleto
				par <- (((n_personas - (n_personas % 2)) / 2) * 75) * 0.9
				total <- truc + par
				
			SiNo
				Si promo = "n" Entonces
					truc <- (n_personas % 2) * boleto
					par <- ((n_personas - (n_personas % 2)) / 2) * 75
					total <- truc + par
				SiNo
					Escribir "no valido"
				FinSi
			FinSi
			
		5:
			total <- n_personas * boleto
			
		6:
			total <- n_personas * boleto
			
		7:
			total <- n_personas * boleto
			
		De Otro Modo:
			Escribir "no existe"
	FinSegun
	
	Escribir "total es:", total
FinAlgoritmo
	
//FinAlgoritmo