Algoritmo ej_4
	
    pagacita <- 0
    pagatotal <- 0
	
    Escribir "Cuantas citas lleva hasta el momento:"
    Leer citas
	
    Si citas >= 1 Y citas <= 3 Entonces
		
        pagacita <- 900
        pagatotal <- pagacita * citas
		
    SiNo
		
        Si citas >= 4 Y citas <= 5 Entonces
			
            pagacita <- 800
            pagatotal <- 2700 + (pagacita * (citas - 3))
			
        SiNo
			
            Si citas >= 6 Y citas <= 8 Entonces
				
                pagacita <- 600
                pagatotal <- 4300 + (pagacita * (citas - 5))
				
            SiNo
				
                Si citas > 8 Entonces
					
                    pagacita <- 500
                    pagatotal <- 6100 + (pagacita * (citas - 8))
					
                SiNo
                    Escribir "Numero de citas no valido"
                FinSi
				
            FinSi
			
        FinSi
		
    FinSi
	
    Si citas >= 1 Entonces
        Escribir "El costo de la cita es de: ", pagacita
        Escribir "El total pagado durante el tratamiento es de: ", pagatotal
    FinSi
	
FinAlgoritmo