package coml.mahade.springBoot.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	
	@RequestMapping("/hello")
	public String sayHi() 
	{
		return "Hi";
		
	}
	
	

}
