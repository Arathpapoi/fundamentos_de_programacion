Algoritmo ej_1
	
    p_k <- 0
    perdida <- 0
    ganancia <- 0
    total <- 0
	
    Escribir "Cual es precio por kilo"
    Leer precio
	
    Escribir "Cuantos kilos va a vender:"
    Leer kilos
	
    Escribir "Cual es el tipo de la uva (a/b):"
    Leer tipo
	
    Escribir "Cual es el tamano de la uva (1/2):"
    Leer tamano
	
    Si tipo = "a" Y tamano = 1 Entonces
		
        p_k <- precio * kilos
        ganancia <- kilos * 0.2
        total <- p_k + ganancia
		
    SiNo
        Si tipo = "a" Y tamano = 2 Entonces
			
            p_k <- precio * kilos
            ganancia <- kilos * 0.3
            total <- p_k + ganancia
			
        SiNo
            Si tipo = "b" Y tamano = 1 Entonces
				
                p_k <- precio * kilos
                perdida <- kilos * 0.3
                total <- p_k - perdida
				
            SiNo
                Si tipo = "b" Y tamano = 2 Entonces
					
                    p_k <- precio * kilos
                    perdida <- kilos * 0.5
                    total <- p_k - perdida
					
                SiNo
                    Escribir "Opcion invalida"
                FinSi
				
            FinSi
			
        FinSi
		
    FinSi
	
    Escribir "Total por kilo: ", p_k
    Escribir "La ganancia es de: ", ganancia
    Escribir "La perdida es de: ", perdida
    Escribir "El total es de: ", total
	
FinAlgoritmo