package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstacts.EmployeeService;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.dataAccess.abstacts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	@Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
		
		this.employeeDao = employeeDao;
	}

			


	@Override
	public DataResult<Employee> admin(Employee employee) {

		return null;
	}




	@Override
	public List<Employee> getAll() {

		return this.employeeDao.findAll();
	}

}
