class currclass{
	static int x = 10;
	public static void main(String[] args) {
		test t = new test();
		t.print();
	}
}

class test{
	int x = 30;
	public void print(){
		System.out.println(this.x);
	}
}