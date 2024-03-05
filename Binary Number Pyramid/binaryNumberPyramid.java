import java.util.*;
public class binaryNumberPyramid {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printThePyramid(scan.nextInt());
        scan.close();
    }
    public static void printThePyramid(int n){
        for(int i=0;i<n;++i){
            int start=1;
            for(int j=0;j<n-i-1;++j)
            System.out.print(" ");
            for(int k=0;k<=i;++k){
                if(start==1){
                    System.out.print("0 ");
                    start=0;
                }
                else{
                    System.out.print("1 ");
                    start=1;
                }
            }
            System.out.println();
        }
    }
}

/*
    Output
    patterns>javac binaryNumberPyramid.java

patterns>java binaryNumberPyramid
5
    0
   0 1
  0 1 0
 0 1 0 1
0 1 0 1 0

patterns>java binaryNumberPyramid
3
  0
 0 1
0 1 0

patterns>java binaryNumberPyramid
7
      0
     0 1
    0 1 0
   0 1 0 1
  0 1 0 1 0
 0 1 0 1 0 1
0 1 0 1 0 1 0

patterns>java binaryNumberPyramid
9
        0
       0 1
      0 1 0
     0 1 0 1
    0 1 0 1 0
   0 1 0 1 0 1
  0 1 0 1 0 1 0
 0 1 0 1 0 1 0 1
0 1 0 1 0 1 0 1 0

patterns>java binaryNumberPyramid
10
         0
        0 1
       0 1 0
      0 1 0 1
     0 1 0 1 0
    0 1 0 1 0 1
   0 1 0 1 0 1 0
  0 1 0 1 0 1 0 1
 0 1 0 1 0 1 0 1 0
0 1 0 1 0 1 0 1 0 1
*/
