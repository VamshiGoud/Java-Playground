class multiCatch{
	public static void main(String[] args) {
		try{
			System.out.println(5/1);
		}catch(ArithmeticException e){
			System.out.println("Divided by zero");
		}catch(Exception e){
			System.out.println("again Divided by zero");
		}
	}
}