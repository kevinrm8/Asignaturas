Algoritmo sin_titulo
	Escribir "Dime los votos de podemos "
	Leer Podemos
	Escribir "Dime los votos de PSOE "
	Leer PSOE
	Escribir "Dime los votos de PP "
	Leer PP
	Escribir "Dime los votos de Ciudadanos "
	Leer Ciudadanos
	Escribir "Dime los votos de VOX "
	Leer VOX
	Escribir "Quieres La verdad o La veerdaad ? "
	leer Verdad
	
	
	Total = (Podemos+PSOE+PP+Ciudadanos+VOX)
	
	Si Verdad = "La veerdaad"
	
		Si (Podemos)>(PSOE+PP+Ciudadanos+VOX)
			Escribir " Se ha impuesto la izquierda por un ",((Podemos)/Total)*100 " de votos, siendo Podemos el partido que ha recibido m�s votos, en concreto, " Podemos ".M�s periodismo"
		FinSi
		SiNo
			Escribir " Se ha impuesto la derecha por un " ((PP+Ciudadanos+VOX+PSOE)/Total)*100 " de votos, siendo "
			Si PSOE> PP y PSOE >Ciudadanos y PSOE > VOX
				Escribir "PSOE el partido que ha recibido m�s votos, en concreto, " PSOE ".M�s periodismo"
			FinSi
			Si PP> Ciudadanos y PP > VOX
				Escribir "PP el partido que ha recibido m�s votos, en concreto, " PP ".M�s periodismo"
			FinSi
			Si Ciudadanos>PP y Ciudadanos> VOX	
				Escribir "Ciudadanos el partido que ha recibido m�s votos, en concreto, " Ciudadanos ".M�s periodismo"
			SiNo
				Escribir "VOX el partido que ha recibido m�s votos, en concreto, " VOX ".M�s periodismo"
			FinSi
	FinSi
FinAlgoritmo