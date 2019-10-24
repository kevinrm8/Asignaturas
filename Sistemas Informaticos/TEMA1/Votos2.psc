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
			Escribir " Se ha impuesto la izquierda por un ",((Podemos)/Total)*100 " de votos, siendo Podemos el partido que ha recibido más votos, en concreto, " Podemos ".Más periodismo"
		FinSi
		SiNo
			Escribir " Se ha impuesto la derecha por un " ((PP+Ciudadanos+VOX+PSOE)/Total)*100 " de votos, siendo "
			Si PSOE> PP y PSOE >Ciudadanos y PSOE > VOX
				Escribir "PSOE el partido que ha recibido más votos, en concreto, " PSOE ".Más periodismo"
			FinSi
			Si PP> Ciudadanos y PP > VOX
				Escribir "PP el partido que ha recibido más votos, en concreto, " PP ".Más periodismo"
			FinSi
			Si Ciudadanos>PP y Ciudadanos> VOX	
				Escribir "Ciudadanos el partido que ha recibido más votos, en concreto, " Ciudadanos ".Más periodismo"
			SiNo
				Escribir "VOX el partido que ha recibido más votos, en concreto, " VOX ".Más periodismo"
			FinSi
	FinSi
FinAlgoritmo