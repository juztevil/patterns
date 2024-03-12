import java.util.*;
class numberTriangular{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheNumberTriangular(scan.nextInt());
		scan.close();
	}
	public static void printTheNumberTriangular(int n){
		for(int i=0;i<n;++i){
			for(int j=0;j<n-i-1;++j)
			System.out.print(" ");
			for(int k=0;k<=i;++k)
			System.out.print((i+1)+" ");
			System.out.println();
		}
	}
}

/*

Output
patterns>javac numberTriangular.java

patterns>java numberTriangular
5
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

patterns>java numberTriangular
10
         1
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
    6 6 6 6 6 6
   7 7 7 7 7 7 7
  8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
10 10 10 10 10 10 10 10 10 10

patterns>

*/
