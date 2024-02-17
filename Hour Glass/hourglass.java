import java.util.*;
class hourglass{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheUpperHourGlass(scan.nextInt());
	}
	public static void printTheUpperHourGlass(int n){
		int stars=n+(n-1);
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
			for(int k=0;k<stars;++k)
			System.out.print("*");
			System.out.println();
			stars-=2;
		}
		printTheLowerHourGlass(n-1);
	}
	public static void printTheLowerHourGlass(int n){
		int stars=3;
		for(int i=n;i>0;--i){
			for(int j=0;j<i-1;++j)
			System.out.print(" ");
			for(int k=0;k<stars;++k)
			System.out.print("*");
			System.out.println();
			stars+=2;
		}
	}
}

/*

Output
patterns>javac hourglass.java

patterns>java hourglass
5
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

patterns>java hourglass
10
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
