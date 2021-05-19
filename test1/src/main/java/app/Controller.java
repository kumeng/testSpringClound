package app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/demo")
public class Controller {


//	@RequestMapping("/getMember1")
	@GetMapping("/getMember1")
	public String getMember1(){
		return  "hello";
	}

//	@Autowired
//	RestTemplate restTemplate;
//
//	public List<String> getOrderByUserList() {
//		return restTemplate.getForObject("http://service-member/getUserList", List.class);
//	}	
}
