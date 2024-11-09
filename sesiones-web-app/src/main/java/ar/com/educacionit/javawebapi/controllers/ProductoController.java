package ar.com.educacionit.javawebapi.controllers;

import java.io.IOException;

import ar.com.educacion.services.ProductoService;
import ar.com.educacion.services.ProductoServiceImpl;
import ar.com.educacionit.repository.dtos.ProductoDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 1- Convierto en WebServlet
@WebServlet("/api/producto")

public class ProductoController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, //viene todos  los parametro del front
			HttpServletResponse resp)
	throws ServletException, IOException {
		
		
		// BUSCA un producto en la DB por su Id
		//capturo parametro dese el req
		String id =req.getParameter("id");
		Long idL= Long.parseLong(id);
		
		//super.doGet(req, resp); Borrado
		//Ahora instancio el service
		ProductoService service = new ProductoServiceImpl();
		
		//Obtengo el producto usando el servicio
		ProductoDTO productoDTO = service.getById(idL);
		
		//propio de los servlet para escribir en el response
		//resp.getWriter().print(productoDTO.toString());
		
		//Guarda en la sesion el objeto de la DB
		req.getSession().setAttribute("PRODUCTO", productoDTO);
		
		//redirect
		getServletContext().getRequestDispatcher("/datos.jsp").forward(req, resp);
		
	}
}
