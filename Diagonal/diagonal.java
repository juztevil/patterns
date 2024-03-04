import java.util.*;
class diagonal{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printTheDiagonal(scan.nextInt());
        scan.close();
    }
    public static void printTheDiagonal(int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i-1;++j)
            System.out.print(" ");
            System.out.println("*");
        }
    }
}

/*
    Output
    patterns>javac diagonal.java

patterns>java diagonal
1
*

patterns>java diagonal
4
   *
  *
 *
*

patterns>java diagonal
5
    *
   *
  *
 *
*

patterns>java diagonal
9
        *
       *
      *
     *
    *
   *
  *
 *
*

patterns>java diagonal
20
                   *
                  *
                 *
                *
               *
              *
             *
            *
           *
          *
         *
        *
       *
      *
     *
    *
   *
  *
 *
*
*/