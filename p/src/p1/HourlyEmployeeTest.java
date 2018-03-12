package p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HourlyEmployeeTest {
	
	HourlyEmployee hourly;
	
	public static void main(String[] args){
//		Result result = runClasses(Hourly)
	}
	
	@Test
	public void test1() {
		hourly = new HourlyEmployee("terry", 41, 20.00);
		System.out.println(hourly.getRegulayPay());
		assertEquals(800.00, hourly.getRegulayPay(), 0.001);
		assertEquals(30.00, hourly.getOvertimePay(), 0.001);
		assertEquals(830.00, hourly.getGrossPay(), 0.001);
	}
	
	@Test
	public void test2(){
		hourly = new HourlyEmployee("andres", 39, 10.00);
		assertEquals(390.00, hourly.getRegulayPay(), 0.001);
		assertEquals(0.00, hourly.getOvertimePay(), 0.001);
		assertEquals(390.00, hourly.getGrossPay(), 0.001);
	}
	
	@Test
	public void test3(){
		hourly = new HourlyEmployee("beth", 40, 20.00);
		assertEquals(800.00, hourly.getRegulayPay(), 0.001);
		assertEquals(0.00, hourly.getOvertimePay(), 0.001);
		assertEquals(800.00, hourly.getGrossPay(), 0.001);
	}
	
	@Test
	public void test4(){
		hourly = new HourlyEmployee("karen", 50, 10.00);
		assertEquals(400.00, hourly.getRegulayPay(), 0.001);
		assertEquals(150.00, hourly.getOvertimePay(), 0.001);
		assertEquals(550.00, hourly.getGrossPay(), 0.001);
	}
}
