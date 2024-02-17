import java.util.*;
class invertedFullPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printThePyramid(scan.nextInt());
	}
	public static void printThePyramid(int n){
		int stars=n+(n-1);
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
			for(int k=0;k<stars;++k)
			System.out.print("*");
			stars-=2;
			System.out.println();
		}
	}
}

/*
	1=1
	2=3
	3=5
	4=7
	5=9
		to determine the stars there is two ways
			1) initialize a variable call star with 1;
			   for given n iterate the star with +2 
				ex
				int stars=1;
				for(int i=2;i<n;++i)
				stars+=2;
		
			2) initialize star=n+(n-1);
*/


/*

Output
patterns>javac invertedFullPyramid.java

patterns>java invertedFullPyramid
5
*********
 *******
  *****
   ***
    *

patterns>java invertedFullPyramid
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

*/
