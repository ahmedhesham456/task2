package thirdTask;

import java.util.Scanner;

public class secondProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
//declaring new array
System.out.print("enter the length of the array");
int length = input.nextInt() , x = 7;
int [] arr = new int [length];
System.out.print("please enter the array");
for(int i=0;i<length;i++) {
	arr[i] = input.nextInt();
}
//finding the Indices of the two numbers that add to x
for(int i=0;i<length;i++) {
	for(int j=i;j<length;j++) {
		if(arr[i]+arr[j]==x) {
		System.out.print("the indices of the two numbers are" + i +","+ j);
		break;
	    }
    }
}
	}
}
