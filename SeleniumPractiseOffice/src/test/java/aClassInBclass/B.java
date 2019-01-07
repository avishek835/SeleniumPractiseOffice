package aClassInBclass;

public class B {
	public void talk()
	{
		System.out.println("I can talk");
	}
	
	public static void main(String args[])
	{
		A a=new A();
		a.dance();
		a.sing();
		B b=new B();
		b.talk();
	}

}
