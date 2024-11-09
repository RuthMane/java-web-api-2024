package ar.com.educacion.services;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repository.ProductoRepository;
import ar.com.educacionit.repository.repository.impl.ProductoRepositoryMySqlImpl;

public class ProductoServiceImpl  implements ProductoService{

	//implemento todos los metodos de la interface (CTRL+SPACE  me da una lista de otras opciones tambien)
	
	//EStoy definiendo un atributo de tipo interface: ProductoRepository
	private ProductoRepository repository; 
	
	public ProductoServiceImpl() {
		inyectarClases();
	}
	public void inyectarClases() {
		this.repository = new ProductoRepositoryMySqlImpl();
	}
	
	@Override
	public ProductoDTO getById(Long id) {
		// AHORA SI, ACCEDO A LA DM POR MEDIO DEL REPOSITORY
		
		return this.repository.getById(id);
	}
	
	
	
	
}
