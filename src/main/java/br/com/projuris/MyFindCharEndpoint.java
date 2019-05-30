package br.com.projuris;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFindCharEndpoint {

	private MyFindChar myFindChar = new MyFindChar();

	@GetMapping("/findChar")
	public char findCharEndpont(@RequestBody String work) {

		return myFindChar.findChar(work);

	}

}
