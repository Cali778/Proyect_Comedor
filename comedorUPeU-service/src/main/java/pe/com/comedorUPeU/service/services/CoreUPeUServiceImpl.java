package pe.com.comedorUPeU.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.comedorUPeU.core.dao.CoreDAO;
//import pe.com.comedorUPeU.core.dao.MaintainDAO;
import pe.com.comedorUPeU.core.domain.Proveedor;
import pe.com.comedorUPeU.core.domain.StatusProveedor;

@Service("coreUPeUService")
public class CoreUPeUServiceImpl {

	@Autowired
	private CoreDAO coreDAO;
	
//	@Autowired
//	private MaintainDAO maintainDAO;
	
	
	public List<Proveedor> findProveedor(){
		return coreDAO.findProveedor();
	}
	
	public List<StatusProveedor> findStatusProveedor(){
		return coreDAO.findStatusProveedor();
	}
	
	public Proveedor findProveedorById(Long id){
		return coreDAO.findProveedorById(id);
	}
	
	public void updateProveedor(Proveedor proveedor){
		coreDAO.updateProveedor(proveedor);
	}
	
	public void saveProveedor(Proveedor proveedor){
		if(proveedor.getId()== null){
			coreDAO.saveProveedor(proveedor);
		}else{
			coreDAO.updateProveedor(proveedor);
		}
	}
	
	public void deleteProveedor(Proveedor proveedor){
		
		coreDAO.deleteProveedor(proveedor);
		
	}

	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
