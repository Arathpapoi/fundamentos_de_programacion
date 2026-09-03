Algoritmo ej5
	Definir mes, dia Como Real
	Definir signo Como Cadena
	Escribir 'Ingresa el numero de mes (1-12):'
	Leer mes
	Escribir 'Ingrese el dia del mes de su nacimiento:'
	Leer dia
	signo <- ''
	Según mes Hacer
		1:
			Si dia>0 Y dia<=19 Entonces
				signo <- 'Capricornio'
			SiNo
				Si dia>19 Y dia<32 Entonces
					signo <- 'Acuario'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		2:
			Si dia>0 Y dia<19 Entonces
				signo <- 'Acuario'
			SiNo
				Si dia>18 Y dia<29 Entonces
					signo <- 'piscis'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		3:
			Si dia>0 Y dia<21 Entonces
				signo <- 'piscis'
			SiNo
				Si dia>20 Y dia<32 Entonces
					signo <- 'Aries'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		4:
			Si dia>0 Y dia<20 Entonces
				signo <- 'Aries'
			SiNo
				Si dia>19 Y dia<31 Entonces
					signo <- 'Tauro'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		5:
			Si dia>0 Y dia<22 Entonces
				signo <- 'Tauro'
			SiNo
				Si dia>21 Y dia<32 Entonces
					signo <- 'Geminis'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		6:
			Si dia>0 Y dia<21 Entonces
				signo <- 'Geminis'
			SiNo
				Si dia>20 Y dia<31 Entonces
					signo <- 'Cancer'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		7:
			Si dia>0 Y dia<23 Entonces
				signo <- 'Cancer'
			SiNo
				Si dia>22 Y dia<32 Entonces
					signo <- 'Leo'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		8:
			Si dia>0 Y dia<23 Entonces
				signo <- 'Leo'
			SiNo
				Si dia>22 Y dia<32 Entonces
					signo <- 'Virgo'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		9:
			Si dia>0 Y dia<23 Entonces
				signo <- 'Virgo'
			SiNo
				Si dia>22 Y dia<31 Entonces
					signo <- 'Libra'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		10:
			Si dia>0 Y dia<23 Entonces
				signo <- 'Libra'
			SiNo
				Si dia>22 Y dia<32 Entonces
					signo <- 'Escorpio'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		11:
			Si dia>0 Y dia<22 Entonces
				signo <- 'Escorpio'
			SiNo
				Si dia>21 Y dia<31 Entonces
					signo <- 'Sagitario'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		12:
			Si dia>0 Y dia<22 Entonces
				signo <- 'Sagitario'
			SiNo
				Si dia>21 Y dia<32 Entonces
					signo <- 'Capricornio'
				SiNo
					Escribir 'ese dia no existe'
				FinSi
			FinSi
		De Otro Modo:
			Escribir 'opcion no valida'
	FinSegún
	Escribir 'su horoscopo es:', signo
FinAlgoritmo
