import java.util.*;
class squareHollowDiamond {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printThe(scan.nextInt());
        scan.close();
    }    
    public static void printThe(int n){
        int space=1;

        System.out.print("**");
        printTheDummyLine(n);
        System.out.print("**");

        System.out.println();
        for(int i=0;i<n;++i){
            System.out.print("**");

            for(int j=0;j<n-i-1;++j)
            System.out.print("*");

            for(int k=0;k<space;++k)
            System.out.print(" ");

            for(int j=0;j<n-i-1;++j)
            System.out.print("*");

            System.out.println("**");
            space+=2;
        }

        printTheRemainingPart(n-1);

        System.out.print("**");
        printTheDummyLine(n);
        System.out.print("**");
    }
    public static void printTheRemainingPart(int n){
        int space=n+(n-1);
        for(int i=0;i<n;++i){
            System.out.print("**");
            for(int j=0;j<=i;++j)
            System.out.print("*");
            
            for(int k=0;k<space;++k)
            System.out.print(" ");
            
            for(int j=0;j<=i;++j)
            System.out.print("*");


            System.out.println("**");
            space-=2;
        }
    }
    public static void printTheDummyLine(int n){
        n=(2*n)-1;
        for(int i=0;i<n;++i)
        System.out.print("*");
    }
}


/*
Sample Output (manually drawn :) )
    5
    *********
    **** ****
    ***   ***
    **     **
    ***   ***
    **** ****
    *********
*/

/*
    calculating upper and bottom stars
    n = n-1 + 1 + n-1 ;
      => 2(n-1) + 1
      => 2n - 2 + 1
      => 2n - 1
*/

/*
    *
   ***
  *****
 *******
  *****
   ***
    *    
*/

/*
    Output:
    patterns>javac squareHollowDiamond.java

patterns>java squareHollowDiamond
5
*************
****** ******
*****   *****
****     ****
***       ***
**         **
***       ***
****     ****
*****   *****
****** ******
*************
patterns>java squareHollowDiamond
4
***********
***** *****
****   ****
***     ***
**       **
***     ***
****   ****
***** *****
***********
patterns>java squareHollowDiamond
3
*********
**** ****
***   ***
**     **
***   ***
**** ****
*********
patterns>java squareHollowDiamond
10
***********************
*********** ***********
**********   **********
*********     *********
********       ********
*******         *******
******           ******
*****             *****
****               ****
***                 ***
**                   **
***                 ***
****               ****
*****             *****
******           ******
*******         *******
********       ********
*********     *********
**********   **********
*********** ***********
***********************
patterns>java squareHollowDiamond
18
***************************************
******************* *******************
******************   ******************
*****************     *****************
****************       ****************
***************         ***************
**************           **************
*************             *************
************               ************
***********                 ***********
**********                   **********
*********                     *********
********                       ********
*******                         *******
******                           ******
*****                             *****
****                               ****
***                                 ***
**                                   **
***                                 ***
****                               ****
*****                             *****
******                           ******
*******                         *******
********                       ********
*********                     *********
**********                   **********
***********                 ***********
************               ************
*************             *************
**************           **************
***************         ***************
****************       ****************
*****************     *****************
******************   ******************
******************* *******************
***************************************
*/