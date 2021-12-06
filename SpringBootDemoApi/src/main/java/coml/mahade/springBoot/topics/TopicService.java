package coml.mahade.springBoot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	@Autowired
	private TopicRepository topicRepository;
	
	/*
	 * private List<Topic> topics=new ArrayList<>(Arrays.asList( new
	 * Topic("spring","spring framework","spring framwork description"), new
	 * Topic("java","java framework","java framwork description"), new
	 * Topic("python","python framework","python framwork description")
	 * 
	 * ) );
	 */
	

	public List<Topic> getAllTopics()
	{
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		
		return topics;
	}
	
	
	public Topic getTopic(String id)
	{
		
		
		return topicRepository.findById(id).get();
		
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	
	public void addTopic(Topic topic) 
	{
		topicRepository.save(topic);
	}


	public void updateTopic(String id,Topic topic)
	{
		topicRepository.save(topic);
		
		/*
		 * for(int i=0;i<topics.size();i++) { Topic t=topics.get(i);
		 * 
		 * if(id.equals(t.getId())) { topics.set(i,topic); return; } }
		 */
		
	}


	public void deleteTopic(String id) {
		
		topicRepository.deleteById(id);
		
		//topics.removeIf(t->t.getId().equals(id));
		
	}
}
