import java.util.*;
class invertedLeftHalfPyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printThePyramid(scan.nextInt());
		scan.close();
	}
	public static void printThePyramid(int n){
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
			for(int k=n-i;k>0;--k)
			System.out.print("*");
			System.out.println();
		}
	}
}

/*

patterns>java invertedLeftHalfPyramid
5
*****
 ****
  ***
   **
    *

patterns>java invertedLeftHalfPyramid
10
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *

*/
