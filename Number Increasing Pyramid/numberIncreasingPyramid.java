import java.util.*;
class numberIncreasingPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printThenumberIncreasingPyramid(scan.nextInt());
	}
	public static void printThenumberIncreasingPyramid(int n){
		for(int i=0;i<n;++i){
			for(int j=0;j<=i;++j)
			System.out.print((j+1)+" ");
			System.out.println();
		}
	}
}

/*

Output
patterns>javac numberIncreasingPyramid.java

patterns>java numberIncreasingPyramid
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

patterns>java numberIncreasingPyramid
10
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10

*/
