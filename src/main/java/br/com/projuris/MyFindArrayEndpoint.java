package br.com.projuris;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFindArrayEndpoint {
	
	private MyFindArray myFindArray = new MyFindArray();
	
	@GetMapping("/findArray")
	public Integer findArrayEndpoint(@RequestParam int[] array, @RequestParam int[] subArray) {
		
		return myFindArray.findArray(array, subArray);
		
	}

}
