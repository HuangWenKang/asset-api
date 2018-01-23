package assets.model.entity.ps;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PLCOURSE")
public class Course {

	@Id
	private String id;	
	private String publishedOn;
	private String updatedOn;
	private String title;
	private String shortDescription;
	private String description;
	private String level;
	private String duration;
	private Integer popularityScore;
	private Boolean hasTranscript;
	private Boolean hasAssessment;
	private Boolean hasLearningCheck;
	private String playerUrl;
	private String skillPaths;
	private Boolean isRetired;
	private String reason;
	private String replacementId;
	private Float average;
	private Integer ratersCount;	
	private String audiences;
	private Boolean isFinished;	
}
