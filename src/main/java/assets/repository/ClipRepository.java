package assets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import assets.model.entity.ps.Clip;

public interface ClipRepository extends PagingAndSortingRepository<Clip, String>, JpaSpecificationExecutor<Clip> {

	List<Clip> findByIsFinished(boolean isFinished);

}
