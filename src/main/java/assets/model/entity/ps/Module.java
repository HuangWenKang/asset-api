package assets.model.entity.ps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PLMODULE")
public class Module {

	@Id
	private String id;
	@Column(name = "course_id")
	private String courseId;		
	private String title;		
	private String duration;		
	private String playerUrl;		
	private boolean isFinished;
}
