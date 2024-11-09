<%@page import="ar.com.educacionit.repository.dtos.ProductoDTO" %>
<html>
   <head>
   </head>
   <body>
   <% 
   //obtiene o baja el dato de sesion(el objeto sesion existe de manera implicita en las jsp)
   //debo castear el object a mi ProdDTO
   ProductoDTO producto = (ProductoDTO)session.getAttribute("PRODUCTO"); 
   
   %>
   <div>
   	<label>ID:</label><%= producto.getId() %>
   <label>Precio:</label> <%= producto.getPrecio() %>
   <label>T&iacute;tulo:</label> <%= producto.getTitulo() %>
   </div>
    	
   </body>

</html>