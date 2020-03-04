#!/usr/bin/python3

import socket
IP_SERVIDOR = "192.168.25.122"
PUERTO_SERVIDOR = 4444

#Crea el socket
s = socket.socket()
print("Intentando conectar con "+IP_SERVIDOR+"en el puerto "+str(PUERTO_SERVIDOR))

# Conexión a la IP y puerto del servidor
servidor = (IP_SERVIDOR, PUERTO_SERVIDOR)
s.connect(servidor)

# Recibe hasta 1024 bytes
recibido = s.recv(1024)
print(recibido.decode())
	
print ("Enviar mensajes al servidor (escribe 'quit' para terminar): ")
mensaje = ""
while (mensaje != "quit"):
	mensaje = input("> ")
	s.send(bytes(mensaje, 'utf-8'))
	
s.close()
