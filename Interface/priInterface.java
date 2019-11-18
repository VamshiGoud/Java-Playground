class priInterface{
	public static void main(String[] args) {
		Test t = new Test();
		t.Disp();
		t.Print();
	}
}

private interface A{
	void Disp();
}

protected interface B{
	void Print();
}

class Test implements A,B{
	public void Disp(){
		System.out.println("Display");
	}

	public void Print(){
		System.out.println("Printer");
	}
}
