import java.util.*;
class xPattern{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printTheXPattern(scan.nextInt());
        scan.close();
    }
    public static void printTheXPattern(int n){
        int space=calculateTheSpace(n);
        for(int i=0;i<n;++i){
            /* left space */
            for(int k=0;k<i;++k)
            System.out.print(" ");
            /* left space */
            System.out.print("*");
            for(int j=0;j<space;++j)
            System.out.print(" ");
            if(i==n-1)
            continue;
            System.out.println("*");
            space-=2;
        }
        System.out.println();
        printTheRemainingPart(n-1);
    }
    public static void printTheRemainingPart(int n){
        int space=1;
        for(int i=0;i<n;++i){
            /* left space */
            for(int j=0;j<n-i-1;++j)
            System.out.print(" ");
            /* left space */

            System.out.print("*");

            /* space */
            for(int k=0;k<space;++k)
            System.out.print(" ");
            /* space */

            System.out.println("*");
            space+=2;
        }
    }
    public static int calculateTheSpace(int n){
        if(n==1)
        return 0;
        int space=1;
        for(int i=2;i<n;++i)
        space+=2;
        return space;
    }
}

/*
    Output:
    patterns>javac xPattern.java

patterns>java xPattern
3
*   *
 * *
  *
 * *
*   *

patterns>java xPattern
5
*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *

patterns>java xPattern
6
*         *
 *       *
  *     *
   *   *
    * *
     *
    * *
   *   *
  *     *
 *       *
*         *

patterns>java xPattern
10
*                 *
 *               *
  *             *
   *           *
    *         *
     *       *
      *     *
       *   *
        * *
         *
        * *
       *   *
      *     *
     *       *
    *         *
   *           *
  *             *
 *               *
*                 *

patterns>java xPattern
22
*                                         *
 *                                       *
  *                                     *
   *                                   *
    *                                 *
     *                               *
      *                             *
       *                           *
        *                         *
         *                       *
          *                     *
           *                   *
            *                 *
             *               *
              *             *
               *           *
                *         *
                 *       *
                  *     *
                   *   *
                    * *
                     *
                    * *
                   *   *
                  *     *
                 *       *
                *         *
               *           *
              *             *
             *               *
            *                 *
           *                   *
          *                     *
         *                       *
        *                         *
       *                           *
      *                             *
     *                               *
    *                                 *
   *                                   *
  *                                     *
 *                                       *
*                                         *
*/