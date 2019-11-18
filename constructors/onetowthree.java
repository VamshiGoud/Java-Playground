class onetowthree{
	public static void main(String[] args) {
		Cycle t = new Cycle(1);
		Cycle u = new Cycle(1,2);
	}
}

class Cycle{
	Cycle(int x){
		System.out.println(x);
	}

	Cycle(int x, int y){
		System.out.println(x+" "+y);
	}
}