Algoritmo ahorros
	Definir i, cantidad, ahorro Como Real
	ahorro <- 0
	Para i<-1 Hasta 12 Con Paso 1 Hacer
		Escribir 'cuanto desea ahorrar este mes'
		Leer cantidad
		ahorro <- ahorro+cantidad
		Escribir 'la cantidad ahorrada hasta ahora es de:', ahorro, ' pesos'
	FinPara
	Escribir 'la cantidad ahorrada en todo el año es de:', ahorro, ' pesos'
FinAlgoritmo
