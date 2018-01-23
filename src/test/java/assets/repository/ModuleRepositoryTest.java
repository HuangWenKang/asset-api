package assets.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import assets.PersistenceApplication;
import assets.model.entity.ps.Module;
import assets.repository.ModuleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistenceApplication.class)
@TestPropertySource(locations = "classpath:persistence-test.properties")
public class ModuleRepositoryTest {

	@Autowired
	private ModuleRepository moduleRepository;

	@Test
	public void testFindByOrderNo() {
		List<Module> modules = moduleRepository.findByIsFinished(false);
		Assert.assertTrue(modules.size() > 0);
	}

}
