abstract class ac{
	int x= 36;
	abstract void disp();
	public void fun(){
		System.out.println("Having fun");
	}
}

class Test extends ac{
	public void disp(){
		System.out.println(x);
	}
}

class abstractclass{
	public static void main(String[] args) {
		Test t = new Test();
		t.fun();
		t.disp();
	}
}