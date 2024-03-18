import java.util.*;
class numberXPattern{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printThePattern(scan.nextInt());
        scan.close();
    }
    public static void printThePattern(int n){
        int backward=n,forward=1,centerSpace=n-2;
        for(int i=0;i<=n/2;++i){
            /* front space */
            for(int j=0;j<i;++j)
            System.out.print(" ");
            /* front space */
            System.out.print(backward--);

            /* center space */
            for(int k=0;k<centerSpace;++k)
            System.out.print(" ");
            /* center space */

            if(i==(n/2)){
                System.out.println();
                continue;
            }
            System.out.println(forward++);
            centerSpace-=2;
        }
        printTheRemainingPart(n,backward,++forward);
    }
    public static void printTheRemainingPart(int n,int backward,int forward){
        int centerSpace=1;
        for(int i=0;i<n/2;++i){
            /* front space */
            for(int j=(n/2)-1;j>i;--j)
            System.out.print(" ");
            /* front space */

            System.out.print(forward++);

            /* center space */
            for(int k=0;k<centerSpace;++k)
            System.out.print(" ");
            /* center space */

            System.out.println(backward--);
            centerSpace+=2;
        }
    }
}

/*
    Output
    patterns>javac numberXPattern.java

patterns>java numberXPattern
1
1

patterns>java numberXPattern
3
3 1
 2
3 1

patterns>java numberXPattern
5
5   1
 4 2
  3
 4 2
5   1

patterns>java numberXPattern
7
7     1
 6   2
  5 3
   4
  5 3
 6   2
7     1

patterns>java numberXPattern
9
9       1
 8     2
  7   3
   6 4
    5
   6 4
  7   3
 8     2
9       1

patterns>java numberXPattern
8
8      1
 7    2
  6  3
   54
    4
   6 3
  7   2
 8     1
9       0

patterns>java numberXPattern
11
11         1
 10       2
  9     3
   8   4
    7 5
     6
    7 5
   8   4
  9     3
 10       2
11         1

patterns>java numberXPattern
21
21                   1
 20                 2
  19               3
   18             4
    17           5
     16         6
      15       7
       14     8
        13   9
         12 10
          11
         12 10
        13   9
       14     8
      15       7
     16         6
    17           5
   18             4
  19               3
 20                 2
21                   1

patterns>
*/