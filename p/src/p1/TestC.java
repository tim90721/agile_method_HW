package p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestC {

	@Test
	public void testC1(){
		assertNotNull(new C());
	}
	
	@Test
	public void testC2(){
		assertEquals(3, new C().a);
	}
	
	@Test
	public void testAdd1(){
		assertEquals(9, new C().add(6));
	}
	
	@Test
	public void testAdd2(){
		assertEquals(-2, new C().add(-5));
	}
	
	@Test
	public void testAdd3(){
		assertEquals(3, new C().add(0));
	}
}
