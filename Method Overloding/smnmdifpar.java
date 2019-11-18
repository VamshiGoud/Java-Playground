class smnmdifpar{
	public static void main(String[] args) {
		Hello();
		Hello("Vamshi");
		Hello("Vamshi",24);
		System.out.println(Hello());
	}

	static void Hello(){
		System.out.println("Hello!");
	}

	static void Hello(String x){
		System.out.println("Hello! "+x);
	}

	static void Hello(String x, int y){
		System.out.println("Hello! "+x+" of age:"+y);
	}

	// static void Hello(String x, int y){
	// 	System.out.println("Your Back! "+x+" of age:"+y);
	// }

	static int Hello(){
		return 10;
	}
}

