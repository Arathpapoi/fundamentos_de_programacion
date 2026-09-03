Algoritmo ej2
	
	Definir op, n1, n2 Como Real
	Definir operacion Como Caracter
	
	Escribir "ingresa dos numeros"
	Leer n1
	Leer n2
	
	Escribir "elige una operacion *,/,+,-:"
	Leer operacion
	
	Segun operacion Hacer
		"*":
			Escribir "multiplicacion:"
			op <- n1 * n2
			
		"/":
			Escribir "division:"
			op <- n1 / n2
			
		"+":
			Escribir "suma:"
			op <- n1 + n2
			
		"-":
			Escribir "resta:"
			op <- n1 - n2
			
		De Otro Modo:
			Escribir "no valido"
	FinSegun
	
	Escribir "el resultado su operacion es:", op
	
FinAlgoritmo