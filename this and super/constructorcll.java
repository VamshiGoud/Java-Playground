class constructorcll{

	public static void main(String[] args) {
		Test x = new Test();
	}
}

class Test{
	void Test(){
		System.out.println("Hello!");
	}

	void Test(int x){
		this();
		System.out.println(x);
	}
}