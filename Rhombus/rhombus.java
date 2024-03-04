import java.util.*;
class rhombus{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printTheRhombus(scan.nextInt());
		scan.close();
	}
	public static void printTheRhombus(int n){
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j)
			System.out.print(" ");
			for(int k=0;k<n;++k)
			System.out.print("*");
			System.out.println();
		}
	}
}


/*

Output
patterns>javac rhombus.java

patterns>java rhombus
5
*****
 *****
  *****
   *****
    *****

patterns>java rhombus
10
**********
 **********
  **********
   **********
    **********
     **********
      **********
       **********
        **********
         **********

*/
