select *
from productos p1
where precioventa not in (select precioventa from productos p2
								where p1.CodigoProducto<>p2.CodigoProducto);