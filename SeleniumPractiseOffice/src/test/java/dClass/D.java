package dClass;

import cClass.C;

public class D {

	public void talk()
	{
		System.out.println("I can talk");
	}
	
	public static void main(String args[])
	{
		C c=new C();
		c.dance();
		c.sing();
		D d=new D();
		d.talk();
	}


}
