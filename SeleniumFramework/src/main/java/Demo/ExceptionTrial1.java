package Demo;

public class ExceptionTrial1 {
	
	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
		public static void demo() throws Exception{
			
				System.out.println("try strated from here");
				throw new ArithmeticException("its not valid number");}
				//int i = 1/0;
				//System.out.println("print I: " +i);
				//above two line is commented for throw keyword but fine for throws

}
