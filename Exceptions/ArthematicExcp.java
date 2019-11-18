class ArthematicExcp{
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("Sorry cannot divide the elements with zero");
		}
	}
}