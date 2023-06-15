/*2.write a java program to create byte array with 5 location accept two numbers from the user and store 1st number in the 2nd position and 2nd number in the 3rd position add both numbers and display the sum?*/
import java.util.*;
class A2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		byte[] array= new byte[5];
		System.out.print("enter 1st number:");
		array[1] = scan.nextByte();
		System.out.print("enter 2nd number:");
		array[2] = scan.nextByte();
		int sum=array[1]+array[2];
		System.out.println("sum="+sum);
		
	}
}
/*
D:\arrayslogicalcoding\app2\src>java -cp ../classes A2
enter 1st number:25
enter 2nd number:12
sum=37
*/