package br.com.projuris;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesafioApplication.class)
public class TestMyFindArray {

	private MyFindArray teste = new MyFindArray();

	@Test
	public void testFindArray1() {

		int[] array = { 4, 9, 3, 7, 8 };
		int[] subArray = { 3, 7 };

		assertEquals("Deveria ser 2", 2, teste.findArray(array, subArray));
	}

	@Test
	public void testFindArray2() {
		
		int[] array = {1,3,5};
		int[] subArray = {1};
		
		assertEquals("Deveria ser 0", 0, teste.findArray(array, subArray));	

	}
	@Test
	public void testFindArray3() {
		
		int[] array = {7,8,9};
		int[] subArray = {8,9,10};
		
		assertEquals("Deveria ser -1", -1, teste.findArray(array, subArray));	

	}
	@Test
	public void testFindArray4() {
		
		int[] array = {4,9,3,7,8,3,7,1};
		int[] subArray = {3,7};
		
		assertEquals("Deveria ser 5", 5, teste.findArray(array, subArray));	

	}
}
