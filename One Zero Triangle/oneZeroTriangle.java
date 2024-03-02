import java.util.*;
class oneZeroTriangle{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheTriangle(scan.nextInt());
	}
	public static void printTheTriangle(int n){
		/*int start=0;
		for(int i=0;i<n;++i){
			int startWith=0;
			if(start==0)
			startWith=1;
			else
			startWith=0;
			for(int j=0;j<=i;++j){
				if(j==0){	
					System.out.print(startWith+" ");					//using double variable approach
					continue;
				}
				if(startWith==0){
					System.out.print(1+" ");
					startWith=1;
				}
				else{
					System.out.print(0+" ");
					startWith=0;
				}
			}
			System.out.println();
			if(start==0)
			start=1;
			else
			start=0;
		}*/

		int start=0;
		for(int i=0;i<n;++i){
			for(int j=0;j<=i;++j){
				if(start==0){
					System.out.print(1+" ");
					start=1;
				}
				else{
					System.out.print(0+" ");						//using single variable approach
					start=0;
				}
			}	
			if(i%2!=0)
			start=0;
			else
			start=1;
			System.out.println();
		}
	}
}



/*

Output:
patterns>javac oneZeroTriangle.java

patterns>java oneZeroTriangle
5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

patterns>java oneZeroTriangle
10
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1 0 1
0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1
0 1 0 1 0 1 0 1 0 1

*/
