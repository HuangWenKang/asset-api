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
@Table(name = "PLCLIP")
public class Clip {

	@Id
	private String id;
	@Column(name = "course_id")
	private String courseId;	
	
	@Column(name = "module_id")
	private String moduleId;
	private String title;		
	private String duration;		
	private String playerUrl;		
	private boolean isFinished;
	
}
