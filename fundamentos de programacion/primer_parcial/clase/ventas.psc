Algoritmo ventasss
	definir ventas,v1,v2,v3,i,monto,total Como Real
	definir venta Como Caracter
	v1<-0
	ven1<-0
	v2<-0
	ven2<-0
	v3<-0
	ven3<-0
	Escribir "cuantas ventas fueron en el dia"
	Escribir "escribe s si hay venta y n si no hay"
	Leer venta
	Mientras venta="s" Hacer
		Escribir "ingresa el monto de la venta"
		leer monto
		Si monto>=1000 Entonces
			v1<-v1+1
			ven1<-ven1+monto
		SiNo
			Si monto<1000 y monto>=500 Entonces
				v2<-v2+1
				ven2<-ven2+monto
			SiNo
				v3<-v3+1
				ven3<-ven3+monto
			Fin Si
		Fin Si
		Escribir "cuantas ventas fueron en el dia"
		Escribir "escribe s si hay venta y n si no hay"
		Leer venta
	Fin Mientras
	total<-ven1+ven2+ven3
	
	Escribir "las ventas mayores a 1000 fueron:",v1, "y el monto es de:",ven1
	Escribir "las ventas mayores o igauales a 500 y menores a 1000 son:",v2 , "y el monto es de:",ven2
	Escribir "las ventas menores de 500 son:",v3, "y el monto es de:",ven3
	Escribir "el monto total es de:",total
	
FinAlgoritmo
