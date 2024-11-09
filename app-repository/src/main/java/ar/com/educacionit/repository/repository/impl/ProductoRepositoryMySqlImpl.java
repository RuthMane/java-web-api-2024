package ar.com.educacionit.repository.repository.impl;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repository.ProductoRepository;

public class ProductoRepositoryMySqlImpl implements ProductoRepository{

	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductoDTO getById(Long id) {
		// TODO Auto-generated method stub
		
		String sql = "Select * from producto where id="+id;
		System.out.println(sql);
		//simulo que obtengo los datos de la DB
		Long _id= id;
		String titulo="producto simulado desde la db";
		Double precio= 1500.75d;
		
		//instancia mi ProductoDto
		
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
