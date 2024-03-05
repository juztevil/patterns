import java.util.*;
class invertedNumberPyramid{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printThePyramid(scan.nextInt());
        scan.close();
    }
    public static void printThePyramid(int n){
        for(int i=n;i>0;--i){
            for(int j=i;j<n;++j)
            System.out.print(" ");
            for(int k=1;k<=i;++k)
            System.out.print(k);
            for(int l=i-1;l>=1;--l)
            System.out.print(l);
            System.out.println();
        }
    }
}

/*
    Output:
    patterns>javac invertedNumberPyramid.java

patterns>java invertedNumberPyramid
4
1234321
 12321
  121
   1

patterns>java invertedNumberPyramid
9
12345678987654321
 123456787654321
  1234567654321
   12345654321
    123454321
     1234321
      12321
       121
        1

patterns>java invertedNumberPyramid
5
123454321
 1234321
  12321
   121
    1
*/