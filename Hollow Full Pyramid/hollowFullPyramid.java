import java.util.*;
class hollowFullPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheHollowPyramid(scan.nextInt());
		scan.close();
	}
	public static void printTheHollowPyramid(int n){
		int stars=1;
		for(int i=n;i>0;--i){
			for(int j=i-1;j>0;--j)
			System.out.print(" ");
			if(i==n||i==1){
				for(int temp=0;temp<stars;++temp)
				System.out.print("*");
				System.out.println();
				stars+=2;
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
			stars+=2;
		}
	}
}

/*

Output
patterns>javac hollowFullPyramid.java

patterns>java hollowFullPyramid
5
    *
   * *
  *   *
 *     *
*********

patterns>java hollowFullPyramid
10
         *
        * *
       *   *
      *     *
     *       *
    *         *
   *           *
  *             *
 *               *
*******************


*/
