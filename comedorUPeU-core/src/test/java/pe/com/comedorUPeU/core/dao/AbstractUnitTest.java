package pe.com.comedorUPeU.core.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"pe/com/comedorUPeU/core/config/application-config.xml",
				"pe/com/comedorUPeU/core/config/applicationContext-dao.xml"
//				"pe/com/peruInka/service/config/applicationContext-service.xml"
//				"com/goolstar/core/config/applicationContext-dao.xml",
//				"com/goolstar/core/config/applicationContext-service.xml",
//				"com/goolstar/core/config/applicationContext-emailservice.xml", 
			};
	}

	public void testApp() {
		assertTrue(true);
		
	}

}