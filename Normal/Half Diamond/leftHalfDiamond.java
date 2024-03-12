import java.util.*;
class leftHalfDiamond {
        public static void main(String args[]){
            Scanner scan=new Scanner(System.in);
            printTheHalfDiamond(scan.nextInt());
            scan.close();
        }
        public static void printTheHalfDiamond(int n){
            for(int i=0;i<n;++i){
                for(int j=0;j<n-i-1;++j)
                System.out.print(" ");
                for(int k=0;k<=i;++k)
                System.out.print("*");
                System.out.println();
            }
            printTheRemainingHalfDiamond(n-1);
        }
        public static void printTheRemainingHalfDiamond(int n){
            for(int i=n;i>0;--i){
                for(int j=n;j>=i;--j)
                System.out.print(" ");
                for(int k=1;k<=i;++k)
                System.out.print("*");
                System.out.println();
            }
        }
}


/*
    Output:
    patterns>javac leftHalfDiamond.java

patterns>java leftHalfDiamond
4
   *
  **
 ***
****
 ***
  **
   *

patterns>java leftHalfDiamond
5
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

patterns>java leftHalfDiamond
3
  *
 **
***
 **
  *

patterns>java leftHalfDiamond
10
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
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