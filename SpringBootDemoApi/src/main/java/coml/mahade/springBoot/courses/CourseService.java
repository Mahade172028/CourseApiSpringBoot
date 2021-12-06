package coml.mahade.springBoot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	/*
	 * private List<Topic> topics=new ArrayList<>(Arrays.asList( new
	 * Topic("spring","spring framework","spring framwork description"), new
	 * Topic("java","java framework","java framwork description"), new
	 * Topic("python","python framework","python framwork description")
	 * 
	 * ) );
	 */
	

	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses=new ArrayList<>();
        courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		
		return courses;
	}
	
	
	public Course getCourse(String id)
	{
		
		
		return courseRepository.findById(id).get();
		
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	public void addCourse(Course course) 
	{
		courseRepository.save(course);
	}


	public void updateCourse(String id,Course course)
	{
		courseRepository.save(course);
		
		/*
		 * for(int i=0;i<topics.size();i++) { Topic t=topics.get(i);
		 * 
		 * if(id.equals(t.getId())) { topics.set(i,topic); return; } }
		 */
		
	}


	public void deleteCourse(String id) 
	{
		
		courseRepository.deleteById(id);
		
		//topics.removeIf(t->t.getId().equals(id));
		
	}
}
