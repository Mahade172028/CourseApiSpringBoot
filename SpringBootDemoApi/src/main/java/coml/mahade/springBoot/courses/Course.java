package coml.mahade.springBoot.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import coml.mahade.springBoot.topics.Topic;

@Entity
public class Course {
	
	@Id
    private String id;
    private String  name;
    private String description;
    
    @ManyToOne
    private Topic topic;
    
    public Course() {
    	
    }
     
    public Course(String id, String name, String description,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(topicId,"","");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public void setTopic(Topic topic) 
	{ 
		this.topic = topic;
	}
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
}
