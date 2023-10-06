package mywork;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		MethodsDemo3 d2 = new MethodsDemo3();
		d1.getUserData();
		getData2();
		d2.getUserData2();
		
		
		
		

	}
	
	private static String getData2() {
		System.out.println("Hello world");
		return "Luiz Fernando";
		
	}

	public String getData() {
		
		System.out.println("Hello world");
		return "Luiz Fernando";
		
		
	}
	
	

}
