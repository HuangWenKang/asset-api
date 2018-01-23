package assets;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import assets.model.entity.ps.Module;

@EnableJpaAuditing
@SpringBootApplication
@EntityScan(basePackageClasses=Module.class)
public class PersistenceApplication {

}
