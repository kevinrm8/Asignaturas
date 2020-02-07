/* 23) Precio máximo, mínimo y medio de los productos para los que se haya realizado algún pedido en 2008 
select max(PrecioVenta),min(PrecioVenta),avg(PrecioVenta)
from productos p inner join detallepedidos dp on p.CodigoProducto=dp.CodigoProducto inner join pedidos pe on dp.CodigoPedido =pe.CodigoPedido
where pe.FechaPedido like "2008%";

/* 24) Fecha del primer y el último pedido. 
select max(FechaPedido),min(FechaPedido)
from pedidos ;

/* 25) Número de pedidos realizados en 2006 y fecha del primer pedido en ese año. 
select count(*),min(FechaPedido)
from pedidos p where p.FechaPedido like "2006%";

/* 26) Importe del pedido de CodigoPedido 0001 *
select sum(Cantidad*PrecioUnidad)
from pedidos p inner join detallepedidos dp on p.CodigoPedido=dp.CodigoPedido
where p.CodigoPedido="0001%";

/* 27) Importe total de los pagos realizados por el cliente de nombre “Tendo Garden”. 
select NombreCliente,sum(Cantidad)
from clientes c inner join pagos p on c.CodigoCliente=p.CodigoCliente
where c.NombreCliente="Tendo Garden";

/*28) Importe total del pedido de código 15.
select sum(Cantidad*PrecioUnidad)
from pedidos p inner join detallepedidos dp on p.CodigoPedido=dp.CodigoPedido
where p.CodigoPedido="15%";

/* 33) Número de pedidos que ha hecho cada cliente (sólo CódigoCliente) 
Select CodigoCliente, count(*)
from pedidos
group by CodigoCliente;

/* 34) Número de pedidos que ha hecho cada cliente viendo el nombre y la dirección del cliente 

select count(p.CodigoPedido),NombreCliente,LineaDireccion1
from Clientes c inner join pedidos p on c.CodigoCliente=p.CodigoCliente
group by c.CodigoCliente;

/* 35) Por cada gama, precio máximo, mínimo y medio de sus productos 
select gama"Categoria", max(PrecioVenta),min(PrecioVenta),avg(PrecioVenta)
from productos
group by gama; */

/* 36) Fecha del primer pedido de cada cliente 
select min(FechaPedido)"Fecha primer pedido",NombreCliente
from clientes c inner join pedidos p on c.CodigoCliente=p.CodigoCliente
group by c.CodigoCliente
order by FechaPedido /* Para ordenarlo */

/*37) Importe total de cada pedido */

select p.CodigoPedido, sum(cantidad*PrecioUnidad)"Precio Total"
from pedidos p inner join detallepedidos dp on p.CodigoPedido=dp.CodigoPedido
group by CodigoPedido
order by 2 desc /* Con el 2 se ordena por la segunda columna */
