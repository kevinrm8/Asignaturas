SELECT * FROM Pedidos WHERE (YEAR(FechaPedido)='2006') or (YEAR(FechaPedido)='2009'); /* DIA 20/1/2020*/
/* EJERCICIOS CLASE 20/1/2020  LOS DEL CORREO*/ 
select * from Oficinas 
	Where (Pais NOT LIKE 'EEUU' and Ciudad like 'A%') or (Pais NOT LIKE 'EEUU' and Ciudad like '%A'); /* Pais no es EEUU y ciudad empieza por A o acaba en A*/
select * from Oficinas 
	Where (Pais NOT LIKE 'EEUU') and (Ciudad like 'A%' or Ciudad like '%A'); /* Segunda forma de hacer lo mismo*/
Select * From Productos 
	Where ((PrecioVenta < 3) or (PrecioVenta > 50)) and  (Gama ='Aromaticas' or Gama ='Herramientas');/* Precio menor que 3 o mayor 50 y Gama Aromatica o Herramientas*/
Select concat(Nombre,' ',apellido1) from Empleados where CodigoJefe is not null;    
Select concat('La oficina es: ',CodigoOficina,' está en ',Ciudad) from Oficinas;
Select * From GamasProductos Where (DescripcionTexto like '%b%' or '%s%');
Select * From GamasProductos Where (DescripcionTexto like '%b%' and (DescripcionTexto like '%s%'));
Select * From Pedidos where FechaPedido like '2007-06-%';
Select * From Pedidos where FechaPedido between '2007-06-01%'and '2007-06-30';
Select * From Pedidos where FechaPedido >= '2007-06-01' and FechaPedido <= '2007-06-30';
Select * From Pedidos where YEAR(FechaPedido) = '2007' AND ( month(FechaPedido) = '06');
/* EJERCICIOS CLASE 24-01-2020 Gastando sum,avg,min,max,count*/
Select sum(PrecioUnidad * Cantidad) from DetallePedidos Where CodigoPedido=1;
Select avg(Cantidad) from Pagos;
select min(FechaPedido),max(FechaPedido) From Pedidos;
Select count(FechaPedido),count(FechaEntrega) From Pedidos;
/* Mas ejercicios*/
Select count(CodigoPedido),min(FechaPedido) From Pedidos Where FechaPedido LIKE '2006%';
Select max(PrecioVenta),min(PrecioVenta),avg(PrecioVenta) From Productos;
Select sum(PrecioUnidad * Cantidad) From DetallePedidos Where CodigoPedido = 15;
Select count(CodigoEmpleado) From Empleados;
Select count(CodigoEmpleado) From Empleados Where CodigoJefe is not null;
Select count(CodigoPedido) From Pedidos Where FechaPedido like '2007%';
Select avg(datediff(FechaEntrega,FechaPedido)) From Pedidos where FechaEntrega is not null; /* Con el avg sale la media de dias que tardan en entregar, si quitamos el avg sale lo que tarda cada pedido en entregrse*/