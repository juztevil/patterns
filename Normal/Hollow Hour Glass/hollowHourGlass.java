import java.util.*;
class hollowHourGlass{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheHollowHourGlass(scan.nextInt());
		scan.close();
	}
	public static void printTheHollowHourGlass(int n){
		int stars=n+(n-1);
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
				if(i==0){
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
		printTheRemainingPart(n-1);
	}
	public static void printTheRemainingPart(int n){
		int stars=3;
		for(int i=0;i<n;++i){
			for(int j=n-i-1;j>0;--j)
			System.out.print(" ");
				if(i==n-1){
					for(int temp=0;temp<stars;++temp)
					System.out.print("*");
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

patterns>javac hollowHourGlass.java

patterns>java hollowHourGlass
5
*********
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*********
patterns>java hollowHourGlass
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
