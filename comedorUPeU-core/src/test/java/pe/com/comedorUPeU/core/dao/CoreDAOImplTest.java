package pe.com.comedorUPeU.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.comedorUPeU.core.domain.Producto;
import pe.com.comedorUPeU.core.domain.Proveedor;
import pe.com.comedorUPeU.core.domain.StatusProducto;
import pe.com.comedorUPeU.core.domain.StatusProveedor;


public class CoreDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected CoreDAO coreDAO;
//	List<Person> findAllPerson();
//	void savePerson(Person person);
	
	public void testFindAllPerson(){
		System.out.println(":::"+coreDAO);
	}
	
	public void testFindProveedor(){
		System.out.println(":::"+ coreDAO.findProveedor());
	}
	
	public void testSaveProveedor(){
		Proveedor proveedor = new Proveedor();
		proveedor.setRuc("12345654321");
		proveedor.setEnterpriceName("la mansion xD");
		proveedor.setAdress("jr: los mayritos");
		proveedor.setPhone("984583643");
		
		StatusProveedor statusProveedor = new StatusProveedor();
		statusProveedor.setTypeCode(StatusProveedor.Status.PROVEEDOR_ACT.toString());
		proveedor.setStatusProveedor(statusProveedor);
		
		coreDAO.saveProveedor(proveedor);
		setComplete();
		
	}
	public void testFindAllProducto(){
		System.out.println(":::"+ coreDAO.findAllProducto());
	}
	public void testSaveProducto(){
		
		Producto producto= new Producto();
		producto.setDescripcionProducto("leche");
		producto.setTipoProducto("lacteos");
		producto.setUnidadMedida("litros");
		producto.setComentario("asdasd");
		
		
		StatusProducto statusProducto= new StatusProducto();
		statusProducto.setTypeCode(StatusProducto.Status.PRODUCTO_ACT.toString());
		producto.setStatusProducto(statusProducto);
		
		Proveedor proveedor = new Proveedor();
		proveedor.setRuc("12345654321");
		proveedor.setEnterpriceName("la mansion xD");
		proveedor.setAdress("jr: los mayritos");
		proveedor.setPhone("984583643");
		
		StatusProveedor statusProveedor = new StatusProveedor();
		statusProveedor.setTypeCode(StatusProveedor.Status.PROVEEDOR_ACT.toString());
		proveedor.setStatusProveedor(statusProveedor);
		
		coreDAO.saveProducto(producto);
		setComplete();
	}
	
	
	
	
	
	
	


}
