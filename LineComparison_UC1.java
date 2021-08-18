
//As a fan of geometry, I want to model a line based on a point consisting of (x, y) co -ordinates using the Cartesian system, So that I can calculate its length .

import java.util.Scanner;

public class LineComparison_UC1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//local variable 
        double x1,x2,y1,y2;
        double Distance;
        
        // ask to user value
        System.out.println("Enter X1 coordinates:");
        
        // scan the user value
        x1= scan.nextInt();
        
        // ask to user value
        System.out.println("Enter Y1 coordinates:");
        
        // scan the user value        
        y1= scan.nextInt();
        
        
        System.out.println("Enter X2 coordinates:");
        
        // scan the user value
        x2= scan.nextInt();
        
        // ask to user value
        System.out.println("Enter Y2 coordinates:");
        
        // scan the user value
        y2= scan.nextInt();
        scan.close();
        
        Distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("The length of line is :"+Distance);

	}

}

/*
 OUTPUT
 
Enter X1 coordinates:
2
Enter Y1 coordinates:
2
Enter X2 coordinates:
1
Enter Y2 coordinates:
1
The length of line is :1.4142135623730951
 
 
**/



