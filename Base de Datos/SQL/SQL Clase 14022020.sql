/* 38) Nombre completo del empleado y número de clientes que tiene a su cargo */


/* 40) Importe total de los pagos efectuados por cada cliente en cada año*/
select Codigocliente,year(fechapago),sum(cantidad)
from pagos
group by Codigocliente, year(fechapago);

/* 41) Nombre del jefe y número de empleados que tiene a su cargo */
Select j.Nombre, count(e.Nombre)
from empleados e inner join empleados j on e.CodigoJefe=j.CodigoEmpleado
group by j.Nombre, j.CodigoEmpleado;

/* HAVING */ 
/* 42) Número de pedidos que ha hecho cada cliente viendo el nombre y la dirección del cliente, de los clientes que han hecho más de 5 pedidos. */
select c.NombreCliente,c.Lineadireccion1
from pedidos p inner join clientes c on p.CodigoCliente=c.CodigoCliente
group by c.CodigoCliente
having count(*)>5;

/* 43) Número de pedidos que ha hecho cada cliente viendo el nombre y la dirección del cliente, 
de los clientes que han hecho pedidos por un importe mayor que 1000€. */

select c.NombreCliente, c.LineaDireccion1, count(*)
from clientes c inner join pedidos p on c.CodigoCliente=p.CodigoCliente inner join detallepedidos dp on p.CodigoPedido=dp.CodigoPedido
group by c.CodigoCliente
having sum(dp.Cantidad*dp.Preciounidad)>1000;

/* 44) Por cada categoría, precio máximo, mínimo y medio de sus productos. De las categorías con menos de 10 productos*/
select p.Gama, max(p.Precioventa),min(p.PrecioVenta),avg(p.PrecioVenta),count(p.CodigoProducto)
from productos p
group by p.Gama
having count(p.CodigoProducto)<10;

/* 45) Fecha del primer pedido de cada cliente que haya hecho algún pedido en el 2008 o después */

select CodigoCliente, min(FechaPedido), max(FechaPedido)
from pedidos
group by CodigoCliente
having year(max(FechaPedido))>=2008;

/* 46) Nombre completo del empleado y número de clientes que
 tiene a su cargo de los empleados que trabajen
 en oficinas de Madrid o Barcelona y tengan al menos tres clientes */
select concat(e.Nombre,' ',e.Apellido1,' ',e.Apellido2)"Nombre empleado", count(*)
from empleados e inner join clientes c on e.codigoempleado=c.CodigoEmpleadoRepVentas inner join oficinas o on e.CodigoOficina=o.codigooficina
where o.Ciudad="Barcelona" or o.ciudad="Madrid"
group by e.CodigoEmpleado
having count(*)>=3;

/* SUBCONSULTA*/
/* 49) Pedidos que se realizaron en la fecha en que se realizó algún pago */

Select distinct p.*
From pedidos p inner join pagos pa on p.FechaPedido=pa.FechaPago
