import java.util.*;
class numberChangingPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheNumberChangingPyramid(scan.nextInt());
	}
	public static void printTheNumberChangingPyramid(int n){
		int start=0;
		for(int i=0;i<n;++i){
			for(int j=0;j<=i;++j)
			System.out.print((++start)+"  ");
			System.out.println();
		}
	}
}

/*

Output
patterns>javac numberChangingPyramid.java

patterns>java numberChangingPyramid
5
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15

patterns>java numberChangingPyramid
10
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21
22  23  24  25  26  27  28
29  30  31  32  33  34  35  36
37  38  39  40  41  42  43  44  45
46  47  48  49  50  51  52  53  54  55


*/
