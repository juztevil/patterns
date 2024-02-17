import java.util.*;
class invertedRightHalfPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printThePyramid(scan.nextInt());
	}
	public static void printThePyramid(int n){
		for(int i=n;i>0;--i){
			for(int j=1;j<=i;++j)
			System.out.print("*");
			System.out.println();	
		}
	}
}

/*

Output
patterns>javac invertedRightHalfPyramid.java

patterns>java invertedRightHalfPyramid
5
*****
****
***
**
*

patterns>java invertedRightHalfPyramid
10
**********
*********
********
*******
******
*****
****
***
**
*

*/
