class staticfin{
	public static void main(String[] args) {
		Test t = new Test();
		t.getX();
	}
}

interface A{
	static final int x = 50;
}

class Test implements A{
	public void getX(){
		System.out.println(x);
	}
}