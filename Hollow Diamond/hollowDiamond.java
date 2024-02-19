import java.util.*;
class hollowDiamond{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheHollowDiamond(scan.nextInt());
	}
	public static void printTheHollowDiamond(int n){
		int stars=1;
		for(int i=n;i>0;--i){
			for(int j=i;j>0;--j)
			System.out.print(" ");
				if(i==n){
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
		printTheRemainingPart(n-1);
	}
	public static void printTheRemainingPart(int n){
		int stars=n+(n-1);
		for(int i=0;i<n;++i){
			for(int j=0;j<=i+1;++j)
			System.out.print(" ");
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
patterns>javac hollowDiamond.java

patterns>java hollowDiamond
5
     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *

patterns>java hollowDiamond
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
 *                 *
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


