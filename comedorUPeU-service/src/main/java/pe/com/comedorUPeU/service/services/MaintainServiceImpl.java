package pe.com.comedorUPeU.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.comedorUPeU.core.dao.MaintainDAO;

@Service("maintainService")
public class MaintainServiceImpl {

	@Autowired
	private MaintainDAO maintainDAO;

}
