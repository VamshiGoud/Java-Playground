class defaultmeth{
	public static void main(String[] args) {
		Test t = new Test();
		t.printer();
	}
}

class Test implements Tester{

}

interface Tester{
	void printer(){
		System.out.println("Hello");
	}
}