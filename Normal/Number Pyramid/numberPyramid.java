import java.util.*;
class numberPyramid{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printThePyramid(scan.nextInt());
        scan.close();
    }
    public static void printThePyramid(int n){
        int start=1;
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i-1;++j)
            System.out.print(" ");
            
            for(int k=1;k<=start;++k)
            System.out.print(k);

            for(int l=start-1;l>=1;--l)
            System.out.print(l);

            System.out.println();
            ++start;
        }
    }
}

/*
    Output
    patterns>javac numberPyramid.java

patterns>java numberPyramid
4
   1
  121
 12321
1234321

patterns>java numberPyramid
5
    1
   121
  12321
 1234321
123454321

patterns>java numberPyramid
10
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
12345678910987654321
*/