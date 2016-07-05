package pe.com.comedorUPeU.core.dao;

import org.springframework.beans.factory.annotation.Autowired;


public class MaintainDAOImplTest extends AbstractUnitTest {

	@Autowired
	protected MaintainDAO maintainDAO;
//	List<Person> findAllPerson();
//	void savePerson(Person person);
	
	public void testFindAllPerson(){
		System.out.println(":::"+maintainDAO);
	}
}
