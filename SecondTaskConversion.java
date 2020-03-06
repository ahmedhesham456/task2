package secondtask;

import java.util.Scanner;

public class SecondTaskConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// declaring variables and a new scanner
String str = "";
int x,temp,digits;
Scanner input = new Scanner(System.in);

// waiting for the inputs 
System.out.print("enter the number");
x = input.nextInt();
System.out.print("please enter number of digits");
digits = input.nextInt();

// converting the integer input to string
for(int i=0;i<digits;i++) {
	 temp = x % 10;
	 x /=10;
	 str = temp + str;
}

System.out.print(str);
    }
}

