Algoritmo ej_5
	
    total <- 0
	
    Escribir "Cual es el peso de su paquete en kilos"
    Leer peso
	
    Si peso > 5 Entonces
        Escribir "Paquete rechazado"
    SiNo
		
        Escribir "Elige la zona a la que sera enviado el paquete:"
        Escribir "Escribe 1 para America del Norte"
        Escribir "Escribe 2 para America Central"
        Escribir "Escribe 3 para America del Sur"
        Escribir "Escribe 4 para Europa"
        Escribir "Escribe 5 para Asia"
        Leer zona
		
        Segun zona Hacer
			
            1:
                Escribir "Su paquete sera enviado a America del Norte"
                total <- (peso * 1000) * 11
				
            2:
                Escribir "Su paquete sera enviado a America Central"
                total <- (peso * 1000) * 10
				
            3:
                Escribir "Su paquete sera enviado a America del Sur"
                total <- (peso * 1000) * 12
				
            4:
                Escribir "Su paquete sera enviado a Europa"
                total <- (peso * 1000) * 25
				
            5:
                Escribir "Su paquete sera enviado a Asia"
                total <- (peso * 1000) * 30
				
            De Otro Modo:
                Escribir "Opcion invalida"
				
        FinSegun
		
        Si zona >= 1 Y zona <= 5 Entonces
            Escribir "El total por el envio es de: ", total
        FinSi
		
    FinSi
	
FinAlgoritmo