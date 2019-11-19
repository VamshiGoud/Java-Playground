class buffwrtr{
	public static void main(String[] args) {
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
		}catch(Exception e){
			System.out.println("Failed");
		}
	}
}