class interfaceDuo{
	public static void main(String[] args) {
		Test t = new Test();
		t.firstPrint();
		t.secondPrint();
	}
}

interface first{

	void firstPrint();
}

interface second{

	void secondPrint();
}

class Test implements first,second{
	public void firstPrint(){
		System.out.println("Printing first");
	}

	public void secondPrint(){
		System.out.println("Printing Second");
	}
}