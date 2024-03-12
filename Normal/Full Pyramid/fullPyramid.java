import java.util.*;
class fullPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		printThePyramid(scan.nextInt());
		scan.close();
	}
	public static void printThePyramid(int n){
		int stars=1;					//three for loops
		for(int i=1;i<=n;++i){				//1) to determine the number of rows
			for(int j=0;j<n-i;++j)			//2) to determine the number of space to be printed in each row
			System.out.print(" ");			//3) to print the stars after the space is printed
			for(int k=1;k<=stars;++k)
			System.out.print("*");
			System.out.println();
			stars+=2;
		}
	}
}


/*

Output
patterns>javac fullPyramid.java

patterns>java fullPyramid
Enter the number: 5
    *
   ***
  *****
 *******
*********

patterns>java fullPyramid
Enter the number: 10
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************

*/










    
