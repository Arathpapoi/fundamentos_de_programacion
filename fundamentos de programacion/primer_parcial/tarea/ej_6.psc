Algoritmo ej_6
	
    Escribir "Cuantas horas estuvo el cliente?"
    Leer horas
	
    total <- 0
	
    Si horas <= 2 Entonces
        total <- horas * 30
		
    SiNo
        Si horas <= 5 Entonces
            total <- (2 * 30) + ((horas - 2) * 25)
			
        SiNo
            Si horas <= 10 Entonces
                total <- (2 * 30) + (3 * 25) + ((horas - 5) * 20)
				
            SiNo
                dias <- trunc(horas / 24)
                restantes <- horas MOD 24
				
                total <- dias * 380
				
                Si restantes > 0 Y restantes <= 2 Entonces
                    total <- total + (restantes * 30)
					
                SiNo
                    Si restantes <= 5 Entonces
                        total <- total + (2 * 30) + ((restantes - 2) * 25)
						
                    SiNo
                        Si restantes <= 10 Entonces
                            total <- total + (2 * 30) + (3 * 25) + ((restantes - 5) * 20)
							
                        SiNo
                            total <- total + 380
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
    FinSi
	
    Escribir "El total a pagar es: $", total
	
FinAlgoritmo