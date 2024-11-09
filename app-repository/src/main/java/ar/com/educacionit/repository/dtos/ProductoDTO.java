package ar.com.educacionit.repository.dtos;

public class ProductoDTO {
	
	private Long id;
	private String titulo;
	private Double precio;
	
	public ProductoDTO(Long id,
			String titulo,
			Double precio) {
		setId(id);
		setTitulo(titulo);
		setPrecio(precio);
	}

	private void setId(Long id) {
		if(id==null || id<0) {
			throw  new IllegalArgumentException("Id no puede ser nulo ni <0");
		}
		this.id=id;
	}

	private void setTitulo(String titulo) {
		if(titulo=="") {
			throw new IllegalArgumentException("Titulo no puede estar vacio");
			
		}
		this.titulo=titulo;
	}
	
	private void setPrecio(Double precio) {
		//guards
		if(precio==null || precio<0) {
			throw new IllegalArgumentException("Precio no puede ser nulo ni <0 ");
		}
		this.precio=precio;
	}

	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "ProductoDTO {id:" + id + ", titulo:" + titulo + ", precio:" + precio + "}";
	}
	
	//alt+shift+S   ---para despliegar el source que nos conduce a los setters y getters
	
	
	
}
