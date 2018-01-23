package assets.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import assets.model.entity.ps.Course;



public interface CourseRepository extends PagingAndSortingRepository<Course, String>, JpaSpecificationExecutor<Course> {

	List<Course> findByIsFinished(Boolean isFinished);

	Page<Course> findByIsFinished(Boolean isFinished, Pageable pageable);

}
