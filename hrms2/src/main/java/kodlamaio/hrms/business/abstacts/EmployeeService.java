package kodlamaio.hrms.business.abstacts;




import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employee;


import java.util.List;
public interface EmployeeService {

	 DataResult<Employee> admin(Employee employee);
	    List<Employee> getAll();
}
