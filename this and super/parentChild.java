class A{
	int x = 10;
	public void printx(){
		System.out.println(x);
	}
}

class B extends A{
	int x = 20;
	public void printx(){
		super.printx()
	}
}

class parentChild{
	public static void main(String[] args) {
		B t = new B();
		t.printx();
		t.printx();
	}
}