package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Centuryfromyeartest {

	private Centuryfromyear centuryfromyear;
	
	@Before
	public void setup(){
		centuryfromyear=new Centuryfromyear();
	}
	
	@Test
	public void test1() {
		assertEquals(20,centuryfromyear.solution(1905));
	}
	@Test
	public void test2() {
		assertEquals(17,centuryfromyear.solution(1700));
	}
	@Test
	public void test3() {
		assertEquals(20,centuryfromyear.solution(1988));
	}
	@Test
	public void test4() {
		assertEquals(20,centuryfromyear.solution(2000));
	}
	@Test
	public void test5() {
		assertEquals(21,centuryfromyear.solution(2001));
	}
	@Test
	public void test6() {
		assertEquals(2,centuryfromyear.solution(200));
	}

}
