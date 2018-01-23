package assets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import assets.model.entity.ps.Course;
import assets.model.entity.ps.Module;
import assets.repository.CourseRepository;




@SpringBootApplication
@RestController
public class SpringBootDataApplication {
	


	
	
	@Autowired
	private CourseRepository courseRepository;
	
	@RequestMapping("/courses")
	public List<Course> courses(){
		Sort sort = new Sort(Direction.DESC, "id");
		int page = 0;
		int size = 100;
		Pageable pageable = new PageRequest(page, size, sort);
		Page<Course> courses = courseRepository.findByIsFinished(false, pageable);
		return courses.getContent();
		
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}
