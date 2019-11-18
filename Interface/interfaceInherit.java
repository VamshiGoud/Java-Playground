class interfaceInherit{
	public static void main(String[] args) {
		Cycle t = new Cycle();
		t.Hello();
		t.World();
	}
}

interface x{
	void Hello();
}

interface y extends x{
	void World();
}

class Cycle implements y{
	public void Hello(){
		System.out.print("Hello, ");
	}
	public void World(){
		System.out.println("World");
	}
}	