import java.util.Scanner;
import java.util.InputMismatchException;
public class Accounts {
	static Scanner id=new Scanner(System.in);
	static String ID;
	static int acn;
	public static int money;
	public static void customerID() {
		  boolean error= false;
		  while(! error) {
		try{
			System.out.println("enter the ID 1 letter 3 numbers");
			ID=id.next();
			error=true;
		}catch(InputMismatchException e) {
			System.out.println("try again");
			id.next();
		}
	}}
		
		  public static void accountNUM() {
			  boolean error= false;
			  while(! error) {
			try{
				System.out.println("enter the 5 numbers");
				acn=id.nextInt();
				error=true;
			}catch(InputMismatchException e) {
				System.out.println("try again");
				id.next();
			}
			  catch(Exception e) {
				  System.out.println("has to be numbers");
				  id.next();
			  }
			  }
	}
		  public static void money() {
			  boolean error= false;
			  while(! error) {
			try{
				System.out.println("enter the money value");
				money=id.nextInt();
				if(money<=0)
					throw new Exception();
				error=true;
			}catch(InputMismatchException e) {
				System.out.println("worng numbers");
				id.next();
			}
			  catch(Exception e) {
				  System.out.println("has to be numbers");
				  id.next();
			  }
			  }
		  }
		  
		  public static void string() {
			  System.out.println("id= "+ID+" account= "+acn+" money=$"+money);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
