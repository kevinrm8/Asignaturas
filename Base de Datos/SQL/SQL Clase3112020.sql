/* 12) *   
SELECT DISTINCT o.LineaDireccion1, o.CodigoOficina,CodigoEmpleado
from Oficinas o inner join empleados e on o.CodigoOficina = e.CodigoEmpleado

/* */

SELECT O.*
FROM Clientes C Inner join Empleados E ON C.codigoEmpleadoRepVentas = E.CodigoEmpleado Inner Join Oficinas O On E.CodigoOficina = O.CodigoOficina
Where O.Pais = "EEUU" AND C.Ciudad = 'San Francisco';