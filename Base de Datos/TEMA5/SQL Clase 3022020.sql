/* EJERCICIO 18*/
select concat(e.Nombre, ' ',e.Apellido1, ' ', e.Apellido2)"Datos Empleados",concat(j.Nombre, ' ', j.Apellido1, ' ', j.Apellido2)"Datos Jefe"
from empleados e inner join empleados j on e.CodigoJefe = j.CodigoEmpleado;

/* EJERCICIO 
19) Empleados (nombre completo) que trabajen en la oficina 'SYD-AU' o que tengan  el cargo de “Representante de Ventas” cuyo jefe se llame “Amy” */
SELECT concat(e.Nombre,' ',e.Apellido1,' ',e.Apellido2)"Datos Empleados", e.Puesto
from empleados e inner join empleados j on j.CodigoEmpleado = e.CodigoJefe
Where e.CodigoOficina = "SYD-AU" or (e.Puesto = "Representante Ventas" and j.Nombre="Amy");

/* LAS DOS FORMAS SON VALIDAS, LA DE ABAJO ES DE LUCIA*/
Select e.nombre,e.codigoOficina,e.puesto,j.Nombre,j.codigooficina,j.puesto
from empleados e inner join empleados j on e.CodigoJefe=j.CodigoEmpleado
Where j.Nombre like "Amy" and e.puesto like "Representante Ventas" or e.CodigoOficina like 'SYD-AU';

/* 20) Oficinas de España que no empiecen por B que tengan clientes de en la misma ciudad o en distinto país */

Select /* o.CodigoOficina,o.Pais, o.Ciudad,c.CodigoCliente,c.Pais,c.Ciudad */ distinct o.CodigoOficina,o.pais, o.Ciudad /* Para que solo muestre una oficina y no se repite */
from oficinas o inner join empleados e on o.CodigoOficina = e.CodigoOficina inner join clientes c on e.CodigoEmpleado=c.CodigoEmpleadoRepVentas
where o.Pais in('Spain','España') and o.CodigoOficina not like 'B%' and (o.ciudad=c.Ciudad or o.pais<>c.pais)
