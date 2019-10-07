Algoritmo Precios_sin_iva
	
	Si producto != "ropa" o producto != "calzado" o producto != "agua" o producto != "gafas" o producto != "leche" o producto != "huevos"
		Escribir "Dime el producto que quiere introducir "
		Leer producto
	FinSi	

	

	Escribir "El precio de ",producto, " es "
	Leer Precio
	
		Segun producto Hacer
			"ropa" o "calzado":
				Precio=Precio-(Precio*0.21)
				Escribir "El precio sin iva es ", Precio
			"agua" o "gafas":
				Precio=Precio-(Precio*0.1)
				Escribir "El precio sin iva es ", Precio
			"leche" o "huevos":
				Precio=Precio-(Precio*0.04)
				Escribir "El precio sin iva es ", Precio
			De Otro Modo:
				
		Fin Segun

FinAlgoritmo
