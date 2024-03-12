import java.util.*;
class diamond{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheFirstHalfDiamond(scan.nextInt());
		scan.close();
	}
	public static void printTheFirstHalfDiamond(int n){
		int stars=1;
		for(int i=n-1;i>=0;--i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
			for(int k=0;k<stars;++k)
			System.out.print("*");
			System.out.println();
			stars+=2;
		}
		printTheSecondHalfDiamond(n-1);
	}
	public static void printTheSecondHalfDiamond(int n){
		int stars=n+(n-1);
		for(int i=0;i<n;++i){
			for(int j=0;j<=i;++j)
			System.out.print(" ");
			for(int k=0;k<stars;++k)
			System.out.print("*");
			System.out.println();
			stars-=2;
		}
	}
}

/*

Output:
patterns>javac diamond.java

patterns>java diamond
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

patterns>java diamond
10
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
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *

*/
