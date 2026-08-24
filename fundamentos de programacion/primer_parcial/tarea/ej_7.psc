Algoritmo ej_7
	
    Escribir "Cual es la edad del postulante:"
    Leer edad
	
    Escribir "Cual es tu promedio:"
    Leer prom
	
    Si edad > 18 Entonces
		
        Si prom >= 9 Y prom <= 10 Entonces
            Escribir "Su beca es de 10000"
        SiNo
            Si prom >= 7.5 Y prom < 9 Entonces
                Escribir "Su beca es de 8000"
            SiNo
                Si prom >= 6 Y prom < 7.5 Entonces
                    Escribir "Su beca es de 5000"
                SiNo
                    Si prom >= 0 Y prom < 6 Entonces
                        Escribir "Necesitas mejorar tu promedio"
                    SiNo
                        Escribir "Promedio no valido"
                    FinSi
                FinSi
            FinSi
        FinSi
		
    SiNo
		
        Si prom >= 9 Y prom <= 10 Entonces
            Escribir "Su beca es de 8000"
        SiNo
            Si prom >= 8 Y prom < 9 Entonces
                Escribir "Su beca es de 6000"
            SiNo
                Si prom >= 6 Y prom < 8 Entonces
                    Escribir "Su beca es de 4000"
                SiNo
                    Si prom >= 0 Y prom < 6 Entonces
                        Escribir "Necesitas mejorar tu promedio"
                    SiNo
                        Escribir "Promedio no valido"
                    FinSi
                FinSi
            FinSi
        FinSi
		
    FinSi
	
FinAlgoritmo