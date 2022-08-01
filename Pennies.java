import java.util.Scanner;

/* 
   @author Jaymar Jaramillo
   @date 8/1/2022
*/

//Programming Challenge 4 from Chapter 4
//of Starting out with >>> Java, Tony Gaddis

public class Pennies {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter in how many days you worked if you are earning a\n" +
						   "penny a day that grows exponentially: ");
		var days = in.nextInt();
		
		while (days < 1) {
				System.out.println("Invalid input. Enter in days no less than 1:");
				days = in.nextInt();
		}
		
		double test = 0;
		
		System.out.println();
		System.out.println("Days\tDollars");
		System.out.println("=================");
		
		for (var i = 1; i <= days; i++) {
			pennies = 0;
			test += pennies + 1 * i;
					
			double dollars = test / 100;
					
			System.out.println(i + "\t" + "$" + dollars);
		}		
	}
}