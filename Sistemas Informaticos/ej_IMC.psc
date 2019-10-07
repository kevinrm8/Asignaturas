Algoritmo Calculo_del_IMC
	IMC = 0
	altura =0
	peso=0
	Escribir "Dime tu altura en cm "
	Leer altura
	altura = altura/100
	altura = altura*altura
	Escribir "Dime tu peso en gramos "
	Leer peso
	peso = peso/1000

	IMC = peso/altura
	
	Segun IMC Hacer
		IMC < 18.5:
			Escribir "Tu peso es inferior al normal, enhorabuena."
		IMC>=18.5 o IMC<=24.9:
			Escribir "Tu peso es normal, eres persona."
		IMC>=25 o IMC<=29.9:
			Escribir "Tu peso es superior al normal, empieza a cuidarte."
		IMC>30:
			Escribir "Tu peso está muy por encima de lo normal, PELIGRO!."
	Fin Segun
	
FinAlgoritmo
