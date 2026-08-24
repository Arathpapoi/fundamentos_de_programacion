Algoritmo verificador
	Escribir"ingresa 3 cantidades"
	Leer n1
	Leer n2
	Leer n3
	Si n1>n2 y n1>n3 Entonces
		Escribir n1," Es el numero mayor"
	SiNo
		Si n2>n1 y n2>n3 Entonces
			Escribir n2," Es el numero mayor"
		SiNo
			Escribir n3," Es el numero mayor"
		Fin Si
	Fin Si
	
	Si  Entonces
		n1=n2 y n1=n3
		Escribir"dos numeros son iguales"
	SiNo
		Si n1=n2 o n1=n3 o n3=n2 Entonces
			Escribir "los tres son iguales"
		SiNo
			Escribir"ninguno es igual"
		Fin Si
	Fin Si
FinAlgoritmo
