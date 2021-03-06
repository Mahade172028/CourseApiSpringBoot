package coml.mahade.springBoot.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coml.mahade.springBoot.topics.Topic;

@RestController
public class CourseController
 {
	
	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping("topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable("topicId") String topicId) 
	{
		
		return courseService.getAllCourses(topicId);
		
	}
	
	@RequestMapping("topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable("id") String id )
	{
		
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value="/topics/{topicId}/courses" ,method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course,@PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		
		courseService.addCourse(course);
		
		
	}
	
	
	@RequestMapping(value="topics/{topicId}/courses/{id}" ,method=RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course,@PathVariable("id") String id,@PathVariable("topicId") String topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(id,course);
		
		
	}
	

	@RequestMapping(value="topics/{topicId}/courses/{id}" ,method=RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("id") String id)
	{
		
		courseService.deleteCourse(id);
		
		
	}
	

}

