package stringprograms;

public class Test2 extends Test {
	
	
	@Override
	public void m1() {
		System.out.println("child");
	}
	
	
	public void childMethod() {
		System.out.println("child method");
		this.m1();
		super.parentMethod();
	}
//	public void m1() {
//		// TODO Auto-generated method stub
//
//	}
	

	public static void main(String[] args) {
		Test2 t= new Test2();
		//t.childMethod();
		t.m1();
	}

}
