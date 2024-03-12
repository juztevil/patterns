import java.util.*;
class numberIncreasingReversePyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheNumberIncreasingReversePyramid(scan.nextInt());
		scan.close();
	}
	public static void printTheNumberIncreasingReversePyramid(int n){
		for(int i=0;i<n;++i){
			for(int j=0;j<n-i;++j)
			System.out.print((j+1)+" ");
			System.out.println();
		}
	}
}

/*

OutPut
patterns>notepad numberIncreasingReversePyramid.java

patterns>javac numberIncreasingReversePyramid.java

patterns>java numberIncreasingReversePyramid
4
1 2 3 4
1 2 3
1 2
1

patterns>java numberIncreasingReversePyramid
9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/
