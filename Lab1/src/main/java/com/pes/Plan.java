package com.pes;

class SingleTon {
private static final SingleTon singleOb =new SingleTon();
 private SingleTon()
{
	System.out.println("this is singlton object");
}
public static SingleTon getSingleob() {
	return singleOb;
}
public void show()
{
	System.out.println("show SingleTon");
}
}
class Plan{
	public static void main(String[] args) {
		SingleTon sc= SingleTon.getSingleob();
		SingleTon obj=SingleTon.getSingleob();
		System.out.println(sc==obj);
	}
}
