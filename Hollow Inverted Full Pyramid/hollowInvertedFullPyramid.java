import java.util.*;
class hollowInvertedFullPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheHollowPyramid(scan.nextInt());
	}
	public static void printTheHollowPyramid(int n){
		int stars=n+(n-1);
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
			if(i==0||i==n-1){
				for(int temp=0;temp<stars;++temp)
				System.out.print("*");
				System.out.println();
				stars-=2;
				continue;
			}
			for(int k=0;k<stars;++k){
				if(k==0||k==stars-1){
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
			stars-=2;
		}
	}
}

/*

Output
patterns>javac hollowInvertedFullPyramid.java

patterns>java hollowInvertedFullPyramid
5
*********
 *     *
  *   *
   * *
    *

patterns>java hollowInvertedFullPyramid
10
*******************
 *               *
  *             *
   *           *
    *         *
     *       *
      *     *
       *   *
        * *
         *

*/
