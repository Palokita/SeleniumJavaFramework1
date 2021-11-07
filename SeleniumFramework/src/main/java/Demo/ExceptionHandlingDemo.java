package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
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
