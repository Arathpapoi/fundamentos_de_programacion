Algoritmo ej4
	
	Definir hora, saludo Como Real
	
	Escribir "Introduce una hora (1-24)"
	Leer hora
	
	Si hora >= 6 Y hora <= 12 Entonces
		saludo <- 1
	SiNo
		Si hora >= 13 Y hora <= 20 Entonces
			saludo <- 2
		SiNo
			Si hora <= 0 O hora > 24 Entonces
				Escribir "fuera de horario"
SiNo
	saludo <- 3
FinSi
FinSi
FinSi

Segun saludo Hacer
	1:
		Escribir "buenos dias"
		
	2:
		Escribir "buenas tardes"
		
	3:
		Escribir "buenas noches"
	De Otro Modo:
		Escribir "fuera de aqui"
Fin Segun
FinAlgoritmo