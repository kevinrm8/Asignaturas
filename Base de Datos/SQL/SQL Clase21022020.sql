/* REPASO EXAMEN */

/* Ejemplo clase, buscar ciudad donde no hay clientes*/
/* 
select from  
Where 'ciudad' NOT IN ( 'Barcelona','Madrid','Valencia')



select *
from pedidos
where FechaPedido in (select FechaPago from pagos);

52) Selecciona oficinas situadas en ciudades donde no está ubicado ningún cliente. 
select *
from oficinas
where ciudad not in (select ciudad from clientes);

53) Nombre completo de los empleados que no sean jefes 
select *
	from empleados
	where CodigoEmpleado not in (select codigoJefe from empleados where codigojefe is not null) ;
54) Nombre y precio del producto más caro
select PrecioVenta,Nombre
	from productos
	where PrecioVenta in (select max(PrecioVenta) from productos);
     LO MISMO QUE ANTES PERO MAS BAJO 
select  PrecioVenta"DINERO RICO",Nombre"MY NAME IS"
	from productos
	where PrecioVenta in (select min(PrecioVenta) from productos);
    
select *
    from productos
    where PrecioVenta = any(select precioventa from productos where gama like "Herramientas");
55) Precio de los productos que tienen un precio de venta mayor al del precio medio de cualquier gama 
select *
	from productos
    where PrecioVenta >all (select avg(PrecioVenta) from productos group by gama);
 56) Datos del empleado que tiene más clientes 
select e.*,count(*)
	from clientes c inner join empleados e on c.CodigoEmpleadoRepVentas=e.CodigoEmpleado
    group by CodigoEmpleadoRepVentas
    having count(*)>=all(select count(*) from clientes group by CodigoEmpleadoRepVentas);
    */
/* 56) Datos de la Gama que tiene menos productos 

select gamasproductos.*, count(*)
from productos inner join gamasproductos on productos.gama=gamasproductos.Gama
group by gamasproductos.gama, descripciontexto, descripcionhtml, imagen
having count(*) <= all(select count(*)from productos
group by gama) */

/* 57) Datos del pedido más barato */
select p.*, sum(Cantidad*PrecioUnidad)
from detallepedidos d inner join pedidos p on d.CodigoPedido=p.CodigoPedido
group by p.CodigoPedido
having sum(cantidad*PrecioUnidad) <=all(select sum(cantidad*PrecioUnidad) 
										from detallepedidos
										group by CodigoPedido);
