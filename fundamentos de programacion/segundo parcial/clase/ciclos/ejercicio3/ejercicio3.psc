Algoritmo ejercicio3
	
    Definir in Como Caracter
    Definir n Como Entero
	
    in <- ""
	
    Escribir "ingresa un numero:"
    Leer n
	
    Para i <- 1 Hasta n Hacer
        in <- in + ConvertirATexto(i) + " "
        Escribir in
    FinPara
	
FinAlgoritmo