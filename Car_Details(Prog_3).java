//Program 3
/*Write a program to get the details about a car as specified in the sample input and display it. 

Hint: Store the price in double. Print the price correct to two decimal places.

Sample Input 1:
Enter the car name:
amaze
Enter the car no:
3666
Enter the price:
870000.76

Sample Output 1:

Carname:amaze
Carno:3666
Price:870000.76 rs only*/

import java.util.*;

public class Prog_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the car name:");
		String name = sc.nextLine();
		System.out.println("Enter the car no:");
		int car_no = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		
		System.out.println("Carname: " + name +"\n" + "Carno: " + car_no +"\n"+ "Price: " + price + " rs only");
	}
}
