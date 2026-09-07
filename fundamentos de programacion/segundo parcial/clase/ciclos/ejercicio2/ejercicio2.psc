Algoritmo ejercicio2
    Definir m,n Como Entero
    
    Escribir "ingresa un numero (0 para finalizar):"
    Leer n
    
    Mientras n <> 0 Hacer
        
        Para i <- 1 Hasta 10 Hacer
            m <- n * i
            Escribir n, "*", i, "=", m
        FinPara
        
        Escribir "ingresa un numero (0 para finalizar):"
        Leer n
        
    FinMientras
    
    Escribir "se finalizo con exito"
    
FinAlgoritmo