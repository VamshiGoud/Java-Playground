class priprointerface{
	public static void main(String[] args) {
		Test t = new Test();
		t.setX(60);
		System.out.println(t.getX());
		t.sety(65);
		System.out.println(t.getX());
	}
}

interface A{
	private int x = 30;
	protected int y = 20;
	void setX();
	void sety();
	int getX();
	int getY();
}

class Test implements A{
	public void setX(int x){
		this.x = x;
	}

	public void sety(int y){
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
}