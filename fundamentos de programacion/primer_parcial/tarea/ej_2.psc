Algoritmo ej_2
	
    lim1 <- 0
    lim2 <- 0
	
    Escribir "Es su cumpleanos (s/n):"
    Leer cumple
	
    Escribir "Cual es su velocidad:"
    Leer vel
	
    Si cumple = "s" Entonces
        lim1 <- 66
        lim2 <- 86
    SiNo
        Si cumple = "n" Entonces
            lim1 <- 61
            lim2 <- 81
        SiNo
            Escribir "Opcion no valida"
        FinSi
    FinSi
	
    Si cumple = "s" O cumple = "n" Entonces
		
        Si vel < lim1 Entonces
            multa <- 0
            Escribir "Sin multa"
			
        SiNo
            Si vel >= lim1 Y vel < lim2 Entonces
                multa <- 1
                Escribir "Multa pequena"
				
            SiNo
                multa <- 2
                Escribir "Multa grande"
            FinSi
        FinSi
		
        Escribir "Valor codificado: ", multa
		
    FinSi
	
FinAlgoritmo