import java.util.Scanner;
class butterfly{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printTheButterfly(scan.nextInt());
        scan.close();
    }
    public static void printTheButterfly(int n){
        int space=spaceCalculator(n);
        for(int i=0;i<n;++i){
            /* left wing */
            for(int j=0;j<=i;++j)
            System.out.print("*");
            /* left wing */

            /* body aka space */
            for(int k=0;k<space;++k)
            System.out.print(" ");
            /* body aka space */

            /* right wing */
            for(int l=0;l<=i;++l){
                if(i==n-1 && l==n-1)
                break;
                System.out.print("*");
            }
            /* right wing */

            System.out.println();                       //new line
            space-=2;  
        }
        printTheRemaining(n-1);
    }
    public static void printTheRemaining(int n){
        int space=1;
        for(int i=0;i<n;++i){
            /* left wing */
            for(int j=0;j<n-i;++j)
            System.out.print("*");
            /* left wing */

            /* space aka body */
            for(int k=0;k<space;++k)
            System.out.print(" ");
            /* space aka body */

            /* right wing */
            for(int l=0;l<n-i;++l)
            System.out.print("*");
            /* right wing */

            System.out.println();                       //new line
            space+=2;
        }
    }
    public static int spaceCalculator(int n){
        int space=0;
        for(int i=1;i<n;++i){
            if(i==1){
                space=1;
                continue;
            }
            space+=2;
        }
        return space;
    }
}

/* 
    Output:
    pattern>javac butterfly.java

pattern>java butterfly
3
*   *
** **
*****
** **
*   *

pattern>java butterfly
4
*     *
**   **
*** ***
*******
*** ***
**   **
*     *

pattern>java butterfly
5
*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *

pattern>java butterfly
8
*             *
**           **
***         ***
****       ****
*****     *****
******   ******
******* *******
***************
******* *******
******   ******
*****     *****
****       ****
***         ***
**           **
*             *

pattern>java butterfly
10
*                 *
**               **
***             ***
****           ****
*****         *****
******       ******
*******     *******
********   ********
********* *********
*******************
********* *********
********   ********
*******     *******
******       ******
*****         *****
****           ****
***             ***
**               **
*                 *
*/