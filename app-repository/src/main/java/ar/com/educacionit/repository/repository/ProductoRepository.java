package ar.com.educacionit.repository.repository;

import ar.com.educacionit.repository.dtos.ProductoDTO;

public interface ProductoRepository {

	
	// Creo el CRUD
	public void save(ProductoDTO entity);
	public ProductoDTO getById(Long id);
	
	public ProductoDTO update(ProductoDTO entity);
	
	//PARA el DELETE, podemos escribir el WHERE id antes para no borrar toda la BD

	public ProductoDTO delete(Long id);  //o puedo hacer public void delete(Long id);SI QUIERO DEVOLVER EL OBJETO QUE BORRE
	
}
