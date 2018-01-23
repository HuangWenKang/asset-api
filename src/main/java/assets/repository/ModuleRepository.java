package assets.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import assets.model.entity.ps.Module;

public interface ModuleRepository extends PagingAndSortingRepository<Module, String>, JpaSpecificationExecutor<Module> {

	List<Module> findByIsFinished(boolean isFinished);

}
