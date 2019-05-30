package br.com.projuris;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DesafioApplication.class)
@RunWith(SpringRunner.class)
public class TestMyFindChar {
	
	private MyFindChar teste = new MyFindChar();
	
	@Test
	public void testFindChar1() {
		assertEquals("Deveria ser 't'", 't', teste.findChar("stress"));		
	}
	@Test
	public void testFindChar2() {
		assertEquals("Deveria ser 'm'", 'm', teste.findChar("reembolsar"));		
	}
	@Test
	public void testFindChar3() {
		assertEquals("Deveria ser ' '", ' ', teste.findChar("aabbcc"));		
	}

}
