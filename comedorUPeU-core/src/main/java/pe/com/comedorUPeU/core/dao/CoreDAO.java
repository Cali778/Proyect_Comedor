package pe.com.comedorUPeU.core.dao;

import java.util.List;

import pe.com.comedorUPeU.core.domain.Producto;
import pe.com.comedorUPeU.core.domain.Proveedor;
import pe.com.comedorUPeU.core.domain.StatusProducto;
import pe.com.comedorUPeU.core.domain.StatusProveedor;

public interface CoreDAO {
	
	List<Proveedor> findProveedor();
	
	List<StatusProveedor> findStatusProveedor();
	
	void saveProveedor(Proveedor proveedor);
	
	Proveedor findProveedorById(Long id);
	
	void updateProveedor(Proveedor proveedor);
	
	void deleteProveedor(Proveedor proveedor);
	
	////////////////////////////////////////////////
	
	 List<Producto> findAllProducto();
	 
	 void saveProducto(Producto producto);
	 
	 List<StatusProducto> findAllStatusProducto();
	 
	 void updateProducto(Producto producto);
	 
	 Producto findProductoById(Long id);
	 
	 void deleteProducto(Producto producto);
	 
	 
	 
	
	
	
	

}
