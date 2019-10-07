Algoritmo Detectar_numero_primo
	divisor = 1
	acum=0
	Escribir "Ingrese numero"
	Leer num
	Repetir
		Si num MOD divisor=0 Entonces
			divisores = divisores +1
		FinSi
		divisor = divisor +1
	Hasta Que  divisor = num+1
	Repetir
		SI divisores = 2 Entonces
			Escribir "El numero ", num, " es PRIMO"
		Sino 
			Escribir "El numero ", num, " no es primo"
		FinSi
		acum =acum +1
	Hasta Que  acum=num
FinAlgoritmo
