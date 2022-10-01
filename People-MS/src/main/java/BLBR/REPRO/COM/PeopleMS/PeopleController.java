package BLBR.REPRO.COM.PeopleMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
	
		@GetMapping("/")
		public String index() {
				return "Hello, World!";
		}
		
}