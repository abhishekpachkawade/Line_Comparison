
//As a fan of geometry, I want to compare two lines based on the end points, So that I know one line is equal, greater or less than the other line. - Using Java compareTo method to compare 2 Lengths

import java.util.Scanner;

public class LineComparison_UC3 {

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
	        String myStr1 = Double.toString(Distance1);
	        String myStr2 = Double.toString(Distance2);
	        
	        //comparing to MyStr1 to MyStr2
	        System.out.println(myStr1.compareTo(myStr2));
	        
	        //if else condition
	        if(myStr1.compareTo(myStr2) ==0){
	            System.out.println("The line lengths are equal");
	            }
	        else //nested if else condition  
	        	if(myStr1.compareTo(myStr2) >0) {
	            System.out.println("The Line1 length is greater than Line2 length");
	        }
	        	else {
	            System.out.println("The Line1 length is smaller than Line2 length");
	        	}
	}

}


/*
	OUTPUT
	
Line2 Enter X1 coordinates:
2
Line2 Enter Y1 coordinates:
5
Line2 Enter X2 coordinates:
3
Line2 Enter Y2 coordinates:
3
Line2 Enter a1 coordinates:
2
Line2 Enter b1 coordinates:
2
Line2 Enter a2 coordinates:
6
Line2 Enter b2 coordinates:
6
The length of line-1 is :2.23606797749979
The length of line-2 is :5.656854249492381
-3
The Line1 length is smaller than Line2 length
	
**/

