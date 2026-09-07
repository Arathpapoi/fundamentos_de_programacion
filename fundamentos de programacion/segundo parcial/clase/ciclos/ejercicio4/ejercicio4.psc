Algoritmo ejercicio4
	
    Definir in, in2, in3, espacios Como Caracter
    Definir f, n, i, j Como Entero
	
    in <- ""
    in2 <- ""
    in3 <- ""
    f <- 1
	
    Escribir "Ingresa el numero de lineas que desea para su patron:"
    Leer n
    Para i <- 1 Hasta n Hacer
		
        Mientras f <= n Hacer
            in <- in + "*"
            f <- f + 1
        FinMientras
		
        Escribir in
		
    FinPara
	
    Para j <- 1 Hasta n Hacer
		
        espacios <- ""
		
        Para i <- 0 Hasta n - j Hacer
            espacios <- espacios + " "
        FinPara
		
        Si j = 1 Entonces
            in2 <- in2 + "*"
        SiNo
            in2 <- in2 + "**"
        FinSi
		
        Escribir espacios + in2
		
    FinPara
	
    Escribir ""
	
    Para j <- 1 Hasta n Hacer
		
        espacios <- ""
        in3 <- ""
		
        Para i <- 0 Hasta j - 2 Hacer
            espacios <- espacios + " "
        FinPara
		
        Para i <- 0 Hasta 2 * (n - j) Hacer
            in3 <- in3 + "*"
        FinPara
		
        Escribir espacios + in3
		
    FinPara
	
FinAlgoritmo