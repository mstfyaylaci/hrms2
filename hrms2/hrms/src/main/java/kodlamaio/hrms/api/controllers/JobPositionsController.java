package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstacts.JobPositionService;
import kodlamaio.hrms.core.utilities.Result;

import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController // telefon pc tv neresi olursa olsun uyum sağlamaya yarıyor
//sen bir controllersın demek her katmanda iş yapacaksın

@RequestMapping("/api/jobpositions") // hangi yola erişeceğemizi gösteriyouz

public class JobPositionsController {
	
	private JobPositionService jobPositionService;

	@Autowired // arka planda JobPositionsSrvice için gelen menageri newler ve referansını tutar 
	public JobPositionsController(JobPositionService jobPositionService) {
		
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		// JobPositionsService.getAll() derken, bu servicenin referansını tuttuğu yerden çekiyoruz getAll()'ı
		
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody JobPosition jobPositon) {
		
		return jobPositionService.add(jobPositon);
	}

}
