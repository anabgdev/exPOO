package exercicio02;

public class Mains {

	public static void main(String[] args) {
		
		A a = new B ("Joao");
		System.out.println(a.getMsg());
		
	}
}

class A {
	String msg;
	public A (String msg) {
		this.msg = msg;
	}
	String getMsg() {
		return "Oi!" +msg;
		
	}
}
class B extends A {
	
	public B (String msg) {
		super(msg);
	}
	String getMsg () {
		return "Ola! "+msg;
	}
}