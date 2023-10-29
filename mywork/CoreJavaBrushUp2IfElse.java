package mywork;


import java.util.ArrayList;

public class CoreJavaBrushUp2IfElse {

	public static void main(String[] args) {
		
//		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,148};
//		
//		//2,4,6,8,10,12,14,16
//		
//		// if and else are checking if array is multiple of 2 or not 
//		
//		for (int i=0; i<arr2.length; i++)
//		{
//			if(arr2[i] % 2 == 0)
//			{
//				System.out.println(arr2[i]);
//			}
//			else {
//				System.out.println(arr2[i] + " : is not multiple of 2");
//			}
//		}
		
		ArrayList<String> a = new ArrayList<String>();
//		a.add("Luiz");
//		a.add("Fernando");
//		a.add("Costa");
//		a.add("de Souza");
//		System.out.println(a.get(3));
//		
//		for (int i = 0; i<a.size(); i++)
//		{
//			System.out.println(a.get(i));
//		}
//		System.out.println("*******************");
//		for (String val :a)
//		{
//			System.out.println(val);
//		}
//		
//		System.out.println(a.contains("Sousa"));
		
		
		
		String s = "Fernando Costa";
	String[] slittedString = s.split("Fernando");
	System.out.println(slittedString[0]);
	System.out.println(slittedString[1]);
	System.out.println(slittedString[1].trim());//remove espaços em brancos 
		
		
		for(int i = s.length()-1; i>=0; i--) {
		
		System.out.println(s.charAt(i));
		}
		
	}

}
