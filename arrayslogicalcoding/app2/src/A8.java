//8. Initialize a string array which contains 5 city names. Display only third city by adding prefix "Welcome to"  
import java.util.*;
class A8
{
	public static void main(String[] args) 
	{
		String[]str = {"Bangalore", "Delhi", "Mumbai", "Lucknow", "Chennai"};
		System.out.println("final: " + Arrays.toString(str));
		System.out.println("Welcome to " + str[2]);
	}
}
/*
final: [Bangalore, Delhi, Mumbai, Lucknow, Chennai]
Welcome to Mumbai
*/