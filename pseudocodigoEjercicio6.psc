Algoritmo pseudocodigoEjercicio6
	
	Para i<-1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingrese la edad: "
		Leer edad
		Si edad>=25 Entonces
			sumaMayor <- sumaMayor + edad
			contMayor <- contMayor + 1
		SiNo
			sumaMenor <- sumaMenor + edad
			contMenor <- contMenor + 1
		Fin Si
		
	Fin Para
	promMayor <- sumaMayor / contMayor
	promMenor <- sumaMenor / contMenor
	
	Escribir "Promedio de mayores de 25: " promMayor
	Escribir "Promedio de menores de 25: " promMenor
FinAlgoritmo
