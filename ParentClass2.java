package mywork;

public class ParentClass2 extends ParentClass3 {
	int a;
	
	
	public ParentClass2(int a) {
		super(a); //parent class constructor is invoked 
		this.a=a; 
		
	}


	public int increment() {
		a = a+1;
		return a;
	}
	
	public int decrement() {
		a = a-1;
		return a;
	}



}
