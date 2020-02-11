import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String args[])
	{   float number1 = 0;
	    float number2 = 0;
		Calculator calc = new Calculator();

		System.out.println("CALCULATOR");
	    System.out.println("1.ADDITION");
	    System.out.println("2.SUBTRACTION");
	    System.out.println("3.MULTIPLICATION");
	    System.out.println("4.DIVISION");
	    System.out.println("5.EXIT");

 while(true) {
	    	try {
	    	     System.out.println("SELECT AN OPTION AMONG 1-5");
	    	     Scanner sc= new Scanner(System.in);

	    	     switch(sc.nextInt())
	    	     {
	    	       case 1:
	    		         System.out.println("Enter first number:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("Enter second number:");
	    		         number2=sc.nextFloat(); 
	    		         System.out.println("sum of "+(int)number1+" + "+(int)number2+" = "+(calc.sum(number1,number2)));
	    		         break;
	    	       case 2:
	    		         System.out.println("Enter first number:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("Enter second number:");
	    		         number2=sc.nextFloat(); 
	    		         System.out.println("difference of "+(int)number1+" - "+(int)number2+" = "+(calc.difference(number1,number2)));
	    	             break;
	    	       case 3:

	    		         System.out.println("Enter first number:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("Enter second number:");
	    		         number2=sc.nextFloat(); 
	    		         System.out.println("multiplication  of "+(int)number1+" * "+(int)number2+" = "+(calc.multiplication(number1,number2)));
	    		         break;
	    	       case 4:
	    		         System.out.println("Enter first number:");
	    		         number1=sc.nextFloat();
	    		         System.out.println("Enter second number:");
	    		         number2=sc.nextFloat();
	    		         if(number2==0)
	    		           {
	    			         System.out.println("can't divide by 0");
	    			         break;
	    		           }
	    		         System.out.println("division of "+(int)number1+" / "+(int)number2+" = "+(calc.division(number1,number2)));
	    		         break;
	    	       case 5:
	    		   System.exit(1);


	    	       default:
	    		          System.out.println("Choose from given options(1-4)");
	    		          break;
	    	     }
	        }
	    	catch(Exception e){

	    		System.out.println("Enter valid input ");

	    	}
	}


}
}