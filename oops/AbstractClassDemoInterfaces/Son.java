package oops.AbstractclassDemo;

public class Son extends Parent{

	public Son(int age) {
		super(age);
	}

	
	@Override
	void normal() {
		// TODO Auto-generated method stub
		super.normal();
	}


	@Override
	void career() {
		System.out.println("I am going to be doctor");
	}

	@Override
	void partner() {
		System.out.println("i love playing");
	}
  
}
