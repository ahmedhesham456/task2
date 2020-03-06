package secondtask;

import java.util.Scanner;

public class SecondTaskPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str,reversed = "";
System.out.print("enter the phrase you want to check :"); 
Scanner scan = new Scanner(System.in); // assigning new scanner to read inputs
str = scan.nextLine(); 

// adjusting the input to avoid unwanted output
str = str.toLowerCase();
str = str.replaceAll("[^a-z0-9]", "");

//checking if the input string is empty
int x = str.length(); //variable represent the length of the string
if(str.equals("")) { 
	System.out.print("valid palindrome");
    System.exit(0);
}

//reversing the string
for(int i = x-1 ;i>=0 ;i--) {
    reversed = reversed + str.charAt(i);	
}

//checking if the reversed is actually equal to the original
if(reversed.equals(str))System.out.print("true");
    else System.out.print("false");
    
}
}
