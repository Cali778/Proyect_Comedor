package pe.com.comedorUPeU.core.dao;

import java.util.List;

import pe.com.comedorUPeU.core.domain.Producto;
import pe.com.comedorUPeU.core.domain.Proveedor;
import pe.com.comedorUPeU.core.domain.StatusProducto;
import pe.com.comedorUPeU.core.domain.StatusProveedor;

public class CoreDAOImpl extends BaseDAOHibernate implements CoreDAO {
	
	
	
	public void saveProveedor(Proveedor proveedor){
		save(proveedor);
	}

	public Proveedor findProveedorById(Long id) {
		// TODO Auto-generated method stub
		return findById(Proveedor.class, id);
	}

	public void updateProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		update(proveedor);
	}

	public void deleteProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		delete(proveedor);
	}

	public List<Proveedor> findProveedor() {
		// TODO Auto-generated method stub
		return find(Proveedor.class,"from Proveedor");
	}

	public List<StatusProveedor> findStatusProveedor() {
		// TODO Auto-generated method stub
		return find(StatusProveedor.class,"from StatusProveedor");
	}
/////////////////////////////////////////////////////////////////////////////
	
	
	public List<Producto> findAllProducto(){
		return find(Producto.class,"from Producto");
		
	}
	
	public List<StatusProducto> findAllStatusProducto(){
		return find(StatusProducto.class,"from StatusProducto");
	}
	
	public void saveProducto(Producto producto){
		save(producto);
	}

	public void updateProducto(Producto producto) {
		// TODO Auto-generated method stub
		update(producto);
	}

	public Producto findProductoById(Long id) {
		// TODO Auto-generated method stub
		return findById(Producto.class, id);
	}

	public void deleteProducto(Producto producto) {
		// TODO Auto-generated method stub
		delete(producto);
	}

}


//	public void testFindAllProducto() {
//		// TODO Auto-generated method stub
//		
//	}


