class superClass{
	public static void main(String[] args) {
		B t = new B();
		B u = new B(2);
	}
}


class A{
	A(){
		System.out.println("Hello from A");
	}

	A(int x){
		System.out.println("Hello from A"+x);
	}
}

class B extends A{
	B(){
		super();
	}

	B(int x){
		super(x);
	}
}