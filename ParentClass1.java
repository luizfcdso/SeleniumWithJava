package mywork;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParentClass1 extends ParentClass{

	
	@Test
	public void testRun()
	{
		ParentClass2 ps2 = new ParentClass2(3);
		int a = 3;
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		//ParentClass3 ps3 = new ParentClass3(5);
		System.out.println(ps2.multipleThree());
		System.out.println(ps2.multiplyTwo());
		
		
		
	}
		
	

}
