import java.util.*;
public class halfDiamond {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        printTheHalfDiamond(scan.nextInt());
        scan.close();
    }
    public static void printTheHalfDiamond(int n){
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j)
            System.out.print("*");
            System.out.println();
        }
        printTheRemainningHalfDiamond(n-1);
    }
    public static void printTheRemainningHalfDiamond(int n){
        for(int i=n;i>0;--i){
            for(int j=0;j<i;++j)
            System.out.print("*");
            System.out.println();
        }
    }
}


/*
    Output
    patterns>java halfDiamond
4
*
**
***
****
***
**
*

patterns>java halfDiamond
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

patterns>java halfDiamond
11
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
***********
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