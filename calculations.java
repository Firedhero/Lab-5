import java.util.InputMismatchException;
	import java.util.Scanner;
public class calculations {
	
	
	    static Scanner length=new Scanner(System.in);
	    static Scanner nums=new Scanner(System.in);
	    
	    static int[] arr=new int[0];
	    public static int sum=0;
	  public static int average=0;
	public static void calc() {
		
	    System.out.println("enter amount of numbers to use");
	   
	    boolean error= false;
while(! error) {
   try{
		arr=new int[0];
	    arr=new int[length.nextInt()];
//	    if(arr.length<0)
//	    
//	    throw new NegativeArraySizeException();
//	    if(arr.length<0)
//	    throw new Exception();
	    
	    
	    
	    error=true;	    
	}
	    
	catch(NegativeArraySizeException e){
	    System.out.println("cannot be negative");
	    
	       length.nextInt();
	      
	}
		catch(InputMismatchException e) {	
			

		System.out.println("has to be a number");	
		length.nextLine();
		}
	catch (Exception e){
		
	     System.out.println("cannot be zero");
	     length.nextInt();
	    
	
	}
}	}
	public static void numbers(){
	System.out.println("enter numbers");
	
	for(int i=0;i<arr.length;i++) {
		while(true) {try {
	        	arr[i]=nums.nextInt();
	    	 
	            break;
	            }
	catch(InputMismatchException e){
		
	   		System.out.println("has to be a number");
	   		arr[i]=nums.nextInt();
	   
	}
	 catch (Exception e){
	System.out.println("the number can not be zero eneter new number");
	arr[i]=nums.nextInt();
	

	        
	}
	    	  }}
	for(int ADD=0;ADD<arr.length;ADD++) {
	    int temp=arr[ADD];
	    sum=sum+temp;
	    average=sum/arr.length;
	    //System.out.println(arr[i]);
	}
	System.out.println(average);
	
	
	
	}
}