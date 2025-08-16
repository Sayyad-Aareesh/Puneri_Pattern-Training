package com.finalkeyword;

final class Parent
{
	public void show()
	{
		System.out.println("Final class Method ");
	}
	
}

class ParentI {
	final public void showMsg()
	{
		System.out.println("This is final Method...");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		
		Parent p =new Parent();
		p.show();
		ParentI p1 =new ParentI();
		p1.showMsg();
	}

}
