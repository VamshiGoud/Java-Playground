class sameMethod{
	public static void main(String[] args) {
		printer t = new printer();
		t.disp();
	}
}

interface Hello{
	int x = 10;
	void disp();
}

interface World{
	int x = 20;
	void disp();
}

class printer implements Hello,World{
	public void disp(){
		System.out.println("Hello World "+World.x+","+Hello.x);
	}
}