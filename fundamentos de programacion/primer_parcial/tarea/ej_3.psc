Algoritmo ej_3
	
    Escribir "Ingresa un numero"
    Leer num
	
    Si num = 0 Entonces
        Escribir "Numero neutro"
    SiNo
        res <- num MOD 2
		
        Si res = 0 Entonces
            Escribir "El numero es par"
        SiNo
            Escribir "Es impar"
        FinSi
    FinSi
	
FinAlgoritmo