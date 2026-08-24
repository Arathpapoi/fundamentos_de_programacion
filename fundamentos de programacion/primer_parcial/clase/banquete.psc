Algoritmo banquete
	Definir personas,costo Como Entero
	Escribir "introduce el numero de personas"
	leer personas
	Si personas<200 Entonces
		costo<-personas*95
		escribir"el costo por platillo es de 95 y el total es:",costo
	SiNo
		Si personas>=200 y personas<300 Entonces
			costo<-personas*85
			escribir"el costo por platillo es de 85 y el total es:",costo
		SiNo
			costo<-personas*75
			escribir"el costo por platillo es de 75 y el total es:",costo
		Fin Si
	Fin Si
	
FinAlgoritmo
