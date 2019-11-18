class pubInterface{
	public static void main(String[] args) {
		Test t = new Test();
		t.PrintName();

		t.printX();

		t.Disp();
	}
}

class Test implements A{
	public void PrintName(){
		System.out.println(name);
	}

	public void printX(){
		System.out.println(x);
	}

	public void Disp(){
		System.out.println(name+" "+x);
	}
}