/* MULTITABLA 
    12) Oficinas de “EEUU” a las que pertenezcan empleados de “San Francisco”.(sin repetirse)
    13) Oficinas que no sean de EEUU ubicadas en una ciudad que empiece por A o acabe por A
    14) Nombre de los productos para los que se haya pedido en algún pedido una cantidad entre 20 y 30.
    15) Precio de cada línea de detalle pedido señalando, precio unitario, cantidad, código de pedido y nombre del producto.
    16) Pedidos que tengan algún producto de la gama “herbáceas”
    17) Empleados que tienen algún cliente de “EEUU” que haya hecho algún pedido en el 2006.
    18) Nombre y apellidos de cada empleado en una misma columna y lo mismo para su jefe.
    19) Empleados (nombre completo) que trabajen en la oficina 'SYD-AU' o que tengan  el cargo de “Representante de Ventas” cuyo jefe se llame “Amy”
    20) Oficinas de España que no empiecen por B que tengan clientes de en la misma ciudad o en distinto país
    21) Clientes que hayan realizado algún pedido en 2007o algún pago en 2008 */
    
    /*     10) Pedidos del 2009 o del 2006 del cliente de nombre “Tendo Garden” */
    Select P.* From Pedidos P Inner join Clientes C on P.CodigoCliente = C.CodigoCliente
    Where (FechaPedido like "2006%" or FechaPedido like "2009%") AND (NombreCliente like "Tendo Garden");
    
	/*    11) Pedidos de entre junio de 2006 y mayo de 2008 hechos por clientes de España.*/
	Select P.*,Pais From Pedidos P Inner join Clientes C on P.CodigoCliente = C.CodigoCliente/* Falta poner clave que une las tablas*/
    Where (FechaPedido between '2006-06-01'and '2008-05-31') and (Pais like "España%");
    
     /* EJERCICIO CLASE : Pedidos hechos por empleados de oficinas de Madrid*/ 
    Select P.* From Pedidos P Inner join  Empleados 
    Where (P.CodigoPedido and (E.CodigoOficina like "Madrid"));
    