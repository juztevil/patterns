import java.util.*;
class rightHalfPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);		//getting input from the user
		System.out.print("Enter the number: ");
		printThePyramid(scan.nextInt());		//using function to print the pattern
	}	
	public static void printThePyramid(int n){
		for(int i=0;i<n;++i){				//using two for loops
			for(int j=0;j<=i;++j)			//1) to determine how many rows
			System.out.print("*");			//2) to determine how many stars in each row
			System.out.println();
		}
	}
}

/*
Output

patterns>javac rightHalfPyramid.java

patterns>java rightHalfPyramid
Enter the number: 5
*
**
***
****
*****

patterns>java rightHalfPyramid
Enter the number: 10
*
**
***
****
*****
******
*******
********
*********
**********

*/
