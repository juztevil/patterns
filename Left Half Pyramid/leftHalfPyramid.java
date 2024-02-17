import java.util.*;
class leftHalfPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		printThePyramid(scan.nextInt());
	}
	public static void printThePyramid(int n){
		for(int i=0;i<n;++i){
			for(int j=n-1;j>i;--j)
			System.out.print(" ");
			for(int k=0;k<=i;++k)
			System.out.print("*");
			System.out.println();
		}
	}
}

/*
Output

patterns>javac leftHalfPyramid.java

patterns>java leftHalfPyramid
Enter the number: 5
    *
   **
  ***
 ****
*****

patterns>java leftHalfPyramid
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
