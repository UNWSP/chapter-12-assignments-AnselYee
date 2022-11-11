package ch12assignment;
import java.util.*;
public class DistanceFromAverageWithExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	      double[] numbers;
	      double number = 0;
	      int Size = 0;
	      double total = 0;
	      double average = 0;
	      final int quit = 111;
	      boolean validArrayInput = true;
	      boolean isDouble=false;
	      int x = 0, y;
	      try{
	          System.out.print("Enter the size of array: ");
	          Size = input.nextInt();
	      }
	      catch(NumberFormatException e){
	          System.out.println("Please enter an integer");
	          validArrayInput = false;
	          input.nextLine();
	      }
	      catch(NegativeArraySizeException e) {
	    	  System.out.println("Negative integer is not allowed");
	    	  Size=5;
	      }
	      if(validArrayInput) {
	    	  numbers=new double[Size];
	    	  try {
	    		  System.out.print("Enter a number or " + quit + " to quit ");
                  number = input.nextDouble();
                  isDouble=true;
	    	  }
	    	  catch(Exception e) {
	    		  System.out.println("Error:: "+e.getMessage());
	    		  isDouble=false;  
	    	  }
	    	  while(number!=quit && x < numbers.length) {
	    		  numbers[x] = number;
	               ++x;
	               if(x < numbers.length)
	               {
	                   try{
	                       System.out.print("Enter next number or " +
	                                        quit + " to quit  ");
	                       number = input.nextDouble();
	                   }
	                   catch(Exception e){
	                       System.out.println("Invalid input");
	                       --x;
	                   }
	               }
	    	  }
	    	  for(int i = 0; i < numbers.length; ++i)
                  total += numbers[i];
              average = total / x;
              System.out.println("You entered " + x + " numbers and their average is " + average);
                  for(y = 0; y < x; ++y)
                      System.out.println(numbers[y] + " is " +
                                         (average - numbers[y]) + " away from the average");
	      }
	      
	      
	}

}
