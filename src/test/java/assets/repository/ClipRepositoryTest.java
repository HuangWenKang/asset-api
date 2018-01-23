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
import assets.model.entity.ps.Clip;
import assets.repository.ClipRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistenceApplication.class)
@TestPropertySource(locations = "classpath:persistence-test.properties")
public class ClipRepositoryTest {

	@Autowired
	private ClipRepository clipRepository;

	@Test
	public void testFindByOrderNo() {
		List<Clip> clips = clipRepository.findByIsFinished(true);
		Assert.assertTrue(clips.size() > 0);
	}

}
