
//As a fan of geometry, I want to check equality of two lines based on the end points, So that I know when two lines are the equal. - Using Java equals

import java.util.Scanner;

public class LineComparison_UC2 {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        //local variable
	        double x1,x2,y1,y2,a1,b1,a2,b2;

	        double Distance1;
	        double Distance2;
	        
	        // Ask to user enter the value
	        System.out.println("Line2 Enter X1 coordinates:");
	        //scan the user value
	        x1= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter Y1 coordinates:");
	        //scan the user value
	        y1= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter X2 coordinates:");
	        //scan the user value
	        x2= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter Y2 coordinates:");
	        //scan the user value
	        y2= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter a1 coordinates:");
	        //scan the user value
	        a1= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter b1 coordinates:");
	        //scan the user value
	        b1= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter a2 coordinates:");
	        a2= scan.nextInt();
	        // Ask to user enter the value
	        System.out.println("Line2 Enter b2 coordinates:");
	        b2= scan.nextInt();
	        scan.close();

	        //calculating Distance1
	        Distance1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	        
	        // printing the value of length of line is distance1
	        System.out.println("The length of line-1 is :"+Distance1);

	      //calculating Distance2
	        Distance2 = Math.sqrt((b2 - b1) * (b2 - b1) + (a2 - a1) * (a2 - a1));
	        
	     // printing the value of length of line is distance2
	        System.out.println("The length of line-2 is :"+Distance2);
	        
	        //if else condition
	            if(Distance1 == Distance2){
	                System.out.println("The line lengths are equal");
	             }
	             else {
	                System.out.println("The line lengths are not equal");
	             }
	}

}



/*
 * OutPut
 * 
 * Line2 Enter X1 coordinates:
2
Line2 Enter Y1 coordinates:
4
Line2 Enter X2 coordinates:
5
Line2 Enter Y2 coordinates:
5
Line2 Enter a1 coordinates:
2
Line2 Enter b1 coordinates:
2
Line2 Enter a2 coordinates:
32
Line2 Enter b2 coordinates:
3
The length of line-1 is :3.1622776601683795
The length of line-2 is :30.01666203960727
The line lengths are not equal
 * 
 */




