package fourthTask;

import java.util.Scanner;

public class matricesMultiplication {

	public static void main(String[] args) {

		
//declaring the matrices 
Scanner input = new Scanner(System.in);
System.out.print("please enter first matrix number of coulmns and rows");
int c1 , r1;
r1= input.nextInt();
c1 = input.nextInt();
int firstMatrix[][] = new int [r1] [c1];
System.out.print("please enter second matrix number of coulmns and rows");
int c2 , r2;
r2 = input.nextInt();
c2 = input.nextInt();
int secondMatrix[][] = new int [r2] [c2];
int product[][] = new int [r1] [c2];

// filling the matrices in 

System.out.println("please enter the infrormation about the first matrix");
for(int i=0;i<r1;i++) {
	for(int j=0;j<c1;j++) {
		System.out.print("please enter the number at row" + (i+1) + "and coulmn" + (j+1));
		firstMatrix[i][j] = input.nextInt();
	}
}

System.out.println("please enter the infrormation about the second matrix");
for(int i=0;i<r2;i++) {
	for(int j=0;j<c2;j++) {
		System.out.print("please enter the number at row" + (i+1) + "and coulmn" + (j+1));
		secondMatrix[i][j] = input.nextInt();
	}
}

// the multiplication of the matrices

if(c1!=r2) {
	System.out.print("these matrices can't be multipiled");
}
else {
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c2;j++) {
			for(int k=0;k<c1;k++) {
				product[i][j] += firstMatrix[i][k]*secondMatrix[k][j];

			}
		}
	}
}

// printing the product matrix 

for(int i=0;i<r1;i++) {
	for(int j=0;j<c2;j++) {
		System.out.print(product[i][j] + " ");
	}
	System.out.println();
}
	}

}
