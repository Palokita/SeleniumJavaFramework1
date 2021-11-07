package Demo;

public class ExceptionHandlingDemoTrial {

	public static void main(String[] args) {
		demo();

	}
	
	public static void demo() {
	try {
		System.out.println("try strated from here");
		int i = 1/0;
		System.out.println("print I: " +i);
	}
	catch(Exception exe)
	{
		System.out.println(exe.getMessage());
		System.out.println(exe.getCause());
		exe.printStackTrace();
	}
	 finally
	 {
		 System.out.println("I am inside finally block");
	 }
	}
}
