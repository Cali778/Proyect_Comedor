package pe.com.comedorUPeU.core.domain;

import java.io.Serializable;

public class Producto extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String descripcionProducto;
	private String tipoProducto;
	private String unidadMedida;
	private String comentario;
	private StatusProducto statusProducto;
	
	
	
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public StatusProducto getStatusProducto() {
		return statusProducto;
	}
	public void setStatusProducto(StatusProducto statusProducto) {
		this.statusProducto = statusProducto;
	}

	
}
