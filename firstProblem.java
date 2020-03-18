package thirdTask;
import java.util.Scanner;
public class firstProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declaring variables and inputs
Scanner input = new Scanner(System.in);
int [] arr1 = {2,5,6,9} , arr2 = {2,6,9,13};
int i = 0,j = 0 ,arrLenght = 3;
int [] arr3 = new int[8];
System.out.print("resulted array =");
//looping for number of resulted array length
while(j<=arrLenght) {
	if(arr1[i] <= arr2[i]) {
		arr3[i] = arr1[i];
		arr3[i+1] = arr2[i];
	    i++;
    }
    else {
	   arr3[i] = arr2[i];
	   arr3[i+1] = arr1[i];
	   i++;
    }
System.out.print(arr3[i] + ",");
j++;		
}
	}

}
