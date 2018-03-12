package p1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
//		m.HW4P3();
//		m.HW4P4();
		m.HW4P6();
		m.HW4P7();
	}
	
	public void HW4P1P2(){
		int[] a = new int[] { 3, 1, 4, 2 };
		Integer[] b = new Integer[4];
		b[0] = new Integer(1);
		b[1] = new Integer(2);
		b[2] = new Integer(3);
		b[3] = new Integer(4);
		ArrayList<Integer> c = new ArrayList<Integer>();
		LinkedList<Integer> d = new LinkedList<Integer>();
		c.add(4);
		c.add(3);
		c.add(2);
		c.add(1);
		d.add(2);
		d.add(4);
		d.add(1);
		d.add(3);
		
		a[0] = b[0].intValue();
		b[3] = new Integer(2);
		c.set(1, (Integer)2);
		Integer c1 = c.get(1);
		Integer d2 = d.get(3);
		System.out.println(a[0]);
		System.out.println(b[3]);
		System.out.println(c1);
		System.out.println(d2);
	}
	
	public void HW4P3(){
		System.out.println(new Integer(3) == new Integer(3));
		System.out.println(new Integer(3).equals(new Integer(3)));
		System.out.println(new Integer(3) == 3);
	}
	
	public void HW4P4(){
		String s1 = new String("old string");
		System.out.println(s1);
		s1.replaceAll("old", "new");
		System.out.println(s1);
		s1 = s1.replaceAll("old", "new");
		System.out.println(s1);
	}
	
	public void HW4P5(){
		C1 o1 = new C1();
		o1.m1();
		C2 o2 = new C2();
		o2.m2();
		o2.m1();
	}
	
	public void HW4P6(){
		System.out.println(Integer.parseInt("11", 16));
		System.out.println(Integer.toString(11, 16));
	}
	
	public void HW4P7(){
		String a = "";
		String b = null;
		String c = "John";
		System.out.println(a == b);
		System.out.println(a.length());
//		System.out.println(b.length());
		System.out.println(c.length());
		System.out.println(c.substring(0, 3));
	}
	
	class C1{
		private int i1 = 2;
		
		C1(){
			
		}
		
		protected void m1() {
			System.out.println(i1);
		}
	}
	
	class C2 extends C1{
		private int i2 = 3;
		
		C2(){
			
		}
		
		public void m2(){
			System.out.println(i2);
		}
	}
}
