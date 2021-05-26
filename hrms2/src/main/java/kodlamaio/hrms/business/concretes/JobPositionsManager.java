package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstacts.JobPositionService;

import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.core.utilities.results.SuccesDataResult;

import kodlamaio.hrms.dataAccess.abstacts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service //  bu kısımda verilen servisleri kullanmaya yarıyor update,delete gibi
//bu projenin ervis görevi göreceğini söylüyoruz


public class JobPositionsManager implements JobPositionService{

	
	private JobPositionDao jobPositionDao;
	@Autowired// burası bize arka tarafta otomatik new'leme yapıyor 
	
	/* bu constructoru koyuyoruz çünkü başka bir dao gelirse bu kısımda tekrar Autowired yazmak yerine tek bir Autowired
	 ile bunu daha kolay yapıyoruz*/ 
	
	public JobPositionsManager(JobPositionDao jobPositionsDao) {
		this.jobPositionDao = jobPositionsDao;
		
	};
	
	
	@Override
	 public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();}



	@Override
	public DataResult<JobPosition> add(JobPosition jobPositon) {
        return new SuccesDataResult<JobPosition>(this.jobPositionDao.save(jobPositon),"iş pozisyonu eklendi");
    }
}



	//Entities'ten dataAccess'e, dataAccess'ten de JobPositions'a ulaştık
