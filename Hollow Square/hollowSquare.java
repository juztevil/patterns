import java.util.*;
class hollowSquare{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheHollowSquare(scan.nextInt());
		scan.close();
	}
	public static void printTheHollowSquare(int n){
		for(int i=0;i<n;++i){
			if(i==0||i==n-1){
				for(int temp=0;temp<n;++temp)
				System.out.print("*");
				System.out.println();
				continue;
			}
			for(int j=0;j<n;++j){
				if(j==0||j==n-1){
					System.out.print("*");
					continue;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

/*

Output
patterns>javac hollowSquare.java

patterns>java hollowSquare
5
*****
*   *
*   *
*   *
*****

patterns>java hollowSquare
10
**********
*        *
*        *
*        *
*        *
*        *
*        *
*        *
*        *
**********

*/
