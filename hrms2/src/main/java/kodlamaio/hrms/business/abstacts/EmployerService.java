package kodlamaio.hrms.business.abstacts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	  List<Employer> getAll();
	 DataResult<Employer> add(Employer employer);
	  

}
