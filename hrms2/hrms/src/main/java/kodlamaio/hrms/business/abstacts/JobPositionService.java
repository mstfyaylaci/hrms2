package kodlamaio.hrms.business.abstacts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	  //jobpositiondaki verileri çekiyoruz ,döndürüyoruz

	 List<JobPosition>getAll();
	    DataResult<JobPosition> add(JobPosition jobPosition);
}
